package Creatures;

import Game.Cell;

public class Peashooter extends Cell {
	
	int hp = 5;
	int dmg = 2;
	
	public Peashooter (int pos){
		super.setPosition(pos);
	}
	
	public int damage(int hit) {
		if (this.hp - hit < 1) {
			this.emptyCell();
			return 0;
		}
		else {
			this.setHP(this.hp-hit);
			return 1;
		}
	}
}
