package com.catwar.service;

import org.springframework.stereotype.Service;

import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.repository.interfaces.UserDetailRepository;
import com.catwar.repository.interfaces.UserRepository;

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
	
	
}
