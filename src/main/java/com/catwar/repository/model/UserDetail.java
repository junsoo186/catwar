package com.catwar.repository.model;

import java.sql.Timestamp;

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
public class UserDetail {
	private Integer userId;
	private Integer detailId;
	private String nickName;
	private Timestamp createdAt;
}
