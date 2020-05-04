package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.PortalUserHistory;

@Repository
public class PortalUserHistoryDao implements Serializable {

	@PersistenceContext(name = "application")
	EntityManager entityManager;

	public void create(PortalUserHistory p) {
		entityManager.persist(p);
		entityManager.flush();
	}

	public PortalUserHistory getById(Long Id) {
		return (PortalUserHistory) entityManager.find(PortalUserHistory.class, Id);
	}

	public Set<PortalUserHistory> getAllPortalUserHistories() {
		return (Set<PortalUserHistory>) entityManager.createQuery("From PortalUserHistory c").getResultList();
	}

}
