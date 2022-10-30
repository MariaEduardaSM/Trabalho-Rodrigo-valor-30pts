import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		int [] vetorzinho = new int[10];
		int i , ord, j;
		
		Scanner ler = new Scanner(System.in);
		for (i=0; i<10; i++) {
			System.out.printf("Informe o numero: ");
			vetorzinho[i] = ler.nextInt();
		}
		for(i=0; i<vetorzinho.length; i++) {
			for( j=0; j<vetorzinho.length; j++) {
				if(vetorzinho[i]< vetorzinho[j]) {
					ord = vetorzinho[i];
					vetorzinho[i] = vetorzinho[j];
					vetorzinho[j]= ord; 
				}
			}
		}
		
		System.out.println("\n Vetor em ordem crescente: ");
		for(i=0; i<vetorzinho.length; i++) {
			System.out.print(vetorzinho[i] + ", ");
		}
	}

}
