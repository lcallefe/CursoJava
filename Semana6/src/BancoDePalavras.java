import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	
	
	File file = new File("C:\\Users\\LucianaCallefeDonadi\\Desktop\\listapalavras.txt"); 
	String palavra;
	ArrayList<String> palavras = new ArrayList<String>();
	int tamanho;
	
	
	@SuppressWarnings("resource")
	public ArrayList<String> lePalavrasArquivo () {
		
		
		try {
			Scanner sc;
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				palavra = sc.nextLine();
				palavras.add(palavra);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		return palavras;
	}
	
	public String retornaPalavraAleatoria () {
		lePalavrasArquivo ();
		Random aleatoria = new Random();
		tamanho = aleatoria.nextInt(palavras.size());
		String palavraAleatoria = palavras.get(tamanho);
		return palavraAleatoria;
	}
	
	

}
