import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Pizza {
	
	public String ingrediente;
	public double preco;
	public static ArrayList <String> listaIngredientes = new ArrayList<String>();
	public static HashMap <String, Integer> ingredientes = new HashMap<>();
	public int qtdIngrediente;
	
	public Pizza () {}
	


	public static void contabilizaIngrediente(ArrayList <String> listaIngredientes) {
		
		
		
		for(int i=0; i<listaIngredientes.size();i++) {
			int contIngredientes = Collections.frequency(listaIngredientes, listaIngredientes.get(i));
			ingredientes.put(listaIngredientes.get(i), contIngredientes);
		}			
	}

	
	public Double getPreco () {
		
		qtdIngrediente = listaIngredientes.size();
		
		if (qtdIngrediente <= 2) {
			
			preco = 15.00;
		}
		else if (qtdIngrediente  > 2 && qtdIngrediente  <=5) {
			
			preco = 20.00;
		}
		else {
			
			preco = 23.00;
		}
		
		zeraIngredientes();
		return preco;
	}



	public void adicionaIngrediente (String ingredientePizza) {
		ingrediente = ingredientePizza;
		listaIngredientes.add(this.ingrediente);
		contabilizaIngrediente(listaIngredientes);
		
	}
	
	public static void zeraIngredientes () {
		listaIngredientes.clear();
		
	}
	
	


	

}
