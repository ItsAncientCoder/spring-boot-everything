package com.oxy.oxygen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(value= {"/welcome","/welcome/wel"})
	public String welcome() {
		return "Welcome to welcome controller.";
	}
}
