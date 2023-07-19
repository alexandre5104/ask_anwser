package com.fabx.repository;

import java.util.List;

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
	
	public List<Answer> getAnswers(Integer idAsk){
		
		System.out.println("repository: "+idAsk);
		return manager.
				createQuery("SELECT answer FROM Answer answer WHERE answer.ask.id = :id", Answer.class)
				.setParameter("id", idAsk)
				.getResultList();
	}
}
