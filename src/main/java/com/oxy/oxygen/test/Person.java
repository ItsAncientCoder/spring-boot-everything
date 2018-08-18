package com.oxy.oxygen.test;

import org.springframework.stereotype.Component;

@Component
public class Person implements Nameable {

	@Override
	public String getName() {
		return "Puppy";
	}

}
