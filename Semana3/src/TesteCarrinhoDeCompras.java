import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
	public void testPrecoTotalPizza() {
		
		/*
		 * 
		 * Cria um pedido com 3 pizzas, 
		 * cada uma contendo  2, 5 e 6
		 * ingredientes, respectivamente
		 *
		 */
		
		//Criando primeira pizza
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("frango");
		pizza.adicionaIngrediente("catupiry");
	
		//Adicionando ao carrinho 
		
		CarrinhoDeCompras pedido = new CarrinhoDeCompras();
		pedido.adicionaPizza(pizza);
		
		//Verifica preço após adição da primeira pizza
		
		assertEquals(15.00, pedido.getTotalPreco());
		
		
		//Criando segunda pizza
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("frango");
		pizza2.adicionaIngrediente("catupiry");
		pizza2.adicionaIngrediente("azeitona");
		pizza2.adicionaIngrediente("molho");
		pizza2.adicionaIngrediente("manjericão");
			
		//Adicionando ao carrinho 
				
		pedido.adicionaPizza(pizza2);
				
		//Verifica preço após adição da segunda pizza
		System.out.println(pedido.listaPizzas.get(0));
		System.out.println(pedido.listaPizzas.get(1));
		assertEquals(35.00, pedido.getTotalPreco());
		
		//Criando terceira pizza
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("frango");
		pizza3.adicionaIngrediente("catupiry");
		pizza3.adicionaIngrediente("azeitona");
		pizza3.adicionaIngrediente("molho");
		pizza3.adicionaIngrediente("manjericão");
		pizza3.adicionaIngrediente("hamburguer");
					
		//Adicionando ao carrinho 
						
		pedido.adicionaPizza(pizza3);
						
		//Verifica preço após adição da terceira pizza
						
		assertEquals(58.00, pedido.getTotalPreco());
		
		
	}
	
	@Test
	public void testAdicionaSemIngrediente() {
		
		//Criando pizza sem ingrediente e tentando add no carrinho
		Pizza pizza = new Pizza ();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			carrinho.adicionaPizza(pizza);
	    });
		
		String esperado = "Pizza tem de ter ao menos um ingrediente!";
	    String obtido = e.getMessage();
	 
	    assertTrue(obtido.contains(esperado));
	 
	}
	
	

}
