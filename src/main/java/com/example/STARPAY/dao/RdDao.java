package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.Rd;

@Repository
public class RdDao implements Serializable {
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;

	public void create(Rd rd) {
		entityManager.persist(rd);
		entityManager.flush();
	}

	public Rd getById(Long Id) {
		return entityManager.find(Rd.class, Id);
	}

	public Set<Rd> getAllRd() {
		return (Set<Rd>) entityManager.createQuery("From Rd c").getResultList();
	}
}
