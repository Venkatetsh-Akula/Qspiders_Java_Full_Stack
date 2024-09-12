package org.jsp.app.service;

import org.jsp.app.daointerface.AdministratorDaoInterface;
import org.jsp.app.entity.Administrator;
import org.jsp.app.exception.InvalidData;
import org.jsp.app.exception.NoAdministratorFound;
import org.jsp.app.serviceinterface.AdministratorServiceInterface;
import org.jsp.app.structure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService implements AdministratorServiceInterface{
	
	@Autowired
	private AdministratorDaoInterface administratordao;

	@Override
	public ResponseEntity<?> serviceFindAllAdministrators(){ 
		List<Administrator> administratorli=administratordao.daoFindAllAdministrator();
		if(administratorli.size()==0) {
			throw NoAdministratorFound.builder().message("No Administrator").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("List Of Administrator").body(administratorli).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceAdministratorById(int id) {
		Optional<Administrator> administrator=administratordao.daoFindAdministratorById(id);
		if(administrator.isEmpty()) {
			throw NoAdministratorFound.builder().message("No Administrator based on Id").build();
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Administrator Found").body(administrator).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceSaveAdministrator(Administrator administrator) {
		if(administrator==null) {
			throw InvalidData.builder().message("Data Insufficent").build();
		}
		else {
			Administrator admin=administratordao.daoSaveAdministrator(administrator);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Administrator Saved").body(admin).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceDeleteById(int id) {
		Optional<Administrator> administrator=administratordao.daoFindAdministratorById(id);
		if(administrator.isEmpty()) {
			throw NoAdministratorFound.builder().message("No Administrator based on Id").build();
		}
		else {
			administratordao.daoDeleteAdministratorById(id);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Administrator Deleted Successfully").body(administrator).build());
		}
	}

	@Override
	public ResponseEntity<?> serviceUpdateAdministrator(int id, Administrator administrator) {
		Optional<Administrator> admin=administratordao.daoFindAdministratorById(id);
		if(admin.isEmpty()) {
			throw NoAdministratorFound.builder().message("No Administrator based on Id").build();
		}
		else {
			Administrator updateadmin=administratordao.daoSaveAdministrator(administrator);
			return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpcode(HttpStatus.OK.value())
					.message("Administrator Updated Successfully").body(administrator).build());
		}
	}

}
