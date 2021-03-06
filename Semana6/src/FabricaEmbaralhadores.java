import java.util.ArrayList;

public class FabricaEmbaralhadores {
	
	
	int qualFuncao = (int) ((Math.random() * ((2) + 1)) + 1); 
	BancoDePalavras banco = new BancoDePalavras();
	int tamanhoListaPalavras = banco.lePalavrasArquivo().size();
	int qualPalavra = (int) ((Math.random() * ((5) + 1)) + 1); 
	private ArrayList<String> palavrasCorretas = new ArrayList<String>();
	private ArrayList<String> palavrasEmbaralhadas = new ArrayList<String>();
	int cont = 0;

	
	public void retornaFuncaoEmbaralhadora () {
		
		while (cont < tamanhoListaPalavras) {
			int qualFuncao = (int) ((Math.random() * ((2) + 1)) + 1); 
			switch (qualFuncao)
			{
				case 1:
					String palavra1 = banco.retornaPalavraAleatoria();
					palavrasCorretas.add(palavra1);
					StringInvertida str1 = new StringInvertida(palavra1);
				    palavrasEmbaralhadas.add(str1.embaralhaPalavra());
				    
				    cont++;
				case 2:
					String palavra2 = banco.retornaPalavraAleatoria();
					palavrasCorretas.add(palavra2);
				    TrocaImparPorPar str2 = new TrocaImparPorPar(palavra2);
				    palavrasEmbaralhadas.add(str2.embaralhaPalavra());
				    
				    cont++;
				default:
					String palavra3 = banco.retornaPalavraAleatoria();
					palavrasCorretas.add(palavra3);
				    EmbaralhaMetade str3 = new EmbaralhaMetade (palavra3);
				    palavrasEmbaralhadas.add(str3.embaralhaPalavra());
				    
				    cont++;
			}
			
		}
		cont = 0;
	}

	public ArrayList<String> getPalavrasCorretas() {
		return palavrasCorretas;
	}

	public void setPalavraCorreta(ArrayList<String> palavrasCorretas) {
		this.palavrasCorretas = palavrasCorretas;
	}
	
	public ArrayList<String> getPalavrasEmbaralhadas() {
		return palavrasEmbaralhadas;
	}

	public void setPalavrasCorretas(ArrayList<String> palavrasEmbaralhadas) {
		this.palavrasEmbaralhadas = palavrasEmbaralhadas;
	}
	
	
	public int getTamanhoLista() {
		return tamanhoListaPalavras;
	}
	

}

