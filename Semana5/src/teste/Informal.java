package teste;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import programa.Autoridade;

class Informal {
	
	@Test
	void testJoaoInformal() {
		Autoridade joaozinho = new Autoridade ("Jo�ozinho", "Vitor", "Dr.", true, false, false, false);
		assertEquals("Jo�ozinho", joaozinho.getTratamento());
	}
	
	@Test
	void testMariaInformal() {
		Autoridade maria = new Autoridade ("Maria", "Joana", "Dra.", false, true, false, false);
		assertEquals("Maria", maria.getTratamento());
	}

}
