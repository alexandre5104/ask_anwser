package com.fabx.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class ProducerEntityManager {

	private EntityManagerFactory factory;
	
	public ProducerEntityManager() {
		System.out.println("Producer EntityManager");
		factory = Persistence
				.createEntityManagerFactory("campeonatoPU");
	}
	
	@RequestScoped @Produces
	public EntityManager getManager() {
		return factory.createEntityManager();
	}
	
	public void close(@Disposes EntityManager manager) {
		manager.close();
	}
	
	
}
