package com.fabx.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Ask;

public class RepositoryAsk {

	@Inject
	private EntityManager manager;
	
	public void insert(Ask ask) {
		manager.persist(ask);
	}
	
	public List<Ask> getAsks(){
		return manager.createQuery("SELECT a FROM Ask a", Ask.class).getResultList();
	}
	
}
