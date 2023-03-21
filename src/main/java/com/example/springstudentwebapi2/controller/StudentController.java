package com.example.springstudentwebapi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springstudentwebapi2.entity.Student;
import com.example.springstudentwebapi2.services.StudentService;

@RestController
public class StudentController {
	
	
		private StudentService studentService;

		public StudentController(@Autowired StudentService studentService) {
			this.studentService = studentService;
		}

		@GetMapping("/student")
		public List<Student> getAllStudents() {
			return (List<Student>) studentService.all();

		}

		@GetMapping("/student/{id}")
		public Student findById(@PathVariable("id") String id) {
			return ((StudentController) studentService).findById(id);

		}

		@PostMapping("/student")
		public Student save(@RequestBody Student student) {
			return studentService.save(student);
		}

		@DeleteMapping("/student/{id}")
		public void delete(@PathVariable int id) {
			studentService.delete(id);

		}

		@PutMapping("/student")
		public Student update(@RequestBody Student student) {
			return studentService.save(student);
		}
	}



