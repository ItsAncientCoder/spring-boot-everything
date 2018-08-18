package com.oxy.oxygen.service;

import com.oxy.oxygen.model.Country;

public interface CountryService {

	public Iterable<Country> findAllCountires();

	public Country addCountry(Country country);
	
}
