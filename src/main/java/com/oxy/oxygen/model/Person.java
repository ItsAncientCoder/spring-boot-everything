package com.oxy.oxygen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="PERSON")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;

	@Autowired
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Autowired
	public Person() {
	}

	public String getLastName() {
		return lastName;
	}
}
