package com.catwar.repository.interfaces;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.repository.model.UserDetail;

@Mapper
public interface UserDetailRepository {
	
	public int insertNewNickName( newNickNameDTO dto);
	public UserDetail selectByUserIdAndDetailId(@Param("userId") Integer userId, @Param("detailId") Integer detailId);
}
