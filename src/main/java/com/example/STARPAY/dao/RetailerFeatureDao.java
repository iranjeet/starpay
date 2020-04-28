package com.example.STARPAY.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;

@Repository
public class RetailerFeatureDao {
	@PersistenceContext(unitName = "application")
	EntityManager em;
	
	public void create(RetailerFeature retailerFeatureDao) {
		em.persist(retailerFeatureDao);
		em.flush();
	}
	
	public RetailerFeature getById(RequestRetailerFeature id) {
		return em.find(RetailerFeature.class, id);
	}
	
	public List<RetailerFeature> getAllRetailerFeature(){
		return (List<RetailerFeature>) em.createQuery("from RetailerFeature");
	}

}
