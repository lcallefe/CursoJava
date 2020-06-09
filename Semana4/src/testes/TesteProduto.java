package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import codigoproducao.Produto;

 

class TesteProduto {

	@Test
	void testVerificaIguais() {
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Produto produtoSemTamanho1 = new Produto ("bermuda", 20.00, 8);
		Produto produtoSemTamanho2 = new Produto ("camisa", 15.00, 4);
		Produto produtoSemTamanho3 = new Produto ("camiseta", 16.00, 1);
		Produto produtoSemTamanho4 = new Produto ("camiseta", 17.00, 4);
		Produto produtoSemTamanho5 = new Produto ("shorts", 18.00, 8);
		
		produtos.add(produtoSemTamanho1);
		produtos.add(produtoSemTamanho2);
		produtos.add(produtoSemTamanho3);
		produtos.add(produtoSemTamanho4);
		produtos.add(produtoSemTamanho5);
		
		for (int i = 0; i < produtos.size(); i++)
        {
            for (int j = 0 ; j < produtos.size(); j++)
            {


                if(i != j && produtos.get(i).equals(produtos.get(j))) 
                	break;

             }
        }
		
		assertTrue(produtos.get(0).equals(produtos.get(4)));
		assertTrue(produtos.get(1).equals(produtos.get(3)));
		
		assertFalse(produtos.get(0).equals(produtos.get(1)));
		assertFalse(produtos.get(0).equals(produtos.get(2)));
		assertFalse(produtos.get(0).equals(produtos.get(3)));
		assertFalse(produtos.get(1).equals(produtos.get(0)));
		assertFalse(produtos.get(1).equals(produtos.get(2)));
		assertFalse(produtos.get(1).equals(produtos.get(4)));
		assertFalse(produtos.get(2).equals(produtos.get(0)));
		assertFalse(produtos.get(2).equals(produtos.get(1)));
		assertFalse(produtos.get(2).equals(produtos.get(3)));
		assertFalse(produtos.get(2).equals(produtos.get(4)));
	}

	

}
