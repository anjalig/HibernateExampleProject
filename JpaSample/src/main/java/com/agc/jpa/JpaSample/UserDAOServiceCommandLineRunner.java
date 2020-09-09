package com.agc.jpa.JpaSample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.agc.jpa.JpaSample.entity.User;
import com.agc.jpa.JpaSample.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class); 
	@Autowired
	private UserDAOService userdaoservice;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Anjali", "Admin");
		long insert = userdaoservice.insert(user);
		log.info("New user is created: " + user);
	}

}
