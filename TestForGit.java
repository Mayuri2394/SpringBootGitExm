package com.example.demo.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestForGit implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello Spring boot !!!!!");

		System.out.println("hello Git Hub !!!!!");
                System.out.println("To test git add");
	}

}
