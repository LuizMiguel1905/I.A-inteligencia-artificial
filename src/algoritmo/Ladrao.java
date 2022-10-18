package algoritmo;

import java.util.Random;

public class Ladrao extends ProgramaLadrao {
	
	public boolean direita = false;
	public  boolean esquerda = false;
	public boolean cima = false;
	public boolean baixo = false;
	
	
	public int acao() {
		

		
		for(int i = 0; i < 24; i++){
			
			int inimigo = sensor.getVisaoIdentificacao()[i];
			//Inimigo em sua visão
			if(inimigo == 100 || inimigo == 110) {
				
				
				
				if(i > 11) {
					//Se mover para baixo e direita
					
					int valor = new Random().nextInt(100) + 1;
					
					if(valor > 60) {
						System.out.println("Baixo");
						baixo = true;
						return (2);
					}
					if(valor < 59) {
						direita = true;
						System.out.println("Direita");
						return (3);
					}
				}
				if(i < 12) {
					//Se mover para cima e para esquerda
					int valor = new Random().nextInt(100) + 1;
					if(valor > 60) {
						cima = true;
						System.out.println("Cima");
						return (1);
					}
					if(valor < 59) {
						esquerda = false;
						System.out.println("Esquerda");
						return (4);
					}
				}

			}
		}
		
		
			return (int) (Math.random()*5);

	}

}
