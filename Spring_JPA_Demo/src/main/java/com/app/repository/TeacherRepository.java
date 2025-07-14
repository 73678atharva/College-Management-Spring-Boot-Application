package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

	public Teacher findByFirstName(String name);
	
	@Query("SELECT t FROM Teacher t JOIN t.user u where u.username = :userName")
	Teacher findByUserName(@Param ("userName") String userName);
}
