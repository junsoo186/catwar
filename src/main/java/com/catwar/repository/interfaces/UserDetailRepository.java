package com.catwar.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.repository.model.UserDetail;

@Mapper
public interface UserDetailRepository {
	
	public int insertNewNickName( newNickNameDTO dto);
	public UserDetail selectAllbyUserid();
}
