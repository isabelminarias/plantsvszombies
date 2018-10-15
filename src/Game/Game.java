package Game;

import java.util.Scanner;

public class Game {
	int gameNumber = 0;
	int currentTurn = 0;
	static Board b;
	int soles = 50;
	boolean gaming = true;
	Scanner sc = new Scanner(System.in);

	
	/// ! Constructores !
	
	public Game(int seed) {
		//Generate a game according to a seed
		b = new Board();
		gameNumber++;
	}
	
	private void endGame() {
		gaming = false;
	}
	
	
	/// ! Logica del Juego !
		
	
		public void start() {
			System.out.println("Welcome to Game #");
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
			} while (gaming == true);
		}
		
		
		
		
		public void update() {
			System.out.println("Update time");
		}
		
		// ! Here the Board reflects the changes made by the player
		public void draw() {
			System.out.println("Turn: #"+currentTurn);
			System.out.println("Suns:"+soles);
			b.drawBoard();
		}
		
		// ! The player chooses the next course of action
		public void userCommand() {
			
			int choice = 0;
			boolean userDecides = false;
			do {
				System.out.print("Command > ");
				String in = sc.nextLine();
				
				if (in.isEmpty()) {
					choice = 6; 
					userDecides = true;
					}				
				else if(in.toLowerCase().charAt(0) == 'a' && in.toLowerCase().matches("add(.*)")) {
				choice = 1;
				userDecides = true;
				}
				else if(in.toLowerCase().charAt(0) == 'l' && in.toLowerCase().matches("list")) {
				choice = 2;
				}
				else if(in.toLowerCase().charAt(0) == 'r' && in.toLowerCase().matches("reset")) {
				choice = 3;	
				userDecides = true;
				}
				else if(in.toLowerCase().charAt(0) == 'h' && in.toLowerCase().matches("help")) {
				choice = 4;	
				}
				else if(in.toLowerCase().charAt(0) == 'e' && in.toLowerCase().matches("exit") ) {
				choice = 5;
				System.out.println("Dude... GAME OVER! Bai.");
				userDecides = true;
				}
				
				switch(choice) {
				//Agregar una planta
				case 1:
					String[] inst = in.split(" ");
					//Elige un Sunflower
					if(inst[1].toLowerCase().charAt(0)=='s' && inst[1].toLowerCase().matches("sunflower") && inst.length>3) {
						//Checkea que tenga soles
						if(soles > 20) {
							//Checkea que la posicion es valida
							int x = Integer.parseInt(inst[2]);
							int y = Integer.parseInt(inst[3]);
							if (y>=0 && y<5 && x>=0 && x<9) {
								//El check cell dice si es posible meter algo aqui (true si esta vacio)
								System.out.println(b.rows[y].getCell(x).checkCell());;
							}
							
						}
						else {
							System.out.println("Insuficient soles");
							//Como no puede, lo regresamos para que vuelva a meter un comando
							userDecides = false;
						}
					}
					//Elige un Peashooter
					else if (inst[1].toLowerCase().charAt(0)=='p' && inst[1].toLowerCase().matches("peashooter")) {
						System.out.println("You're getting a peashooter");
					}
					else {
						System.out.println("There's an input error. Please check again.");
						userDecides = false;
					}
					
					
					break;
				//Listar las plantas disponibles
				case 2:
					System.out.println("[S]unflower: 	Cost - 20  suncoins |	Harm - 0");
					System.out.println("[P]eashooter: 	Cost - 50 suncoins |	Harm - 1");
					break;
				//Resetea el juego
				case 3: 
					gaming = false;
					userDecides = true;
					endGame();
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
		
		private void computerAction() {
			System.out.println("Computer Computing");
		}
	
	
	

}
