package com.fabx.services;

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
	
}
