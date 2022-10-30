
public abstract class  Jogador {
	  protected int[] tentativa = new int[2];
	    protected int jogador;

	    
	    public Jogador(int jogador){
	        this.jogador = jogador;
	    }
	    
	    public abstract void jogar(Tabuleiiro tabuleiro);
	    
	    public abstract void Tentativa(Tabuleiiro tabuleiro);

	    public boolean checaTentativa(int[] tentativa, Tabuleiiro tabuleiro){
	        if(tabuleiro.getPosicao(tentativa) == 0)
	            return true;
	        else
	            return false;
	            
	    }

}
