package com.fabx;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

import com.fabx.model.Ask;
import com.fabx.services.ServiceAsk;

@Named
@RequestScoped
public class ControllerAnswer {

	@Inject
	private ServiceAsk serviceAsk;
	
	private List<Ask> asks = new ArrayList<Ask>();
	
	private Integer id;
	
	@PostConstruct
	public void init() {
		asks = serviceAsk.getAsks();
	}

	public List<Ask> getAsks() {
		return asks;
	}

	public void setAsks(List<Ask> asks) {
		this.asks = asks;
	}
	
	
	
}
