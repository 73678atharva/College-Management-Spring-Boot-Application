package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	public Student findByFirstName(String firstName);
	
	@Query("SELECT s FROM Student s JOIN s.user u WHERE u.username = :userName")
	Student findStudentByUserName(@Param("userName") String userName);

}
