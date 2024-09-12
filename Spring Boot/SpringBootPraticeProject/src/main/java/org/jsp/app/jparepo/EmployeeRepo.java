package org.jsp.app.jparepo;

import org.jsp.app.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
		
}
