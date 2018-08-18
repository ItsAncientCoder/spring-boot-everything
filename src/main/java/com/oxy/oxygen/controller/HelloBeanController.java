package com.oxy.oxygen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oxy.oxygen.model.HelloBean;

@Controller
public class HelloBeanController {

	@Autowired
	private HelloBean helloBean;

	@Bean
	public HelloBean getHelloBean() {
		return new HelloBean();
	}

	@RequestMapping(value="/beanBoot")
	@ResponseBody
	public String helloBeanAccessing() {
		helloBean.setMessage("Setting bean message");
		return helloBean.getMessage();
	}

}
