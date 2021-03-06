
public class HardMode extends EasyMode implements MecanicaDoJogo {


	public void mostraPontuacao() {
		super.mostraPontuacao();
	}

	
	public String mostraPalavraInvertida(int numeroRodada) {
		return super.mostraPalavraInvertida(numeroRodada);
	}


	
	public boolean acertou(String palpiteUsuario, int numeroDaRodada) {
		return super.acertou(palpiteUsuario, numeroDaRodada);
	}
	
	
	public void fimDoJogo(int numeroRodada) {
		if (qtdeAcertos < 6 || numeroRodada < fabrica.tamanhoListaPalavras) {
			acertou(palpiteUsuario, numeroRodada);
			
		}
		if (qtdeAcertos == 6) {
			System.out.println("\n Você ganhou");
			mostraPontuacao();
			System.exit(1);
		} 
		else if (qtdeAcertos < 6 && numeroRodada == fabrica.tamanhoListaPalavras) {
			System.out.println("\n Game Over!");
			mostraPontuacao();
			System.exit(1);
		}
	}

		

}
