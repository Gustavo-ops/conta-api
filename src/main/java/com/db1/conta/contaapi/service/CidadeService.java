package com.db1.conta.contaapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd1.conta.contaapiTest.CidadeRepository;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domainDTO.CidadePersisteDTO;
import com.db1.conta.contaapi.domainDTO.CidadeResponseDTO;
import com.db1.conta.contaapiAdapter.CidadeAdapter;

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
	public List<Cidade> buscaTodasAsCidades(Long cidadeId) {
		List<Cidade> cidade = new ArrayList<>();
		cidade =  CidadeRepository	
	}
	

}

	

