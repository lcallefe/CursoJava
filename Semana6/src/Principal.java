import java.util.Scanner;

public class Principal {
	
	

	public static void main(String[] args) {
		int op = 0;
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		int qtdeRodadas = fabrica.getTotalRodadas();
		Scanner scan = new Scanner(System.in);
		
		while (op!=1 && op!=2) {
			
			
			System.out.println("\n Insira a opção do jogo: 1 - Fácil, 2 - Difícil ");
			op = scan.nextInt();
		}
		if (op==1) {
			for (int i=1; i<=qtdeRodadas+1;i++) {
				
				String palpite;
				fabrica.mostraPalavraEmbaralhada(op, i);
				System.out.println("\n\r Qual o seu palpite? ");
		        palpite = scan.next();
		        fabrica.verificaPalpiteUsuarioEasy(palpite);
			}
		}
		else if (op==2) {
			for (int i=1; i<=qtdeRodadas+1;i++) {
				
				String palpite;
				fabrica.mostraPalavraEmbaralhada(op, i);
				System.out.println("\n\r Qual o seu palpite? ");
		        palpite = scan.next();
		        fabrica.verificaPalpiteUsuarioHard(palpite);
			}
			
		}
        
        

	}


}
