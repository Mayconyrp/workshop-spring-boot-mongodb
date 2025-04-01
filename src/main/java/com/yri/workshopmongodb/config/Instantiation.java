package com.yri.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yri.workshopmongodb.domain.User;
import com.yri.workshopmongodb.repository.UserRepository;

@Component
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		
		User maria = new User(null,"Maria","maria@gmail.com");
		User thigas = new User(null,"Thigas","thigas@gmail.com");
		User yato = new User(null,"Yato","yato@gmail.com");

		userRepository.saveAll(Arrays.asList(maria,thigas,yato));
	}

}
