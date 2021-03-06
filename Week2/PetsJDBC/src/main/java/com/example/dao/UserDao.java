package com.example.dao;

import java.util.List;

import com.example.model.User;

public interface UserDao {
	
	public void createUser(User u);
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
	
	public User getUserById(Integer id);
	
	public User getUserByUsername(String username);
	
	public List<User> getAllUsers();
	
	public void updateUserPrepared(User u);

}
