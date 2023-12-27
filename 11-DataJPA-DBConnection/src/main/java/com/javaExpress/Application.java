package com.javaExpress;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javaExpress.models.User;
import com.javaExpress.repositories.UserRepository;

@SpringBootApplication
public class Application {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		saveUserInfo(userRepository);
//		retriveAll(userRepository);
//		getInfo(userRepository,9);
//		getInfo(userRepository,6);
//		updateExistingRecod(userRepository);
		
		userRepository.getById(1);
		
		
	
	}

	/*private static void updateExistingRecod(UserRepository userRepository) {
		User user =getInfo(userRepository,1);
		user.setPassword("oio");
		user.setPhone("0000");
		userRepository.save(user);
	}
	
	private static User getInfo(UserRepository userRepository,Integer id) {
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			System.out.println(optional.get());
			return optional.get();
		} else {
			System.out.println("Record is not found");
			return null;
		}
	*/

	/*private static void getInfo(UserRepository userRepository,Integer id) {
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("Record is not found");
		}*/
	}

	/*
	 * private static void retriveAll(UserRepository userRepository) { List<User>
	 * lis = userRepository.findAll(); lis.stream().forEach(user
	 * ->System.out.println(user)); }
	 */

//	private static void saveUserInfo(UserRepository userRepository) {
	/*
	 * User user=new User(); user.setEmailId("Sa@gmail.com");
	 * user.setPassword("S@123"); user.setPhone("098765");
	 * userRepository.save(user);
	 */

	/*
	 * User user1=new User(); user1.setEmailId("re@gmail.com");
	 * user1.setPassword("r@123"); user1.setPhone("567");
	 * userRepository.save(user1);
	 */


