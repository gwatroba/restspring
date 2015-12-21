package pl.learning.service;

import java.util.List;

import pl.learning.model.User;

public interface UserService {

	List<User> findAllUsers();
	User findById(long id);
	void saveUser(User user);
	void deleteAllUsers();
}
