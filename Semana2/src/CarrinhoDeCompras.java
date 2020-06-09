import java.util.ArrayList;




public class CarrinhoDeCompras {
	
	public ArrayList <Pizza> listaPizzas = new ArrayList<Pizza>();
	public int totalPizzasPedido;
	public Double totalPreco = 0.0;

	

	public void adicionaPizza (Pizza pizza) {
		
		pizza.getPreco();
		if(pizza.qtdIngrediente == 0) {
			
			throw new IllegalArgumentException("Pizza tem de ter ao menos um ingrediente!");
		}
		
		listaPizzas.add(pizza);
		
		
		
	}
	

	public int getTotalPizzasPedido() {
		
		
		totalPizzasPedido = listaPizzas.size();
		return totalPizzasPedido;
		
	}

	public Double getTotalPreco() throws NullPointerException {
		
		
		
		for (int i=0; i<getTotalPizzasPedido(); i++) {
			 totalPreco += listaPizzas.get(i).getPreco();
		}
		
		return totalPreco;
	}


	
	

}
