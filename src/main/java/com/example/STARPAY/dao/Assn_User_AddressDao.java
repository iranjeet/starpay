package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import com.example.STARPAY.domain.Assn_User_Address;

@Repository
public class Assn_User_AddressDao implements Serializable {
	@PersistenceContext
	EntityManager em;
	
	public void create(Assn_User_Address address) {
		em.persist(address);
		em.flush();
	}
	
	public Assn_User_Address getById(Long id) {
		return em.find(Assn_User_Address.class, id);
	}
	
	public List<Assn_User_Address> getAllAddress(){
		return (List<Assn_User_Address>) em.createQuery("from Assn_User_Address a");
	}

}
