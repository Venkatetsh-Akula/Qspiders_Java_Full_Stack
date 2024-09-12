package org.jsp.app.repository;

import org.jsp.app.userentity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
	
}
