package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.EMoneySetLimit;

@Repository
public class EMoneySetLimitDao implements Serializable{
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;
	
	public void create(EMoneySetLimit eMoneySetLimit) {
		entityManager.persist(eMoneySetLimit);
		entityManager.flush();
	}
	public EMoneySetLimit getById(Long primaryKey) {
		return entityManager.find(EMoneySetLimit.class, primaryKey);
	}
	public Set<EMoneySetLimit> getAllEMoneySetLimits(){
		return (Set<EMoneySetLimit>) entityManager.createQuery("from EMoneySetLimit c").getResultList();
	}
}
