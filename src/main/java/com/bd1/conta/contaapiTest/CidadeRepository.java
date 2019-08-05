package com.bd1.conta.contaapiTest;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	Cidade findByNome(String nome);
	List<Cidade> findByEstado(Estado estado);

}
