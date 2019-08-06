package com.db1.conta.contaapiTest;


import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.conta.contaapi.domain.entity.Endereco;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Cliente;
import com.db1.conta.contaapi.domain.entity.tipoEndereco;
import com.db1.conta.contaapi.domain.entity.Estado;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	Endereco findByCliente(Cliente cliente);
	Endereco findByLogradouro(String logradouro);
	Endereco findByNumero(String numero);
	Endereco findByCidade(Cidade cidade);
	Endereco findByTipoEndereco(tipoEndereco tipoEndereco);
	Endereco findByComplemento(String complemento);
	
}
