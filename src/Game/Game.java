package Game;

import java.util.Scanner;

public class Game {
	static Board b = new Board();
	int seed;
	int currentTurn = 0;
	int soles = 50;
	boolean gaming = true;
	Scanner sc = new Scanner(System.in);

	
	/// ! Constructores !
	
	public Game(int seed) {
		//Generate a game according to a seed
	}
	
	public Game() {
		b = new Board();
	}
	
	/// ! Getters y Setters !
	
	public int getCurrentTurn() {
		return currentTurn;
	}

	public void setCurrentTurn(int currentTurn) {
		this.currentTurn = currentTurn;
	}
	
	public int getSoles() {
		return soles;
	}
	
	public void setSoles(int soles) {
		this.soles = soles;
	}
	
	public int getSeed() {
		return seed;
	}
	
	public void setSeed(int s) {
		this.seed = s;
	}
	
	
	/// ! Logica del Juego !
		
		public void start(int gameCount) {
			System.out.println("Welcome to Game #"+gameCount);
			this.draw();
			currentTurn++;
			this.userCommand();
			int i = 0;
			do {
				i++;
				this.update();
				this.draw();
				this.userCommand();
				this.computerAction();
				currentTurn++;
			} while (i<2 && gaming == true);
		}
		
		
		
		public void update() {
			System.out.println("Update time");
		}
		
		public void draw() {
			System.out.println("Turn: #"+currentTurn);
			System.out.println("Suns:"+soles);
			b.drawBoard();
		}
		
		//Flower Master's turn
		public void userCommand() {
			
			int choice = 0;
			boolean userDecides = false;
			do {
				System.out.print("Command > ");
				String in = sc.next();
				
				if(in.charAt(0)=='a' || in.charAt(0)=='A') {
				choice = 1;
				userDecides = true;
				}
				else if(in.charAt(0)=='l' || in.charAt(0)=='L') {
				choice = 2;
				}
				else if(in.charAt(0)=='r' || in.charAt(0)=='R') {
				choice = 3;	
				userDecides = true;
				}
				else if(in.charAt(0)=='h' || in.charAt(0)=='H') {
				choice = 4;	
				}
				else if(in.charAt(0)=='e' || in.charAt(0)=='E') {
				choice = 5;
				System.out.println("Dude... GAME OVER! Bai.");
				userDecides = true;
				}
				else if (in.isEmpty()) {
				choice = 6; 
				userDecides = true;
				}
				
				switch(choice) {
				//Agregar una planta
				case 1:
					break;
				//Listar las plantas disponibles
				case 2:
					System.out.println("[S]unflower: 	Cost - 20  suncoins |	Harm - 0");
					System.out.println("[P]eashooter: 	Cost - 50 suncoins |	Harm - 1");
					break;
				//Resetea el juego
				case 3: 
					gaming = false;
					break;
				//Imprime la lista de comandos disponibles.
				case 4:
					System.out.println("Add <plant><x><y>: Adds a plant in position x, y.");
					System.out.println("List: prints the list of available plants.");
					System.out.println("Reset: Starts a new game.");
					System.out.println("Help: prints this help message.");
					System.out.println("Exit: terminates the program.");
					System.out.println("[none]: Skips cycle.");
					break;
				//Cierra la consola
				case 5:
					System.exit(0);
					break;
				case 6:
					//Nothing happens. Player skips a turn.
					break;
				default:
					System.out.println("There's an input error. Please check again.");
				}
			}while(userDecides == false);
				
			
			
		}
		
		//Virtual zombie pile (*insert witty Zombie film reference*)
		public void computerAction() {
			System.out.println("The computer is working its evil magic");
		}
	
	
	

}
