package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.Bayadito;

@Repository
public class BayaditoDao implements Serializable {
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;

	public void create(Bayadito bayadito) {
		entityManager.persist(bayadito);
		entityManager.flush();
	}

	public Bayadito getById(Long Id) {
		return entityManager.find(Bayadito.class, Id);
	}

	public Set<Bayadito> getAllBayaditos() {
		return (Set<Bayadito>) entityManager.createNamedQuery("from Bayadito c").getResultList();
	}

}
