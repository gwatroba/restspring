package pl.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

import pl.learning.model.User;
import pl.learning.service.UserService;

@RestController
public class AppRestController {
	
	 @Autowired
	 UserService userService;
	
	 @RequestMapping(value = "/user", method = RequestMethod.GET)
	 public List<User> listAllUsers() {
		 List<User> users = userService.findAllUsers();
		 return users;
	 }
	 
	 @RequestMapping(value = "/user", method = RequestMethod.POST)
	 public void createUser(@RequestBody User user) {
		 userService.saveUser(user);
	 }
	 
}
