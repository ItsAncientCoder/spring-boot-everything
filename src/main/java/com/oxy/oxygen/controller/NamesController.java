package com.oxy.oxygen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxy.oxygen.model.Name;
import com.oxy.oxygen.service.NameService;

@RestController
@RequestMapping(value = "/names")
public class NamesController {

	private NameService nameService;

	@Autowired
	public NamesController(NameService nameService) {
		this.nameService = nameService;
	}

	@RequestMapping(value = "/add")
	public Name addName(@RequestBody Name name) {
		return nameService.AddName(name);
	}

	@RequestMapping(value = "/list/{id}")
	public ResponseEntity<Name> findName(@PathVariable Long id) {
		return nameService.findName(id);
	}

	@RequestMapping(value = "/list")
	public List<Name> findAllNames() {
		return nameService.findAllNames();
	}
}
