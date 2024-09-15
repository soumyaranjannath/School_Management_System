package com.achiever.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Column(name="sname")
	private String sName;
	@Id
	@Column(name="srollno")
	private Integer sRollNo;
	@Column(name="sage")
	private Integer sAge;
	@Column(name="sclass")
	private String sClass;
	@Lob
	@Column(name="sphoto",columnDefinition = "MEDIUMBLOB")
	private byte[] photo;
}
