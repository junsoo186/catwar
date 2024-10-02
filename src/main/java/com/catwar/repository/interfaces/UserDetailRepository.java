package com.catwar.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;

import com.catwar.dto.gameDTO.newNickNameDTO;

@Mapper
public interface UserDetailRepository {
	
	public int insertNewNickName( newNickNameDTO dto);
}
