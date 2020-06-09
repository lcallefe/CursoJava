import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestePizza {

		
	@BeforeEach
	public void zeraIngredientesLista () {
		
		Pizza.zeraIngredientes();
	}
	
	@Test
	public void testValorPrecoPizzaDoisIngredientes() {
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("molho");
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(15.00, pizza1.getPreco());
	}
	
	@Test
	public void testValorPrecoPizzaCincoIngredientes () {	
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("molho");
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("azeitona");
		pizza2.adicionaIngrediente("presunto");
		pizza2.adicionaIngrediente("bacon");
		assertEquals(20.00, pizza2.getPreco());
		
	}
		
	@Test
	public void testValorPrecoPizzaSeisIngredientes () {
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("molho");
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("azeitona");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("bacon");
		pizza3.adicionaIngrediente("catupiry");
		assertEquals(23.00, pizza3.getPreco());
		
	}
	
	@Test
	public void testRegistroIngredientes() {
		
		
		String ingrediente1 = "frango";
		String ingrediente2 = "chocolate";
		String ingrediente3 = "provolone";
		String ingrediente4 = "batata palha";
		String ingrediente5 = "frango";
		String ingrediente6 = "frango";
		String ingrediente7 = "chocolate";
		
		Pizza pizza = new Pizza ();
		
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		pizza.adicionaIngrediente(ingrediente5);
		pizza.adicionaIngrediente(ingrediente6);
		pizza.adicionaIngrediente(ingrediente7);
		
		assertEquals(3, Pizza.ingredientes.get(ingrediente1));
		assertEquals(2, Pizza.ingredientes.get(ingrediente2));
		assertEquals(1, Pizza.ingredientes.get(ingrediente3));
		assertEquals(1, Pizza.ingredientes.get(ingrediente4));
		assertEquals(3, Pizza.ingredientes.get(ingrediente5));
		assertEquals(3, Pizza.ingredientes.get(ingrediente6));
		assertEquals(2, Pizza.ingredientes.get(ingrediente7));

	}

}
