package teste;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import programa.Autoridade;

class Respeitoso {

	@Test
	void testMasculino() {
		Autoridade joao = new Autoridade ("João", "Luis", "Dr.", true, false, true, false);
		assertEquals("Sr. Luis", joao.getTratamento());
	}
	
	@Test
	void testFeminino() {
		Autoridade joana = new Autoridade ("Joana", "Maria", "", false, true, true, true);
		assertEquals("Sra. Maria", joana.getTratamento());
	}
	
	

}
