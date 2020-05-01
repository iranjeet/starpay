package com.example.STARPAY.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bayadito")
public class Bayadito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment",strategy = "increment")
	private Long Id;
	
	
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

	
	

}
