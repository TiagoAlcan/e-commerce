package br.com.fiap.ecommerce.dto;

import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;

public class ProdutoRequestCreateDto {
	private ModelMapper modelMapper;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Produto toModel() {
		return modelMapper.map(this,Produto.class);

	}
	
}
