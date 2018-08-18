package com.oxy.oxygen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.oxy.oxygen.model.Name;
import com.oxy.oxygen.repository.NameRepository;
import com.oxy.oxygen.service.NameService;

@Service
public class NameServiceImpl implements NameService {

	private NameRepository nameRepository;

	@Autowired
	public NameServiceImpl(NameRepository nameRepository) {
		this.nameRepository = nameRepository;
	}

	@Override
	public Name AddName(Name name) {
		return nameRepository.saveAndFlush(name);
	}

	@Override
	public ResponseEntity<Name> findName(Long id) {
		Name namePOJO = nameRepository.getOne(id);
		if (namePOJO == null) {
			return new ResponseEntity<Name>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Name>(HttpStatus.OK);
	}

	@Override
	public List<Name> findAllNames() {
		return nameRepository.findAll();
	}

}
