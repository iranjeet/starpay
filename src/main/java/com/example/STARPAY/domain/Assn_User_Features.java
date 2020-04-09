package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Assn_User_Features")
public class Assn_User_Features {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "starPayId",nullable=false)
	private StarPayUser starPayUser;
	
	@ManyToOne
	@JoinColumn(name="FeateureId",nullable=false)
	private RetailerFeature feature;

	@Column(name = "isActive")
	private Boolean isActive=true; 
	
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public StarPayUser getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}

	public RetailerFeature getFeature() {
		return feature;
	}

	public void setFeature(RetailerFeature feature) {
		this.feature = feature;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
