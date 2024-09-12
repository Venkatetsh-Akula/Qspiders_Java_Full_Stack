package org.jsp.app.rapo;

import org.jsp.app.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>{

}
