package com.fabx;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Ask;
import com.fabx.services.ServiceAsk;

@RequestScoped
@Named
public class ControllerAsk {
	
	@Inject
	private ServiceAsk serviceAsk;
	
	private Ask ask = new Ask();

	public void insert() {
		serviceAsk.insert(ask);
	}
	
	public Ask getAsk() {
		return ask;
	}

	public void setAsk(Ask ask) {
		this.ask = ask;
	}
	
}
