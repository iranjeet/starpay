package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.Address;

@Repository
public class AddressDao implements Serializable{
	@PersistenceContext
	EntityManager em;
	 
	
	public void create(Address address) {
		em.persist(address);
		em.flush();
	}
	
	public Address getById(Long id) {
		return em.find(Address.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Address> getAllAddress(){
		return (List<Address>) em.createQuery("from Address a");
	}

}
