package com.oxy.oxygen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxy.oxygen.model.Address;
import com.oxy.oxygen.repository.AddressRepository;
import com.oxy.oxygen.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public List<Address> findAddressList() {
		return addressRepository.findAll();
	}

	@Override
	public Address addAddress(Address address) {
		//address.setUser(userRepository.getOne(address.getUserId()));
		return addressRepository.save(address);
	}

	@Override
	public Address findAddress(Long id) {
		return addressRepository.getOne(id);
	}

	@Override
	public String deleteAddress(Long id) {
		addressRepository.deleteById(id);
		return "Address is deleted sucessfully.!";
	}
}