package com.catwar.dto.userDTO;

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
public class SignUpDTO {
	
	private String name;
	private String password;
	private String email;

}
