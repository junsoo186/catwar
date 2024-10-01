package com.catwar.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.catwar.repository.model.User;

@Mapper
public interface UserRepository {
	
	  public User trylogin(@Param("email") String email, @Param("password") String password);
	
}
