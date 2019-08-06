package com.db1.conta.contaapi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domainDTO.CidadeResponseDTO;
import com.db1.conta.contaapi.service.CidadeService;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("/todas as cidades")
	public List<Cidade> todasCidades(){
		return cidadeService.procurarTodasAsCidades();
	}
	@GetMapping
	public CidadeResponseDTO cidadeNome(@RequestParam("nome")String nome ){
		return (CidadeResponseDTO) cidadeService.procurarTodasAsCidades();
	}
	@GetMapping("id")
	public CidadeResponseDTO cidadePorId(@PathParam("id")Long id) {
		return cidadeService.procurarCidadePorId(id);
	}
}

