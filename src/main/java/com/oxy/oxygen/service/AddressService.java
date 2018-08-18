package com.oxy.oxygen.service;

import java.util.List;

import com.oxy.oxygen.model.Address;

public interface AddressService {

	List<Address> findAddressList();
	
	Address addAddress(Address address);
	
	Address findAddress(Long id);
	
	String deleteAddress(Long id);
}
