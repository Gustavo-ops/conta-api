package com.bd1.conta.contaapiTest;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.conta.contaapi.domain.entity.Cliente;
import com.db1.conta.contaapi.domain.entity.Endereco;
import com.db1.conta.contaapi.domain.entity.Agencia;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;

public class ClienteRepository {
	Cliente findByNome(String nome) {
		return null;
	}
	Cliente findByCpf(String cpf) {
		return null;
	}
}
