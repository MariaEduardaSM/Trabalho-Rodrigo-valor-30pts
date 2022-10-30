import java.util.Scanner;

public class JGD extends Jogador  {
	 
	
	    public JGD(int jogador) {
		super(jogador);
		this.jogador = jogador;
        
		
	}
	    
		public Scanner entrada = new Scanner(System.in);
	    
	  
	    
	    @Override
	    public void jogar(Tabuleiiro tabuleiro){
	        Tentativa(tabuleiro);
	        tabuleiro.setPosicao(tentativa, jogador);
	    }
	    
	    @Override
	    public void Tentativa(Tabuleiiro tabuleiro){
	        do{
	            do{
	                System.out.print("Linha: ");
	                tentativa[0] = entrada.nextInt();
	                
	                if( tentativa[0] > 3 ||tentativa[0] < 1)
	                    System.out.println("Linha inválida. É 1, 2 ou 3");
	                
	            }while( tentativa[0] > 3 ||tentativa[0] < 1);
	            
	            do{
	                System.out.print("Coluna: ");
	                tentativa[1] = entrada.nextInt();
	                
	                if(tentativa[1] > 3 ||tentativa[1] < 1)
	                    System.out.println("Coluna inválida. É 1, 2 ou 3");
	                
	            }while(tentativa[1] > 3 ||tentativa[1] < 1);
	            
	            tentativa[0]--; 
	            tentativa[1]--;
	            
	            if(!checaTentativa(tentativa, tabuleiro))
	                System.out.println("Esse local já foi marcado. Tente outro.");
	        }while( !checaTentativa(tentativa, tabuleiro) );
	    }
	}


