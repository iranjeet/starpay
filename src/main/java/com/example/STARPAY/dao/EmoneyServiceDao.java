package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.EMoneyService;

@Repository
public class EmoneyServiceDao implements Serializable{
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;
	public void create(EMoneyService eMoneyService) {
		entityManager.persist(eMoneyService);
		
	}
	public EMoneyService getById(Long primaryKey) {
		return entityManager.find(EMoneyService.class, primaryKey);
	}
	public Set<EMoneyService> getAllEMoneyServices(){
		return (Set<EMoneyService>) entityManager.createQuery("from EmoneyServics c").getResultList();
	}
}
