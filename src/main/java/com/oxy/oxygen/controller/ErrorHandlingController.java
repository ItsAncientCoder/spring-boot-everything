package com.oxy.oxygen.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorHandlingController implements ErrorController {

	public static final String PATH = "/error";

	@RequestMapping(value = PATH, method = RequestMethod.GET, produces = "text/html")
	public String error(Model model) {
		model.addAttribute("mani", "No Mapping found for the above url");
		return "Ooops";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
