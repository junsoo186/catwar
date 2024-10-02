package com.catwar.dto.gameDTO;

import java.sql.Timestamp;

import com.catwar.repository.model.UserDetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class newNickNameDTO {
	private Integer userId;
	private String nickName;

}
