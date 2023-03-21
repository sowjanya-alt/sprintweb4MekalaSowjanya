package com.example.springstudentwebapi2.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.springstudentwebapi2.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

    Student findById( int id );


}