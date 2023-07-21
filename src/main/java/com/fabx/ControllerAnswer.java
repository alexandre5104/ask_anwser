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
	
	private Ask askReturn;

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
		return "anwser";
	}
	
	public String getListAnswers(Integer idAsk, Ask ask) {
		answers = serviceAnswer.getAnswers(idAsk);
		this.askReturn = ask;
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
	
	public Ask getAskReturn() {
		return askReturn;
	}

	public void setAskReturn(Ask askReturn) {
		this.askReturn = askReturn;
	}

	
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
