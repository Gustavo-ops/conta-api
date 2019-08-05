package com.db1.conta.contaapi.domainDTO;

import java.io.Serializable;

import com.db1.conta.contaapi.domain.entity.Estado;

public class CidadeResponseDTO implements Serializable{

	
	private static final long serialVersionUID = -8301740747947321859L;
	
private Long id;
	
	private String nome;
	
	private Estado estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
