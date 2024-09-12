package org.jsp.app.rapo;

import java.util.Optional;

import org.jsp.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByEmail(String email);


}
