package com.example.STARPAY.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Wallet")
public class Wallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;
	@Column(name="wallet_name")
	private String name;
	@Column(name="isActive")
	private Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private StarPayUser starPayUser;
	
	
	@OneToMany
	@JoinColumn(name="walletid")
	private Set<Assn_User_Wallet> assn_User_Wallets;


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public StarPayUser getStarPayUser() {
		return starPayUser;
	}


	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}


	public Set<Assn_User_Wallet> getAssn_User_Wallets() {
		return assn_User_Wallets;
	}


	public void setAssn_User_Wallets(Set<Assn_User_Wallet> assn_User_Wallets) {
		this.assn_User_Wallets = assn_User_Wallets;
	}
	
}
