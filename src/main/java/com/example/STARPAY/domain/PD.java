package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="pd")
public class PD {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;
	
	@Column(name = "PdBusiness")
	private String PdBusiness;
	@Column(name = "CompanyName")
	private String CompanyName;
	@Column(name = "Business_Email")
	private String BusinessEmail;
	@Column(name = "B_mobile")
	private String BusinessMobileNumber;
	@Column(name = "DoB")
	private String DOB;
	@Column(name = "Status")
	private String Status;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "gender")
	private String gender;
	@Column(name = "isActive")
	private Boolean isActive;
	@Column(name = "birthplace")
	private String birthPlace;
	@Column(name = "nationality")
	private String nationality;

}
