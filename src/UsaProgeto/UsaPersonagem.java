package UsaProgeto;

import projeto.Personagem;

public class UsaPersonagem {

	public static void main(String[] args) {
		 Personagem heroi = new Personagem((byte)48,(byte)77,(byte)99);
		 Personagem vilao = new Personagem((byte)33,(byte)71,(byte)45);
	
		System.out.println("heroi"+heroi);
		System.out.println("\nvilao"+vilao);
		heroi.luta(vilao);	   
	}
}	

