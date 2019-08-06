package com.db1.conta.contaapiTest;


import java.util.List;

import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	Cidade findByNome(String nome);
	List<Cidade> findByEstado(Estado estado);
	@Query(nativeQuery = true, value = "select * from cidade where nome = :nome")
	Optional<Cidade> findByNomeOptional(@Param("nome") String nome);

}
