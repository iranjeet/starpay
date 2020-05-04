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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;

	@Column(name = "full_address")
	private String fullAddress;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "province")
	private String province;
	@Column(name = "city")
	private String city;
	@Column(name = "Type")
	private String addressType;
	@Column(name = "isActive", columnDefinition = "tinyint(1) default 1")
	private Boolean isActive = true;

	@ManyToOne // TODO 29-4-2020 11:45PM can remove the comment Jucst check for the user
	@JoinColumn(name = "userId")
	private StarPayUser starPayUser;
	@Enumerated(EnumType.STRING)
	@Column(name = "acess_type", columnDefinition = "varchar(255) default 'VIEW'")
	private AccessType acess=AccessType.VIEW;
	
	
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
		this.Id = id;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public StarPayUser getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}

}
