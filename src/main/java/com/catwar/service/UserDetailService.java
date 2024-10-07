package com.catwar.service;

import org.springframework.stereotype.Service;

import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.repository.interfaces.UserDetailRepository;
import com.catwar.repository.interfaces.UserRepository;
import com.catwar.repository.model.UserDetail;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailService {
	
	private final UserDetailRepository detailRepository;
	
	public int newNickName(Integer userId, newNickNameDTO dto) {
		int result = 0;
		dto.setUserId(userId);
		result = detailRepository.insertNewNickName(dto);
		return result;	
	}
	
	/**
	 * 유저가 플레이할 캐릭터 확인 
	 * @param userId
	 * @param detailId
	 * @return
	 */
	public UserDetail findDetailById (Integer userId, Integer detailId) {
		
		return detailRepository.selectByUserIdAndDetailId(userId, detailId);
	} 
	
	
}
