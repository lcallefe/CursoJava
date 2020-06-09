package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


import codigoproducao.ProdutoComTamanho;

class TesteProdutoComTamanho {

	@Test
	void testVerificaIguais() {
		
		ArrayList<ProdutoComTamanho> produtos = new ArrayList<ProdutoComTamanho>();


		ProdutoComTamanho produto1 = new ProdutoComTamanho("cueca", 20.00, 1, "M");
		ProdutoComTamanho produto2 = new ProdutoComTamanho("camisola", 20.00, 1, "P");
		ProdutoComTamanho produto3 = new ProdutoComTamanho("pijama", 20.00, 2, "M");
		ProdutoComTamanho produto4 = new ProdutoComTamanho("sapatilha", 10.00, 2, "M");
		ProdutoComTamanho produto5 = new ProdutoComTamanho("calça", 15.00, 3, "P");
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		for (int i = 0; i < produtos.size(); i++)
        {
            for (int j = 0 ; j < produtos.size(); j++)
            {


                if(i != j && produtos.get(i).equals(produtos.get(j))) 
                	break;

             }
        }
		
		
		assertTrue(produtos.get(2).equals(produtos.get(3)));
	
		assertFalse(produtos.get(0).equals(produtos.get(1)));
		assertFalse(produtos.get(0).equals(produtos.get(2)));
		assertFalse(produtos.get(0).equals(produtos.get(3)));
		assertFalse(produtos.get(0).equals(produtos.get(4)));
		
		assertFalse(produtos.get(1).equals(produtos.get(2)));
		assertFalse(produtos.get(1).equals(produtos.get(3)));
		assertFalse(produtos.get(1).equals(produtos.get(4)));
		
		assertFalse(produtos.get(2).equals(produtos.get(0)));
		assertFalse(produtos.get(2).equals(produtos.get(1)));
		assertFalse(produtos.get(2).equals(produtos.get(4)));
		
		assertFalse(produtos.get(4).equals(produtos.get(0)));
		assertFalse(produtos.get(4).equals(produtos.get(1)));
		assertFalse(produtos.get(4).equals(produtos.get(2)));
		assertFalse(produtos.get(4).equals(produtos.get(3)));
	}

}
