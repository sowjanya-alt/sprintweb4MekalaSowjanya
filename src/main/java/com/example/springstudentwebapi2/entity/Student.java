package com.example.springstudentwebapi2.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "student")

public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id_student")
	private int id;

	private String name;

	private String email;

	private String address;

	
	private Date birthDate;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Student() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}