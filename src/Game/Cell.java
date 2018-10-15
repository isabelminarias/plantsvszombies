package Game;

public class Cell {
	int position;
	int hp;
	int birth;
	boolean empty;
	String itemType;
	int dmg;
	
	public Cell() {
		this.position = 0;
		this.hp = 0;
		this.empty = true;
		this.dmg = 0;
	}
	
	public Cell(int turn, int p) {
		this.position = p;
	}
	
	public String returnCell() {
		if(this.empty == true) {
			String emptyString = "     ";
			return emptyString;
		}
		else {
			String cellInfo; 
			cellInfo="".concat(this.itemType);
			cellInfo= cellInfo.concat(" [");
			String lifeInt= Integer.toString(this.hp);
			cellInfo=cellInfo.concat(lifeInt);
			cellInfo=cellInfo.concat("] ");
			return cellInfo;
		}
	}
	public boolean checkCell() {
		if (this.empty == true){
			return true;
		}
		else
			return false;
	}
	
	void move(int n) {
		
	}
	
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getHP() {
		return hp;
	}
	public void setHP(int lifePoints) {
		this.hp = lifePoints;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	public void emptyCell() {
		this.position = 0;
		this.hp = 0;
		this.empty = true;
		this.dmg = 0;
	}
	
	
	
}


