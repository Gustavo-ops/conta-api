package com.db1.conta.contaapi.domainDTO;

import java.io.Serializable;

import com.db1.conta.contaapi.domain.entity.Estado;

public class CidadePersisteDTO  implements Serializable {

	private static final long serialVersionUID = -1645947520277978127L;
	 private String Nome;
	 private  Estado estado;
	 public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			this.Nome = nome;
		}

		public Estado getEstado() {
			return estado;
		}

		public void setEstado(Estado estado) {
			this.estado = estado;
		}


}
