package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="Assn_User_Wallet")
public class Assn_User_Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;
	
	
	
	@ManyToOne
	@JoinColumn(name="UserId")
	private StarPayUser starPayUser;
	

	@ManyToOne
	@JoinColumn(name="walletId")
	private Wallet wallet;
	
	
	@Column(name="isActive")
	private Boolean isActive=true;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "acess_type", columnDefinition = "varchar(255) default 'VIEW'")
	private AccessType acess=AccessType.VIEW;
	
	
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public StarPayUser getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}


}
