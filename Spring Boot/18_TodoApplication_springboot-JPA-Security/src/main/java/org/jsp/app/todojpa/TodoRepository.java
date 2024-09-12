package org.jsp.app.todojpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoComponent, Integer> {

}
