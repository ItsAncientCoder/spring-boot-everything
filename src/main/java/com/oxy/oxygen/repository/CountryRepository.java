package com.oxy.oxygen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oxy.oxygen.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
