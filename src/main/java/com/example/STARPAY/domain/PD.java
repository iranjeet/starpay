package com.example.STARPAY.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pd")
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
	@Column(name = "isActive", columnDefinition = "tinyint(1) default 1")
	private Boolean isActive = true;
	@Column(name = "birthplace")
	private String birthPlace;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "CanEdit", columnDefinition = "tinyint(0) default 0")
	private Boolean canEdit = false;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pd", cascade = CascadeType.ALL)
	private Set<StarPayUser> starPayUser;
	@Column(name = "acess", columnDefinition = "varchar(255) default 'VIEW'")
	@Enumerated(EnumType.STRING)
	private AccessType acess;
	
	public AccessType getAcess() {
		return acess;
	}

	public void setAcess(AccessType acess) {
		this.acess = acess;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getPdBusiness() {
		return PdBusiness;
	}

	public void setPdBusiness(String pdBusiness) {
		PdBusiness = pdBusiness;
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

	public Boolean getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public Set<StarPayUser> getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(Set<StarPayUser> starPayUser) {
		this.starPayUser = starPayUser;
	}

}
