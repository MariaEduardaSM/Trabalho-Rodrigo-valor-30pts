
public class Questao2 {

	public static void main(String[] args) {
		int [] VetorA = {2,1,3,4,8,5,7,3,9,0};
		int [] VetorB = {3,2,4,5,1,2,3,4,5,6};
		int VetorC[] = new int[10];
		int i;
		
		for (i=0; i<10; i++) {
	         VetorC[i] = VetorA[i] + VetorB[i];
	     }
		System.out.println("Vetor A:");
	     for (i=0; i<10;i++ ) {
		     System.out.print (" " +  VetorA[i]);
	     }
	    
	     System.out.println("\n Vetor B:");
	     for (i=0; i<10;i++ ) {
		     System.out.print (" " +  VetorB[i]);
	     }
	     System.out.println("\n Vetor c:");
	     for (i=0; i<10;i++ ) {
		     System.out.print (" " +  VetorC[i]);
	     }
	}

}
