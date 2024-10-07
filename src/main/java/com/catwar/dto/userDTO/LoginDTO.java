package com.catwar.dto.userDTO;

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
public class LoginDTO {
	
	private String password;
	private String email;
	
}
