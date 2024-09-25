package com.achiever.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentLoginRequest {
	
	private Integer rollNo;
	private Integer pwd;
	

}
