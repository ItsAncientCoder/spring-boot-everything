package com.oxy.oxygen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxy.oxygen.model.Country;
import com.oxy.oxygen.service.CountryService;

@RestController
@RequestMapping(value = "/country")
public class CountryController {

	private CountryService countryService;

	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}

	@RequestMapping(value = "/list")
	public Iterable<Country> findAllCounties() {
		return countryService.findAllCountires();
	}

	@RequestMapping(value = "/add")
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}
}