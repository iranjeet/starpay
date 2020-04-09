package com.example.STARPAY.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class Assn_User_AddressDao {
	@PersistenceContext
	EntityManager em;
}
