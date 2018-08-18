package com.oxy.oxygen.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

	@Autowired
	NameHelper nameHelper;
	
	@RequestMapping(value="/name")
	public String name(@RequestParam String type) {
		return nameHelper.getName(type);
	}
}
