package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

public class BillPaymentTransaction {
	@Id
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment", strategy = GenerationType.AUTO)
	private Long Id;

	@Column(name = "canEdit")
	private Boolean canEdit;

	@ManyToOne
	@JoinColumn(name = "userId")
	private StarPayUser starPayUser;
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

	public Boolean getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public StarPayUser getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}

}
