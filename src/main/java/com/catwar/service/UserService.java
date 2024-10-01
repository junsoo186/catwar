package com.catwar.service;

import org.springframework.stereotype.Service;

import com.catwar.dto.LoginDTO;
import com.catwar.repository.interfaces.UserRepository;
import com.catwar.repository.model.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	 private final UserRepository userRepository;
	 
	  public User login(LoginDTO loginDTO) {
	        return userRepository.trylogin(loginDTO.getEmail(), loginDTO.getPassword());
	    }
}