package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.Wallet;
@Repository
public class WalletDao implements Serializable {
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;
	public void create(Wallet wallet) {
		entityManager.persist(wallet);
	}
	public Wallet getById(Long primaryKey) {
		return entityManager.find(Wallet.class, primaryKey);
	}
	public Set<Wallet> getAllWallets(){
		return (Set<Wallet>) entityManager.createQuery("From Wallet w").getResultList();
	}
}
