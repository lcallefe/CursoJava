import java.util.Map;

public class Principal {
	
	

	public static void main(String[] args) {
		
		//Criando pizza 1
		Pizza pizza1 = new Pizza();
		
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("azeitona");
		pizza1.adicionaIngrediente("mussarela");
	
		//Adicionando ao carrinho e calculando preco
		CarrinhoDeCompras pedido1 = new CarrinhoDeCompras();
		pedido1.adicionaPizza(pizza1);
		Double totalCarrinho = pedido1.getTotalPreco();

		//Criando pizza 2
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("aliche");
	
		//Adicionando ao carrinho e calculando preco
		CarrinhoDeCompras pedido2 = new CarrinhoDeCompras();
		pedido2.adicionaPizza(pizza2);
		
		totalCarrinho += pedido2.getTotalPreco();

		
		//Criando pizza 3
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("frango");
		pizza3.adicionaIngrediente("catupiry");
	
		//Adicionando ao carrinho e calculando preco
		CarrinhoDeCompras pedido3 = new CarrinhoDeCompras();
		pedido3.adicionaPizza(pizza3);
		
		totalCarrinho += pedido3.getTotalPreco();
		
		//Imprime total do carrinho		
		System.out.println("O total no carrinho é de " + totalCarrinho);
		
		//Imprime ingredientes usados em todas as pizzas
		for (Map.Entry<String,Integer> e : Pizza.ingredientes.entrySet()) {
		    System.out.println(e.getKey());
		}
	}

}
