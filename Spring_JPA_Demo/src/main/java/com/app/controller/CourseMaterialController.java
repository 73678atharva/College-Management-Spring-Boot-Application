package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.CourseMaterial;
import com.app.entity.CourseMaterialDTO;
import com.app.service.CourseMaterialService;

@RestController
@RequestMapping("/admin/courseMaterial")
public class CourseMaterialController {

	@Autowired
	private CourseMaterialService courseMaterialService;
	
	@PostMapping("/")
	public ResponseEntity<CourseMaterialDTO> createNewCourseMaterial(@RequestBody CourseMaterial courseMaterial){
		CourseMaterialDTO newCourseMaterial = courseMaterialService.createCourseMaterial(courseMaterial);
		return ResponseEntity.status(HttpStatus.CREATED).body(newCourseMaterial);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CourseMaterialDTO> getSingleCourseMaterial(@PathVariable String id){
		CourseMaterialDTO existingCourseMaterial = courseMaterialService.getCourseById(Long.parseLong(id));
		return ResponseEntity.status(HttpStatus.FOUND).body(existingCourseMaterial); 
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCourseCourseSingleMaterial(@PathVariable String id){
		String message = courseMaterialService.deleteCourseMaterial(Long.parseLong(id));
		return ResponseEntity.status(HttpStatus.FOUND).body(message); 
	}
}
