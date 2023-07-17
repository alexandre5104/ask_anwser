package com.fabx.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.fabx.model.Ask;
import com.fabx.repository.RepositoryAsk;
import com.fabx.util.Transactional;

public class ServiceAsk {

	@Inject
	private RepositoryAsk repositoryAsk;
	
	@Transactional
	public void insert(Ask ask) {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);
		ask.setAskDate(calendar);
		repositoryAsk.insert(ask);
	}
	
	public List<Ask> getAsks(){
		return repositoryAsk.getAsks();
	}
	
}
