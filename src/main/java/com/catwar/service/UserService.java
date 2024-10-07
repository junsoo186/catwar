package com.catwar.service;

import org.springframework.stereotype.Service;

import com.catwar.dto.userDTO.LoginDTO;
import com.catwar.dto.userDTO.SignUpDTO;
import com.catwar.repository.interfaces.UserRepository;
import com.catwar.repository.model.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	 private final UserRepository userRepository;
	 /**
	  * 로그인 기능 
	  * 로그인 DTO 구현 파라미터는 LoginDTO
	  * @param dto
	  * @return
	  */
	  public User login(LoginDTO dto) {
	        return userRepository.trylogin(dto);
	    }
	  
	  /**
	   * 회원가입 기능
	   * TODO 아직 비밀번호 암호 처리 안함
	   * @param dto
	   */
	  public int joinUser(SignUpDTO dto) {
		  int result = 0;
		  result = userRepository.joinUser(dto);
		  return result;
	  }
}