package br.com.fiap.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.ecommerce.dto.ProdutoRequestCreateDto;
import br.com.fiap.ecommerce.dto.ProdutoResponseDto;
import br.com.fiap.ecommerce.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

//	private ProdutoServive produtoService;

	public List<ProdutoResponseDto> list (){
//		List<Produto> produtos = produtoService.list();
		return null;
	}
	
	@PostMapping
	public ProdutoRequestCreateDto create (ProdutoRequestCreateDto dto) {
		return null;
	}
	
}
