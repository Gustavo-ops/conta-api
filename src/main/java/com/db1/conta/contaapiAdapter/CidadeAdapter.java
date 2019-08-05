package com.db1.conta.contaapiAdapter;

import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domainDTO.CidadeResponseDTO;

public class CidadeAdapter {
	
	public static CidadeResponseDTO entityToResponse(Cidade cidade) {
		CidadeResponseDTO responseDTO = new CidadeResponseDTO();
		responseDTO.setId(cidade.getId());
		responseDTO.setNome(cidade.getNome());
		responseDTO.setEstado(cidade.getEstado());
		return responseDTO;
	}

}
