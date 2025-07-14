package com.app.mapper;

import java.util.ArrayList;
import java.util.List;

import com.app.entity.Course;
import com.app.entity.Teacher;
import com.app.entity.TeacherDTO;
import com.app.entity.CourseDTO;
public class TeacherMapper {

	public static TeacherDTO convertTeacherToTeacherDTO(Teacher teacher){
		TeacherDTO teacherDTO = new TeacherDTO();
		teacherDTO.setId(teacher.getId());
		teacherDTO.setFirstName(teacher.getFirstName());
		teacherDTO.setLastName(teacher.getLastName());
		

		List<Course> courses = teacher.getCourses();
		List<CourseDTO> coursesToBeSaved = new ArrayList<>();
		if(courses != null) {
			for(Course course : courses) {
				coursesToBeSaved.add(StudentMapper.toCourseDTO(course));
			}
		}
		teacherDTO.setCourses(coursesToBeSaved);
		return teacherDTO;
	}
	
	public static Teacher convertTeacherDTOtoTeacher(TeacherDTO teacherDTO) {
		Teacher teacher = new Teacher();
		teacher.setFirstName(teacherDTO.getFirstName());
		teacher.setLastName(teacherDTO.getLastName());
		return teacher;
	}
}
