package teste;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import programa.Autoridade;

class ComTitulo {

	@Test
	void testJoaoDoutor() {
		Autoridade joaoDr = new Autoridade ("João", "Luis", "Dr.", true, false, false, true);
		assertEquals("Dr. João Luis", joaoDr.getTratamento());
	}
	

}
