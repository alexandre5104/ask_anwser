package com.fabx;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Answer;
import com.fabx.model.Ask;
import com.fabx.services.ServiceAnswer;
import com.fabx.services.ServiceAsk;

@Named
@RequestScoped
public class ControllerAnswer {

	@Inject
	private ServiceAsk serviceAsk;
	
	@Inject
	private ServiceAnswer serviceAnswer;

	private List<Ask> asks = new ArrayList<Ask>();

	private Integer id;
	
	private Answer answer = new Answer();

	private List<Answer> answers = new ArrayList<Answer>();

	@PostConstruct
	public void init() {
		asks = serviceAsk.getAsks();
	}
	
	public String inserir() {
		System.out.println(this.id);
		serviceAnswer.inserir(this.id, answer);
		return "asks";
	}

	public String recebeParametro(Integer idParam) {
		this.id = idParam;
		System.out.println("Executou");
		return "anwser";
	}
	
	public String getListAnswers(Integer idAsk) {
		answers = serviceAnswer.getAnswers(idAsk);
		for (Answer answer : answers) {
			System.out.println(answer.getDescription());
		}
		return "answer_of_ask";
	}

	public List<Ask> getAsks() {
		return asks;
	}

	public void setAsks(List<Ask> asks) {
		this.asks = asks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
