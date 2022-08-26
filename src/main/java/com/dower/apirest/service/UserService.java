package com.dower.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dower.apirest.entity.User;
import com.dower.apirest.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
		
	}
	
	public User getUsuario(Integer id) {
		return userRepository.getById(id);
	}
	
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}

}
