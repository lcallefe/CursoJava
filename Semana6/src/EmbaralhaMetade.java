
public class EmbaralhaMetade implements Embaralhador {
	
	int subInt1;
	int subInt2;
	String palavra;

	public EmbaralhaMetade(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String embaralhaPalavra() {
		int tamanho = palavra.length();
		if (tamanho % 2 != 0) {
			subInt1 = (int) Math.floor(tamanho / 2);
		}
		else {
			subInt1 = (tamanho / 2 ) - 1 ;
		}
		String s1 = palavra.substring(0, subInt1);
		String s2 = palavra.substring(subInt1, tamanho);
		
		return s2 + s1;
	}
	
	

}
