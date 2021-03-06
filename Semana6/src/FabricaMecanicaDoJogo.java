public class FabricaMecanicaDoJogo {
	
	EasyMode easy = new EasyMode ();
	HardMode hard = new HardMode ();
	FabricaEmbaralhadores fabricaEmb = new FabricaEmbaralhadores();
	int numeroDaRodada = 1;
	private int totalRodadas = fabricaEmb.getTamanhoLista();
	
	public int getTotalRodadas() {
		return totalRodadas;
	}

	public void mostraPalavraEmbaralhada (int opcaoJogo, int numeroRodada) {
		if (opcaoJogo == 1) {
			System.out.println(easy.mostraPalavraInvertida(numeroRodada));
		
		}
		else 
			System.out.println(hard.mostraPalavraInvertida(numeroRodada));
		
	}
	
	public void verificaPalpiteUsuarioEasy (String palpite) {
		easy.palpiteUsuario = palpite;
		easy.fimDoJogo(numeroDaRodada);
		numeroDaRodada++;

	}
	
	public void verificaPalpiteUsuarioHard(String palpite) {
		hard.palpiteUsuario = palpite;
		hard.fimDoJogo(numeroDaRodada);
		numeroDaRodada++;

	}

}
