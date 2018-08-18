package com.oxy.oxygen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oxy.oxygen.model.Name;

public interface NameRepository extends JpaRepository<Name, Long>{

}
