import java.util.ArrayList;




public class CarrinhoDeCompras {
	
	public ArrayList <Pizza> listaPizzas = new ArrayList<Pizza>();
	public int totalPizzasPedido;
	public Double totalPreco = 0.0;

	
	public  CarrinhoDeCompras() {
		listaPizzas.clear();
	}

	public void adicionaPizza (Pizza pizza) {
		
		if(Pizza.listaIngredientes.size() == 0) {
			
			throw new IllegalArgumentException("Pizza tem de ter ao menos um ingrediente!");
		}
		
		listaPizzas.add(pizza);
		
		
		
	}
	

	public int getTotalPizzasPedido() {
		
		
		totalPizzasPedido = listaPizzas.size();
		return totalPizzasPedido;
		
	}

	public Double getTotalPreco() throws NullPointerException {
		
		
		if (listaPizzas.size() == 1) {
			totalPreco+=listaPizzas.get(0).getPreco();
		}
		else {
			totalPreco += listaPizzas.get(listaPizzas.size()-1).getPreco();
		}
		
		
		return totalPreco;
	}


	
	

}
