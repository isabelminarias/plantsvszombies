package Creatures;

import Game.Cell;

public class Sunflower extends Cell {
	
	int hp = 3;


	private int sunGeneration(int turn, int creation) {
		//Verificacion de que hayan pasado dos turnos 
		//Ejemplo: Se creo en el turno 3, y estamos en el turno 9, 9-3=6, 6%2=0, ya han pasado dos turnos 
		// o mas... entonces se reciben soles! 
		if ((turn-creation)%2 == 0) {
			return 10;
		}
		else {
			return 0;
		}
	}
}
