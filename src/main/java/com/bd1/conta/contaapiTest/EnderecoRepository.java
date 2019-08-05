package com.bd1.conta.contaapiTest;


import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.conta.contaapi.domain.entity.Endereco;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Cliente;
import com.db1.conta.contaapi.domain.entity.tipoEndereco;
import com.db1.conta.contaapi.domain.entity.Estado;

public class EnderecoRepository {
	Endereco findByCliente(Cliente cliente) {
		return null;
	}
	public Endereco findByLogradouro(String logradouro) {
		return null;
	}
	Endereco findByNumero(String numero) {
		return null;
	}
	Endereco findByCidade(Cidade cidade) {
		return null;
	}
	Endereco findByTipoEndereco(tipoEndereco tipoEndereco) {
		return null;
	}
	Endereco findByComplemento(String complemento) {
		return null;
	}
}
