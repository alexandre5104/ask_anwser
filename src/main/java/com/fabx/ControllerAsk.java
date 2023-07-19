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
	
	public String insert() {
		serviceAsk.insert(ask);
		ask = new Ask();
		return "asks?faces-redirect=true";
	}
	
	public Ask getAsk() {
		return ask;
	}

	public void setAsk(Ask ask) {
		this.ask = ask;
	}
	
}
