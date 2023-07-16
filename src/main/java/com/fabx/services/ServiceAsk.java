package com.fabx.services;

import javax.inject.Inject;

import com.fabx.model.Ask;
import com.fabx.repository.RepositoryAsk;
import com.fabx.util.Transactional;

public class ServiceAsk {

	@Inject
	private RepositoryAsk repositoryAsk;
	
	@Transactional
	public void insert(Ask ask) {
		repositoryAsk.insert(ask);
	}
	
}
