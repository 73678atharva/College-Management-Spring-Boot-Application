package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Teacher;
import com.app.entity.TeacherDTO;
import com.app.service.TeacherService;

@RestController
@RequestMapping("/teacher/")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
		
	@GetMapping("/{id}")
	public ResponseEntity<TeacherDTO> getTeacher(@PathVariable String id){	
		TeacherDTO teacherDto = teacherService.getSingleTeacher(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(teacherDto);
	}
	
	@PutMapping("/update")
	public ResponseEntity<TeacherDTO> updateExistingTeacher(@RequestBody Teacher teacher){
		TeacherDTO updatedTeacher = teacherService.updateTeacher(teacher);
		return ResponseEntity.status(HttpStatus.OK).body(updatedTeacher);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteSingleTeacher(@PathVariable String id){
		String response = teacherService.deleteTeacher(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
} 
