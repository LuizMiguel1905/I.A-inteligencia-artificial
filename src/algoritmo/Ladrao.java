package algoritmo;

import java.util.Random;

public class Ladrao extends ProgramaLadrao {

	private int direcao = 0;
	private boolean alerta = false;
	public void perseguir() {
			this.direcao = 0;
		for(int i = 0; i < 24; i++){
			
			int inimigo = sensor.getVisaoIdentificacao()[i];
			//Inimigo em sua visão
			if(inimigo == 100 || inimigo == 110 && alerta == true) {

				//Norte
				if(i == 2 || i == 7) {
					int valor = new Random().nextInt(100) + 1;
					if(valor < 80) {

						this.direcao = 1;
					} else if(valor >=80 && valor < 90) {

						this.direcao = 4;
					} else if(valor >=90 && valor < 100) {

						this.direcao = 3;
					} else if(valor == 100) {

						this.direcao = 2;
					}
					
				}
				//Oeste
				if(i == 10 || i == 11) {
					int valor = new Random().nextInt(100) + 1;
					if(valor < 80) {

						this.direcao = 4;
					} else if(valor >=80 && valor < 90) {

						this.direcao = 1;
					} else if(valor >=90 && valor < 100) {

						this.direcao = 2;
					} else if(valor == 100) {

						this.direcao = 3;
					}
					
				}
				//Leste
				if(i == 12 || i == 13) {
					int valor = new Random().nextInt(100) + 1;
					if(valor < 80) {

						this.direcao = 3;
					} else if(valor >=80 && valor < 90) {

						this.direcao = 1;
					} else if(valor >=90 && valor < 100) {

						this.direcao = 2;
					} else if(valor == 100) {

						this.direcao = 4;
					}
					
				}
				//Sul
				if(i == 16 || i == 21) {
					int valor = new Random().nextInt(100) + 1;
					if(valor < 80) {

						this.direcao = 2;
					} else if(valor >=80 && valor < 90) {

						this.direcao = 4;
					} else if(valor >=90 && valor < 100) {

						this.direcao = 3;
					} else if(valor == 100) {

						this.direcao = 1;
					}
					
				}
				
				//Noroetes
				if(i == 0 || i == 1 || i == 5 || i == 6) {
					//Se mover para esquerda e cima
					
					int valor = new Random().nextInt(100) + 1;
					
					if(valor > 60) {

						
						this.direcao = 4;
					}
					if(valor < 59) {


						this.direcao = 1;
					}
				}
				
				//Nordeste
				if(i == 3 || i == 4 || i == 8 || i == 9) {
					//Se mover para direita e cima
					
					int valor = new Random().nextInt(100) + 1;
					
					if(valor > 60) {

						
						this.direcao = 3;
					}
					if(valor < 59) {


						this.direcao = 1;
					}
				}
				//Sudoeste
				if(i == 17 || i == 18 || i == 22 || i == 23) {
					//Se mover para esquerda e baixo
					
					int valor = new Random().nextInt(100) + 1;
					
					if(valor > 60) {

						
						this.direcao = 4;
					}
					if(valor < 59) {


						this.direcao = 2;
					}
				}				
				
				//Sudeste
				if(i == 17 || i == 18 || i == 22 || i == 23) {
					//Se mover para baixo e direita
					
					int valor = new Random().nextInt(100) + 1;
					
					if(valor > 60) {


						this.direcao = 2;
					}
					if(valor < 59) {


						this.direcao = 3;
					}
				}


			}
		}
	}

	public void investigar() {
		this.direcao = 0;
		for(int i = 0; i < 8; i++) {
			if(sensor.getAmbienteOlfatoPoupador()[i] > 0) {
				//Norte
				if(i == 0) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						this.direcao = 1;
					} else if(valor >=90 && valor < 97) {

						this.direcao = 4;
					} else if(valor >=97 && valor <= 100) {

						this.direcao = 3;
					}
				}
				if(i == 1) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						perseguir();
					} else if(valor >=90 && valor < 97) {

						this.direcao = 3;
					} else if(valor >=97 && valor <= 100) {

						this.direcao = 4;
					}

				}
				if(i == 2) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						this.direcao = 1;
					} else if(valor >=90 && valor < 95) {

						this.direcao = 4;
					} else if(valor >=90 && valor < 100) {

						this.direcao = 3;
					}
				}
				
				//Leste
				if(i == 3) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						perseguir();
					} else if(valor >=90 && valor < 97) {

						this.direcao = 1;
					} else if(valor >=97 && valor <= 100) {

						this.direcao = 2;
					}

				}
				//Oeste
				if(i == 4) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						perseguir();
					} else if(valor >=90 && valor < 97) {

						this.direcao = 1;
					} else if(valor >=97 && valor <= 100) {

						this.direcao = 2;
					}

				}
				//Sul
				if(i == 5) {
					this.alerta = true;
					this.direcao = 2;
				}
				if(i == 6) {
					this.alerta = true;
					int valor = new Random().nextInt(100) + 1;
					if(valor < 90) {

						perseguir();
					} else if(valor >=90 && valor < 97) {

						this.direcao = 4;
					} else if(valor >=97 && valor <= 100) {

						this.direcao = 3;
					}

				}
				if(i == 7) {
					this.alerta = true;
					this.direcao = 2;
				}

			}

		}
	}
	
	public void andar() {
		this.alerta = false;
		for(int i = 0; i < 8; i++) {
			if(sensor.getAmbienteOlfatoPoupador()[i] > 0) {
				investigar();
			}
		}
		if(alerta == false) {
			this.direcao = (int)(Math.random()*5);
		}

			
	}
	public int acao() {

		andar();
		return direcao;

	}

}
