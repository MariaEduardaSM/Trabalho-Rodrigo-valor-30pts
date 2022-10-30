

public class Questao1 {

	public static void main(String[] args) {
		
	      
	     int []a = {1,2,3,4,5,6,7,8,9,0};
	     int b[] = new int[10];
	     int i; 

	     for (i=0; i<10; i++) {
	         b[i] = a[i] * i;
	     }
	     System.out.println("Vetor A:");
	     for (i=0; i<10;i++ ) {
		     System.out.print (" " +  a[i]);
	     }
	    
	     System.out.println("\n Vetor B:");
	     for (i=0; i<10;i++ ) {
		     System.out.print (" " +  b[i]);
	     }
	}

}
