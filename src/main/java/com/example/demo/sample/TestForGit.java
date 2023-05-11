package com.example.demo.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestForGit implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello Spring boot !!!!!");
		System.out.println("this line is changed1");
		System.out.println("this line is changed by anothter developer");
<<<<<<< HEAD
		System.out.println("this line is channged form dev branch");
=======
		System.out.println("this changes are done in master ");
		
>>>>>>> 20335089df5f5ba5ab3ddb43281ac0922edaed18
		
                
	}

}
