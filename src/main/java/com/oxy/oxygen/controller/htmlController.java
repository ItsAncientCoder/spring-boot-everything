package com.oxy.oxygen.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlController {

	@RequestMapping(value="/fromHtml")
	public String fromHtml(HttpServletRequest request) {
		Map map = new HashMap<>();
		map.put("mail", "mail");
		return "vens";
	}
}
