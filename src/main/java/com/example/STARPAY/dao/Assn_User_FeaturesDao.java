//package com.example.STARPAY.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//
//import com.example.STARPAY.domain.RetailerFeature;
//import com.example.STARPAY.dto.Request.RequestRetailerFeature;
//
//@Repository
//public class Assn_User_FeaturesDao {
//	@PersistenceContext(unitName = "application")
//	EntityManager em;
//	
//	
////	public void create(Assn_User_FeaturesDao retailerFeatureDao) {
////		em.persist(retailerFeatureDao);
////		em.flush();
////	}
////	
//	
//	public RetailerFeature getById(Assn_User_FeaturesDao id) {
//		return em.find(RetailerFeature.class, id);
//	}
//	
//	public List<Assn_User_FeaturesDao> getAllRetailerFeature(){
//		return (List<Assn_User_FeaturesDao>) em.createQuery("from Assn_User_Features");
//	}
//	
//}
