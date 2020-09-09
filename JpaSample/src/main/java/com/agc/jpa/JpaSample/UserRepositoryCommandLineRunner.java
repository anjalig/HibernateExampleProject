package com.agc.jpa.JpaSample;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.agc.jpa.JpaSample.entity.User;
import com.agc.jpa.JpaSample.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill","Admin");
		userRepository.save(user);
		log.info("New User created: "+user);
		Optional<User> userWithIdone = userRepository.findById(1L);
		log.info("User is retrieved: " + userWithIdone);
		List<User> users = userRepository.findAll();
		log.info("All Users :"+ users);
	}
	
	

}
