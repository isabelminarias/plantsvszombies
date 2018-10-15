package Game;

public class Row {
	Cell[] cell = new Cell[8]; 
	int ZombiesCount; 
	
	public Row() {
		for(int i = 0; i < 8; i++) {
			cell[i]= new Cell();
		}
	}
	
	String getCell(int i, int n) {
		return cell[i].returnCell();
	}
	
	Cell getCell(int i) {
		return cell[i];
	}
	
}

