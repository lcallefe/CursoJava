
public class StringInvertida implements Embaralhador {

	String palavra;
	
	public StringInvertida (String palavra) {
		this.palavra = palavra;
	}
	
	@Override
	public String embaralhaPalavra() {
		
		byte [] palavraPraByte = palavra.getBytes(); 
		byte [] resultado =  new byte [palavraPraByte.length]; 
		for (int i = 0; i<palavraPraByte.length; i++) 
			resultado[i] = palavraPraByte[palavraPraByte.length-i-1]; 
		 
		 return new String (resultado);
	}
	
	

}
