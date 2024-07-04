package com.in07minutes.restful_webservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> userList = new ArrayList<>();
	private static int count=0;
	
	static {
		userList.add(new User(++count, "Dinesh", LocalDate.now().minusYears(35)));
		userList.add(new User(++count, "Kailash", LocalDate.now().minusYears(63)));
		userList.add(new User(++count, "Tanu", LocalDate.now().minusYears(7)));
		userList.add(new User(++count, "Niku", LocalDate.now().minusYears(1)));
	}
	
	public List<User> getUsers(){
		return userList;
	}

	public User getUser(int id) {
		return userList.stream().filter(user -> user.getId()==id).findFirst().get();
	}
	
	public User save(User user) {
		user.setId(++count);
		userList.add(user);
		return user;
	}
}
