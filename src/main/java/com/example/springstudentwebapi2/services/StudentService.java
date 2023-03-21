package com.example.springstudentwebapi2.services;



import com.example.springstudentwebapi2.entity.Student;

public interface StudentService {

	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );

}

