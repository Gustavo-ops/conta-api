package com.db1.conta.contaapi.service;


import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Estado;
import com.db1.conta.contaapi.domainDTO.CidadePersisteDTO;
import com.db1.conta.contaapi.domainDTO.CidadeResponseDTO;
import com.db1.conta.contaapiAdapter.CidadeAdapter;
import com.db1.conta.contaapiTest.CidadeRepository;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public CidadeResponseDTO save(CidadePersisteDTO dto) {
		Cidade cidade = new Cidade(dto.getNome(), dto.getEstado());
		cidadeRepository.save(cidade);
		return CidadeAdapter.entityToResponse(cidade);
	}
	
	public CidadeResponseDTO update(Long cidadeId, CidadePersisteDTO dto) {
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			cidade.alterar(dto.getNome(), dto.getEstado());
			cidadeRepository.save(cidade);
			return CidadeAdapter.entityToResponse(cidade);
		}		
		throw new RuntimeException("Cidade de ID" + cidadeId + " não encontrada");
	}
	public void delete(Long cidadeId) {
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if(opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			cidadeRepository.delete(cidade);
		}
		throw new RuntimeException("Cidade de ID" + cidadeId + "Cidade não encontrada");
	}
	public List<Cidade> procurarTodasAsCidades() {
		List<Cidade> cidade = new ArrayList<>();
		cidade = cidadeRepository.findAll();
		return cidade;
	}
	
	public CidadeResponseDTO procurarCidadePorId(Long cidadeId) {
		Optional<Cidade> opCidade = cidadeRepository.findById(cidadeId);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			return CidadeAdapter.entityToResponse(cidade);
		}
		throw new RuntimeException("Cidade De ID" + cidadeId + "Não Encontrada");
	}
	
	public CidadeResponseDTO findByNome(String Nome) {
		Optional<Cidade> opCidade = cidadeRepository.findByNomeOptional(Nome);
		if (opCidade.isPresent()) {
			Cidade cidade = opCidade.get();
			CidadeResponseDTO cidadeResponse = CidadeAdapter.entityToResponse(cidade);
			return cidadeResponse;
		}
		throw new RuntimeException("Cidade De Nome" + Nome + "Não Encontrada");
	}


		
}

	

