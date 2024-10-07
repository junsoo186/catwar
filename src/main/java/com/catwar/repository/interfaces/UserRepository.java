package com.catwar.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.catwar.dto.userDTO.LoginDTO;
import com.catwar.dto.userDTO.SignUpDTO;
import com.catwar.repository.model.User;

@Mapper
public interface UserRepository {
	
	  public User trylogin(LoginDTO dto);
	  public int joinUser(SignUpDTO dto);
}
