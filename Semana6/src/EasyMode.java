public class EasyMode implements MecanicaDoJogo {
	
	FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	int qtdeAcertos = 0;
	String palpiteUsuario;

	
	@Override
	public boolean acertou(String palpiteUsuario, int numeroDaRodada) {
		if (palpiteUsuario.contentEquals(fabrica.getPalavrasCorretas().get(numeroDaRodada - 1))) {
			qtdeAcertos++;
			System.out.println("\n Parabéns, você acertou! ");
			return true;
		}
		System.out.println("\n Resposta errada. Tente outra vez ");
		return false;
	}

	@Override
	public void fimDoJogo (int numeroRodada) {
		if (qtdeAcertos < 3 || numeroRodada < fabrica.tamanhoListaPalavras) {
			acertou(palpiteUsuario, numeroRodada);
			
		}
		if (qtdeAcertos == 3) {
			System.out.println("\n Você ganhou");
			mostraPontuacao();
			System.exit(1);
		} 
		else if (qtdeAcertos < 3 && numeroRodada == fabrica.tamanhoListaPalavras) {
			System.out.println("\n Game Over!");
			mostraPontuacao();
			System.exit(1);
		}
			
	}

	@Override
	public void mostraPontuacao() {
		System.out.println("\n Quantidade de acertos: " + qtdeAcertos);
	}

	@Override
	public String mostraPalavraInvertida(int numeroRodada) {
		fabrica.retornaFuncaoEmbaralhadora();
		return "\n Palavra embaralhada: " + fabrica.getPalavrasEmbaralhadas().get(numeroRodada-1);
	}

	
	

}
