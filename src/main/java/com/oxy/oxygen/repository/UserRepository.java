package com.oxy.oxygen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oxy.oxygen.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
