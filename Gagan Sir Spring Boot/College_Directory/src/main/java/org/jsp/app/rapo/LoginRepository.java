package org.jsp.app.rapo;

import java.util.Optional;

import org.jsp.app.entity.LoginDetails;
import org.jsp.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository<Users, Integer> {
	
	@Query("select u from Users u where email=:email and password=:password")
	Optional<Users> findByEmailPassword(String email,String password);

}
