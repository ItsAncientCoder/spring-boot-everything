package com.oxy.oxygen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oxy.oxygen.model.Thyme;

@Controller
public class ThymeController {

	@RequestMapping(value = "/thyme", method = RequestMethod.POST)
	public ModelAndView thyme(@ModelAttribute Thyme thyme) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("thyme-data");
		mav.addObject(thyme);
		return mav;
	}

}
