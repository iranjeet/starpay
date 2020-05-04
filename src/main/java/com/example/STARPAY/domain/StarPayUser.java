package com.example.STARPAY.domain;

import java.sql.Timestamp;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "StarPay_user")
public class StarPayUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "Id")
	private Long id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "mobile_no")
	private String mobileNumber;

	@Column(name = "status", columnDefinition = "varchar(255) default 'Active'")
	private String status = "Active";

	@Column(name = "isActive", columnDefinition = "tinyint(1) default 1")
	private Boolean isActive = true;

	@Column(name = "createDate")
	private final Timestamp createDate = new Timestamp(System.currentTimeMillis());

	@Column(name = "updatedDate")
	private final Timestamp updatedDate = new Timestamp(System.currentTimeMillis());

	@Column(name = "gender")
	private String gender;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "isAdmin", columnDefinition = "tinyint(1) default 0")
	private Boolean isAdmin = false;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<Address> address;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<EMoneyService> eMoneyService;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<EMoneySetLimit> eMoneySetLimit;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<PortalUserHistory> portalUserHistory;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<RetailerFeature> retailerFeature;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "starPayUser", cascade = CascadeType.ALL)
	private Set<BillPaymentTransaction> billPaymentTransaction;

	@ManyToOne
	@JoinColumn(name = "rd_id")
	private Rd rd;

	@ManyToOne
	@JoinColumn(name = "pd_id")
	private PD pd;
	@Enumerated(EnumType.STRING)
	@Column(name = "acess_type", columnDefinition = "varchar(255) default 'VIEW'")
	private AccessType acess=AccessType.VIEW;
	

	public AccessType getAcess() {
		return acess;
	}

	public void setAccess(AccessType acess) {
		this.acess = acess;
	}

	public Set<PortalUserHistory> getPortalUserHistory() {
		return portalUserHistory;
	}

	public void setPortalUserHistory(Set<PortalUserHistory> portalUserHistory) {
		this.portalUserHistory = portalUserHistory;
	}

	public Set<EMoneySetLimit> geteMoneySetLimit() {
		return eMoneySetLimit;
	}

	public void seteMoneySetLimit(Set<EMoneySetLimit> eMoneySetLimit) {
		this.eMoneySetLimit = eMoneySetLimit;
	}

	public Set<EMoneyService> geteMoneyService() {
		return eMoneyService;
	}

	public void seteMoneyService(Set<EMoneyService> eMoneyService) {
		this.eMoneyService = eMoneyService;
	}

	public PD getPd() {
		return pd;
	}

	public void setPd(PD pd) {
		this.pd = pd;
	}

	public Rd getRd() {
		return rd;
	}

	public void setRd(Rd rd) {
		this.rd = rd;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
