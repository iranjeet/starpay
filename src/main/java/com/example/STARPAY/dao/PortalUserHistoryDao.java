package com.example.STARPAY.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
@Repository
public class PortalUserHistoryDao implements Serializable {
	
	@PersistenceContext(name = "application")
	EntityManager entityManager;

}
