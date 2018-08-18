package com.oxy.oxygen.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="namehelper")
public class NameHelper {

	private Nameable person;
	private Nameable dog;

	public String getName(String type) {

		switch (type) {
		case "person":
			return person.getName();
		case "dog":
			return dog.getName();
		default:
			return "UNKNOWN";
		}
	}

	@Autowired
	public void setPerson(Nameable person) {
		this.person = person;
	}

	@Autowired
	public void setDog(Nameable dog) {
		this.dog = dog;
	}

	
}
