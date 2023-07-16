package com.fabx;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ControllerAsk {

	private String nome;
	
	private String nomeTransformado;
	
	public void upper() {
		this.nomeTransformado = this.nome.toUpperCase();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeTransformado() {
		return nomeTransformado;
	}

	public void setNomeTransformado(String nomeTransformado) {
		this.nomeTransformado = nomeTransformado;
	}
	
	
}
