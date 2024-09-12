package org.jsp.app.userentity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaOService {
	private static int i=0;
	private static List<UserEntity> users=new ArrayList<>();
	static {
		users.add(new UserEntity(++i,"venky",LocalDate.now().minusYears(23)));
		users.add(new UserEntity(++i,"sudheer",LocalDate.now().minusYears(23)));
		users.add(new UserEntity(++i,"niteesh",LocalDate.now().minusYears(23)));
		users.add(new UserEntity(++i,"naveen",LocalDate.now().minusYears(23)));
	}
	public List<UserEntity> findAll(){
		return users;
	}
	public List<UserEntity> findAllById(int id) {
		List<UserEntity> li=new ArrayList<>();
		for(UserEntity ue:users) {
			if(ue.getId()==id) {
				li.add(ue);
			}
		}
		return li;
	}
	public void saveUser(UserEntity ue) {
		ue.setId(++i);
		users.add(ue);
	}
	
	public UserEntity findById(int id) {
		for(UserEntity ue:users) {
			if(ue.getId()==id) {
				return ue;
			}
		}
		return null;
	}
	public void deleteById(int id) {
//		for(UserEntity ue:users) {
//			if(ue.getId()==id) {
//				users.remove(users.indexOf(ue));
//				return;
//			}
//		}
		users.remove(users.indexOf(findById(id)));
	}
}
