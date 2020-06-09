import java.util.Map;

public class Principal {
	
	

	public static void main(String[] args) {
		
		Double totalCarrinho = 0.0;
		
		//Criando pizza 1
		Pizza pizza1 = new Pizza();
		
		pizza1.adicionaIngrediente("calabresa");
		pizza1.adicionaIngrediente("azeitona");
		pizza1.adicionaIngrediente("mussarela");
	
		//Adicionando ao carrinho 
		CarrinhoDeCompras pedido1 = new CarrinhoDeCompras();
		pedido1.adicionaPizza(pizza1);
		
		//Calculando preço atual do carrinho
		totalCarrinho=pedido1.getTotalPreco();

	
		//Criando pizza 2
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("aliche");
	
		//Adicionando ao carrinho 
		pedido1.adicionaPizza(pizza2);
		
		//Calculando preço atual do carrinho
		totalCarrinho=pedido1.getTotalPreco();
	
		//Criando pizza 3
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("frango");
		pizza3.adicionaIngrediente("catupiry");
	
		//Adicionando ao carrinho 
	
		pedido1.adicionaPizza(pizza3);
		
		//Calculando preço atual do carrinho
		totalCarrinho=pedido1.getTotalPreco();
		
		
		//Imprime total do carrinho		
		System.out.println("O total no carrinho é de " +  totalCarrinho);
		
		//Imprime ingredientes usados em todas as pizzas
		for (Map.Entry<String,Integer> e : Pizza.ingredientes.entrySet()) {
		    System.out.println(e.getKey() + " " +   e.getValue());
		}
	}

}
