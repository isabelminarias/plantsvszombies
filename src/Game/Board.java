package Game;

public class Board {
	
	Row[] rows = new Row[4];
	

	public static void main(String[] args) {
		
	}
	public Board() {
		for (int i = 0; i < 4; i ++) {
			this.rows[i]= new Row();
		}
	}
	
	void drawLine() {
		for (int i = 0; i<16; i++) {
			System.out.print(" _ ");
		}
		System.out.println();
	}
	
	void drawRow(int n) {
		for (int i = 0; i < 8; i++) {
			System.out.print(rows[n].getCell(i));
		}
	}
	
	void drawBoard() {
		for (int i = 0; i<4; i++) {
			this.drawLine();
			this.drawRow(i);
			System.out.println();
		}
		this.drawLine();
		
	}

	
	
	
	

}
