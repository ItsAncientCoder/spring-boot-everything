package com.oxy.oxygen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oxy.oxygen.model.Name;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Name m() {

		Name name = new Name();
		name.setId(1L);
		name.setName("bandham");
		return name;
	}
}
