package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codigoproducao.CarrinhoDeCompras;
import codigoproducao.Produto;
import codigoproducao.ProdutoComTamanho;

class TesteCarrinhoDeCompras {
	
	@BeforeEach
	
	void criaArrayListEComparaIguais() {
		
	}

	@Test
	void testAdicionaDoisIguais() {
		int total = 0;
		ProdutoComTamanho produto1 = new ProdutoComTamanho("pijama", 20.00, 2, "M");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("sapatilha", 10.00, 2, "M");
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto1);
		produtos.add(produto2);
		
		produtos.get(0).equals(produtos.get(1));
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(produto1, 10);
		carrinho.adicionaProduto(produto2, 9);

		
		for (Map.Entry<Produto, Integer> entry : carrinho.hashSetProduto.entrySet()) {
			total += entry.getValue();
			
			
		}
		
		assertEquals(19, total);
		
	}
	
	@Test
	void testAdicionaProdutoERemove() {
		
		int total = 0;
		Produto produto1 = new Produto("camiseta", 20.00, 2);
		Produto produto2 = new Produto("camisa social", 10.00, 2);
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto1);
		produtos.add(produto2);
		
		produtos.get(0).equals(produtos.get(1));
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(produto1, 10);
		carrinho.removeProduto(produto2, 9);

		
		for (Map.Entry<Produto, Integer> entry : carrinho.hashSetProduto.entrySet()) {
			total += entry.getValue();
			
			
		}
		
		assertEquals(1, total);
		
		
	}
	
	@Test
	void testAdicionaECalculaTotal() {
		
		ProdutoComTamanho produto1 = new ProdutoComTamanho("camiseta", 10.00, 1, "M");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("camiseta", 10.00, 2, "P");
		ProdutoComTamanho produto3 = new ProdutoComTamanho("camiseta", 10.00, 3, "M");
		ProdutoComTamanho produto4 = new ProdutoComTamanho("camiseta", 10.00, 4, "M");
		Produto produto5 = new Produto("camiseta", 15.00, 5);
		Produto produto6 = new Produto("camiseta", 16.00, 6);
		Produto produto7 = new Produto("camiseta", 17.00, 7);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(produto1, 8);
		carrinho.adicionaProduto(produto2, 7);
		carrinho.adicionaProduto(produto3, 6);
		carrinho.adicionaProduto(produto4, 5);
		carrinho.adicionaProduto(produto5, 4);
		carrinho.adicionaProduto(produto6, 10);
		carrinho.adicionaProduto(produto7, 10);
		
		assertEquals(650, carrinho.calculaTotal());

		
		
	}
	
	@Test
	void CalculaTotalCarrinhoVazio() {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		ProdutoComTamanho produto1 = new ProdutoComTamanho("camiseta", 10.00, 1, "M");

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto1);
		produtos.add(produto1);
		
		produtos.get(0).equals(produtos.get(1));
		
		carrinho.adicionaProduto(produto1, 5);
		carrinho.removeProduto(produto1, 5);
		
		assertEquals(0, carrinho.calculaTotal());
	}
	
	

}
