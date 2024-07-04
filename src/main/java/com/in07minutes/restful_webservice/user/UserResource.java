package com.in07minutes.restful_webservice.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	/*
	 * @Autowired UserDaoService userDaoService;
	 */
	
	private UserDaoService userDaoService;
	
	public UserResource(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}
	
	@GetMapping(path = "/users")
	public List<User> getUsers(){
		return  userDaoService.getUsers();
	}
	
	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable int id){
		return  userDaoService.getUser(id);
	}
	
	@PostMapping(path = "/users")
	public void createUser(@RequestBody User user){
		userDaoService.save(user);
	}
}
