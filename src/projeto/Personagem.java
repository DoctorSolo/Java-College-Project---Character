package projeto;

public class Personagem {
	private byte força;
	private byte destreza;
	private byte velocidade;
	
	public Personagem(byte força, byte destreza, byte velocidade) {
		super();
		this.força = força;
		this.destreza = destreza;
		this.velocidade = velocidade;
	}
	
	
	public byte getForça() {
		return força;
	}

	public void setForça(byte força) {
		this.força = força;
	}

	public byte getDestreza() {
		return destreza;
	}

	public void setDestreza(byte destreza) {
		this.destreza = destreza;
	}

	public byte getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(byte velocidade) {
		this.velocidade = velocidade;
	}
	  public void luta(Personagem oponente) {
	        if (this.força +this.destreza + this.velocidade> oponente.getForça()+ oponente.getDestreza() + oponente.getVelocidade()) {
	            System.out.println("Herói venceu a luta!");
	        } else {
	            System.out.println("Vilão venceu. Treine mais!");
	        }
	    }

	
	public String toString() {
		return "\nPersonagem força=" + força + "\n destreza=" + destreza + "\n velocidade=" + velocidade ;
	}
	
}
