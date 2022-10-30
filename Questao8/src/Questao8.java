import java.util.Scanner;
public class Questao8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double mat[][] = new double[2][5];
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.print("Digite o valor "+(l+1)+"."+(c+1)+" : ");
				mat[l][c] = ler.nextDouble();
			}
		}
		System.out.println("\n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.print("["+mat[l][c]+"] ");
			}
			System.out.println("\n");
		}
	}

}