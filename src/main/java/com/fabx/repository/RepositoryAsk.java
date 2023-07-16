package com.fabx.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Ask;

public class RepositoryAsk {

	@Inject
	private EntityManager manager;
	
	public void insert(Ask ask) {
		manager.persist(ask);
	}
	
}
