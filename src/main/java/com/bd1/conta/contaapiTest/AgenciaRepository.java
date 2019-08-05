package com.bd1.conta.contaapiTest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.conta.contaapi.domain.entity.Agencia;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;

public class AgenciaRepository {
	Agencia findByNumero(String numero) {
		return null;
	}
	Agencia findByDigito(String digito) {
		return null;
	}
	List<Agencia> findByCidade(Cidade cidade) {
		return null;
	}
	List<Agencia> findByCidadeEstado(Estado estado) {
		return null;
	}

	

}
