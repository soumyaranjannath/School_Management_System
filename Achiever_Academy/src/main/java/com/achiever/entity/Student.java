package com.achiever.entity;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String sName;
	private Long sRollNo;
	private Integer sAge;
	private String sClass;
	private byte[] photo;
}
