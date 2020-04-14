package com.example.STARPAY.domain;

import java.util.Set;

import javax.persistence.*;
import com.example.STARPAY.domain.Address;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Assn_User_Address")
public class Assn_User_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "starPayId")
	private StarPayUser starPayUser;
	
	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;
	
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
