package com.marcuschiu.aspectorientedprogramming;

import com.marcuschiu.aspectorientedprogramming.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectOrientedProgrammingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
	}


	@Autowired
	private BusinessService businessService;

	@Override
	public void run(String...args) throws Exception {
		businessService.serve();
		businessService.serve();
		businessService.serve();
	}
}
