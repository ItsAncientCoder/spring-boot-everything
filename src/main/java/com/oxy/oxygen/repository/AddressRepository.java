package com.oxy.oxygen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oxy.oxygen.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}