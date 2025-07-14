package com.app.service;

import com.app.entity.Teacher;
import com.app.entity.TeacherDTO;

public interface TeacherService {

	public String createTeacher(Teacher teacher);
	
	public TeacherDTO getCurrentTeacherDetails(String userName);
	
	public String deleteTeacher(String userName);
	
	public TeacherDTO updateTeacher(Teacher teacher);
}
