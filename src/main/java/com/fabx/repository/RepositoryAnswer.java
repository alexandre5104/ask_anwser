package com.fabx.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fabx.model.Answer;
import com.fabx.model.Ask;

public class RepositoryAnswer {

	@Inject
	private EntityManager manager;
	
	public void inserir(Integer IdAsk, Answer answer) {
		
		Ask ask = manager.find(Ask.class, IdAsk);
		answer.setAsk(ask);
		manager.persist(answer);
		
	}
	
}
