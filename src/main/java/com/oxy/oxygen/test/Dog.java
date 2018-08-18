package com.oxy.oxygen.test;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Nameable{

	@Override
	public String getName() {
		return "Pinky";
	}

}
