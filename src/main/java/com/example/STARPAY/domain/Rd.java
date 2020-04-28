package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Rd_user")
public class Rd {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;
	
	@OneToMany
	private Set<StarPayUser> starPayUser; 
	@Column(name = "RdBusiness")
	private String RdBusiness;
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
	
//	@OneToMany
//	private Set<Address> address;
//
	

//	public Set<StarPayUser> getStarPayUser() {
//		return starPayUser;
//	}
//
//	public void setStarPayUser(Set<StarPayUser> starPayUser) {
//		this.starPayUser = starPayUser;
//	}
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	public String getRdBusiness() {
		return RdBusiness;
	}

	public void setRdBusiness(String rdBusiness) {
		RdBusiness = rdBusiness;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getBusinessEmail() {
		return BusinessEmail;
	}

	public void setBusinessEmail(String businessEmail) {
		BusinessEmail = businessEmail;
	}

	public String getBusinessMobileNumber() {
		return BusinessMobileNumber;
	}

	public void setBusinessMobileNumber(String businessMobileNumber) {
		BusinessMobileNumber = businessMobileNumber;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

//	public Set<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(Set<Address> address) {
//		this.address = address;
//	}
	

}
