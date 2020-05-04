package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.BillPaymentTransaction;

@Repository
public class BillPaymentTransactionDao implements Serializable{
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;
	
	public void create(BillPaymentTransaction bill) {
		entityManager.persist(bill);
		entityManager.flush();
	}
	
	public BillPaymentTransaction getById(Long Id) {
	return	entityManager.find(BillPaymentTransaction.class,Id);
	}
	
	public Set<BillPaymentTransaction> getAllBillPaymentTransactions(){
	return (Set<BillPaymentTransaction>)	entityManager.createQuery("from BillPaymentTransaction c").getResultList();
	}
}
