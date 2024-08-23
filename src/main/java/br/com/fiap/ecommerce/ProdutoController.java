package br.com.fiap.ecommerce;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@GetMapping
	public List<Produto> list(){
		return Mockup.list();
	}
	
	
	
		
//		Mockup.list();
//		
//		Mockup instancia = new Mockup();
//		instancia.list2();
//		
//	}
	
	
}
