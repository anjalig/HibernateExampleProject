package com.agc.jpa.JpaSample.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agc.jpa.JpaSample.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
