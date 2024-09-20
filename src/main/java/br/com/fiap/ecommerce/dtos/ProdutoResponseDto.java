package br.com.fiap.ecommerce.dtos;

import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;

public class ProdutoResponseDto {
    private Long id;
    private String nome;
    private static final ModelMapper modelMapper = new ModelMapper();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public ProdutoResponseDto toDto(Produto produto) {
        ProdutoResponseDto result = modelMapper.map(produto,ProdutoResponseDto.class);
        return result;
    }
}