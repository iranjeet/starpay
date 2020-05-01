package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "portal_user_history")
public class PortalUserHistory {

	@javax.persistence.Id
	@GeneratedValue(generator = "increment", strategy = GenerationType.AUTO)
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;

	@Column(name = "CanEdit", columnDefinition = "tinyint(0) default 0")
	private Boolean canEdit=false;

	@ManyToOne
	@JoinColumn(name = "UserId")
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
