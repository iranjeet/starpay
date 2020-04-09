package com.example.STARPAY.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.STARPAY.domain.StarPayUser;

@Repository
public class StarPayUserDao implements Serializable {
	@PersistenceContext(unitName = "application")
	EntityManager entityManager;

	public void create(StarPayUser starPayUser) {
		entityManager.persist(starPayUser);
		entityManager.flush();
	}

//	public void update(StarPayUser starPayUser) {
//		entityManager.persist(starPayUser);
//		entityManager.flush();
//	}

	public StarPayUser getById(Long id) {
		return entityManager.find(StarPayUser.class, id);
	}

	public List<StarPayUser> getAllUser() {
		return (List<StarPayUser>) entityManager.createQuery("from StarPayUser c").getResultList();
	}

}
