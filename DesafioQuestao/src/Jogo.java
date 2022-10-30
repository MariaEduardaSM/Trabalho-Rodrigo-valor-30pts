import java.util.Scanner;

public class Jogo {
	   private Tabuleiiro tabuleiro;
	    private int rodada=1, vez=1;
	    private Jogador jogador1;
	    private Jogador jogador2;
	    public Scanner entrada = new Scanner(System.in);

	    
	    public Jogo(){
	        tabuleiro = new Tabuleiiro();
	       iniciarJogadores();
	        
	        while( Jogar() );
	    }
	    
	    public void iniciarJogadores(){
	      
	        if(escolherJogador() == 1)
	            this.jogador1 = new JGD(1);
	        else
	            this.jogador1 = new JGD(1);
	    
	      
	        
	        if(escolherJogador() == 1)
	            this.jogador2 = new JGD(2);
	        else
	            this.jogador2 = new JGD(2);
	        
	    }
	    
	   private int escolherJogador() {
			
			return 0;
		}


	    public boolean Jogar(){
	        if(ganhou() == 0 ){
	            System.out.println("----------------------");
	            System.out.println("Rodada "+rodada);
	            System.out.println("É a vez do jogador " + vez() );
	            System.out.println("Entre com a linha e a coluna q deseja prencher:");
	            
	            if(vez()==1)
	                jogador1.jogar(tabuleiro);
	            else
	                jogador2.jogar(tabuleiro);
	            
	            
	            if(tabuleiro.tabuleiroCompleto()){
	                System.out.println("Empate");
	                return false;
	            }
	            vez++;
	            rodada++;

	            return true;
	        } else{
	            if(ganhou() == -1 )
	                System.out.println("Jogador 1 ganhou!");
	            else
	                System.out.println("Jogador 2 ganhou!");
	            
	            return false;
	        }
	            
	    }
	    
	    public int vez(){
	        if(vez%2 == 1)
	            return 1;
	        else
	            return 2;
	    }
	    
	    public int ganhou(){
	        if(tabuleiro.checaLinhas() == 1)
	            return 1;
	        if(tabuleiro.checaColunas() == 1)
	            return 1;
	        if(tabuleiro.checaDiagonais() == 1)
	            return 1;
	        
	        if(tabuleiro.checaLinhas() == -1)
	            return -1;
	        if(tabuleiro.checaColunas() == -1)
	            return -1;
	        if(tabuleiro.checaDiagonais() == -1)
	            return -1;
	        
	        return 0;
	    }
	    
	
}
