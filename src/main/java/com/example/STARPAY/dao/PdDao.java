package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.PD;

@Repository
public class PdDao implements Serializable{
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;
	
	public void create(PD pd) {
		entityManager.persist(pd);
		entityManager.flush();
	}
	public PD getById(Long ID) {
		return entityManager.find(PD.class,ID);
	}
	public Set<PD> getAllPd(){
		return (Set<PD>) entityManager.createQuery("from PD p ").getResultList();
	}
}
