import java.util.Scanner;
public class Cinco {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1[] = new double[10];
		double nota2[] = new double[10];
		double result[] = new double[10];
		
		for(int i = 0; i < nota1.length; i++) {
			System.out.print("Digite a primeira nota do "+(i+1)+" aluno: ");
			nota1[i] = ler.nextDouble();
			System.out.print("Digite a segunda nota do "+(i+1)+" aluno: ");
			nota2[i] = ler.nextDouble();
		}
		System.out.println("\n");
		for (int i1 = 0; i1 < result.length; i1++) {
			result[i1] = (nota1[i1] + nota2[i1])/2;
			if (result[i1] >= 7) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado!");
			}
		}
	}
}
