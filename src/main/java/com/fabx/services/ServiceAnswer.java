package com.fabx.services;

import java.util.List;

import javax.inject.Inject;

import com.fabx.model.Answer;
import com.fabx.repository.RepositoryAnswer;
import com.fabx.util.Transactional;

public class ServiceAnswer {

	@Inject
	private RepositoryAnswer repositoryAnswer;
	
	@Transactional
	public void inserir(Integer idAsk, Answer answer) {
		repositoryAnswer.inserir(idAsk, answer);
	}

	public List<Answer> getAnswers(Integer idAsk){
		return repositoryAnswer.getAnswers(idAsk);
	}
}
