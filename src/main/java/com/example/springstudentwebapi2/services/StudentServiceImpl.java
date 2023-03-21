package com.example.springstudentwebapi2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springstudentwebapi2.entity.Student;
import com.example.springstudentwebapi2.repository.StudentRepository;

@Service
	public class StudentServiceImpl implements StudentService {

		
		private StudentRepository studentRepository;

		public StudentServiceImpl(@Autowired StudentRepository studentRepository) {
			this.studentRepository = studentRepository;
		}

		@Override
		public Iterable<Student> all() {
			return studentRepository.findAll();
		}

		@Override
		public Student get(int studentId) {
			return studentRepository.findById(studentId);
		}

		@Override
		public Student save(Student student) {
			return studentRepository.save(student);
		}

		@Override
		public void delete(int studentId) {
			studentRepository.deleteById(studentId);
		}

	}

