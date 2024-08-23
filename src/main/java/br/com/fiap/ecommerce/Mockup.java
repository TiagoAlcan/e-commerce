package br.com.fiap.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Mockup {
	
	private static List<Produto> produtos;
	
	static {
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1L, "Pera"));
		produtos.add(new Produto(2L, "Maça"));
	}
	
	public static List<Produto> list() {
		return produtos;
	}
	
	public List<Produto> list2(){
		return produtos;
	}
}
