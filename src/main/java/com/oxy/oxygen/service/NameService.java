package com.oxy.oxygen.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.oxy.oxygen.model.Name;

public interface NameService {

	public Name AddName(Name name);
	public ResponseEntity<Name> findName(Long id);
	public List<Name> findAllNames();
	
}
