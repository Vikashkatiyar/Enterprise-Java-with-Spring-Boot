package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootJpaExampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/*
		 * User user=new User(); user.setName("vikash"); user.setCity("Ghaziabd");
		 * user.setStatus("Java Programmer");
		 */
		
		/*
		 * User user1=new User(); user1.setName("waris"); user1.setCity("Ghaziabd");
		 * user1.setStatus("Data Programmer");
		 * 
		 * User user2=new User(); user2.setName("Vivek"); user2.setCity("Ghaziabd");
		 * user2.setStatus("Spring Programmer");
		 * 
		 * User user3=new User(); user3.setName("Arpit"); user3.setCity("Ghaziabd");
		 * user3.setStatus("Spring boot Programmer");
		 * 
		 * 
		 * List<User> users=List.of(user1,user2,user3); Iterable<User> result =
		 * userRepository.saveAll(users); result.forEach(user-> {
		 * System.out.println(user); }); System.out.println("success");
		 */
		
		
		/*
		 * single object data saving User user1 = userRepository.save(user);
		 * System.out.println(user1 );
		 */
		
		List<User> allUsers = userRepository.getAllUsers();
		allUsers.forEach(e->{
			System.out.println(e);
		});
		
	}

}
