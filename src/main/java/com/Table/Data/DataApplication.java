package com.Table.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.Table.Data.Entities.User;
import com.Table.Data.Repository.Repo;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ApplicationContext context= 
	    SpringApplication.run(DataApplication.class, args);
		
		Repo repo =context.getBean(Repo.class);
		
		User user=  new User();
		user.setId(10);
		user.setName("Suvarna shivaji pujari");
		user.setCity("Pune");
		user.setStatus("I am java devloper");
		
		User user1= repo.save(user);
		System.out.println(user1);
	}

}
