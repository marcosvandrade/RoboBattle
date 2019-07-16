package modelo.construtores;

import java.util.Random;

import modelo.robos.Peca;

public class ConstrutorDePeca {
	
	//Constroi uma peça com 12 pontos distribuidos nos
	//Atributos
	public Peca construirPeca() {
		Random rand = new Random();
		int ataque = 0, defesa = 0, velocidade = 0, durabilidade = 0, durabilidadeBase = 1, n = 15, resistencia = 0, poder = 0;
		for (int i = 0; i < n; i++) {
			switch(rand.nextInt(6)) {
			case 0:		ataque++;		break;
			case 1:		defesa++;		break;
			case 2:		velocidade++;	break;
			case 3:		durabilidade++;	break;
			case 4:		resistencia++;	break;
			case 5:		poder++;		break;
			}
		}
		
		Peca p = new Peca(ataque, defesa, velocidade, durabilidadeBase + durabilidade, resistencia, poder);
		return p;
	}
	
}