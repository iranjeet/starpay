package com.example.STARPAY.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;

@Repository
public class RetailerFeatureDao {
	
	EntityManager em;
	
	public void create(RetailerFeatureDao retailerFeatureDao) {
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
