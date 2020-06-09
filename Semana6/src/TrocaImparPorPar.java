
public class TrocaImparPorPar implements Embaralhador {

	String palavra;
	
	public TrocaImparPorPar(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String embaralhaPalavra() {
		byte [] palavraPraByte = palavra.getBytes(); 
		int tamanho = palavraPraByte.length;
		for (int i = 0; i<tamanho; i++) {
			 if (i % 2 != 0 && i != tamanho - 1)
			 	palavraPraByte[i] = palavraPraByte[i+1]; 
			 else if (i % 2 != 0 && i == tamanho - 1)
			 	palavraPraByte[i] = palavraPraByte[i-1]; 
		 }
		 
		return new String (palavraPraByte);
	}
	


}
