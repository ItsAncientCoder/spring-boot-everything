package com.oxy.oxygen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oxy.oxygen.model.Address;
import com.oxy.oxygen.service.AddressService;

@Controller
@RequestMapping(value = "/address")
@Transactional
public class AddressController {

	private AddressService addressService;

	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}

	@ResponseBody
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public List<Address> findAddressList() {
		return addressService.findAddressList();
	}

	@ResponseBody
	@RequestMapping(value = "/add")
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}

	@ResponseBody
	@RequestMapping(value = "/delete/{id}")
	public String deleteAddress(@PathVariable Long id) {
		return addressService.deleteAddress(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/list/{id}")
	public Address findAddress(@PathVariable Long id) {
		
		if(id==0) {
			throw new RuntimeException("Something wrong with the input.");
		}
		return addressService.findAddress(id);
	}
}
