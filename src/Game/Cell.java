package Game;

public class Cell {
	int position;
	int lifePoints;
	boolean empty;
	String itemType;
	int damagePoints;
	
	public Cell() {
		this.position = 0;
		this.lifePoints = 0;
		this.empty = true;
		this.itemType = "X";
		this.damagePoints = 0;
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
			String lifeInt= Integer.toString(this.lifePoints);
			cellInfo=cellInfo.concat(lifeInt);
			cellInfo=cellInfo.concat("] ");
			return cellInfo;
		}
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	
	
}


