package com.oxy.oxygen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxy.oxygen.model.Country;
import com.oxy.oxygen.repository.CountryRepository;
import com.oxy.oxygen.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	private CountryRepository countryRepository;

	@Override
	public Iterable<Country> findAllCountires() {
		return countryRepository.findAll();
	}

	@Override
	public Country addCountry(Country country) {
		return countryRepository.save(country);
	}
}