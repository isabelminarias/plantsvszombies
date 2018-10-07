import java.util.*;

import Game.*;

public class PlantsVsZombies {

	public static void main(String[] args) {
		boolean gaming;
		Scanner sc = new Scanner(System.in);
		int gameCount = 0;
		
		//Menu de inicio 
		//Aqui se preguntara si se quiere jugar (y en caso de que se termine un juego y se quiera 
		//iniciar uno nuevo, se podra o terminar (exit de la consola) o seguir. 
		
		do { 
		gameCount++;
		System.out.println("Welcome to Plants Vs Zombies! Do you want to play a new game? ");
		String in = sc.next();
		if(in.charAt(0)=='Y' || in.charAt(0)=='y' || in.charAt(0)=='S' || in.charAt(0)=='s'  ) {
			gaming = true;
			
			//Aqui se inicializa el juego. Se preguntara si se quiere seed o no.
			
			/// ! ! ! ! ! ! 
			
			//Seed actualmente no funcional
			
			/// ! ! ! ! ! ! 
			
			System.out.println("Do you want a randomized board?");
			in = sc.next();
			if(in.charAt(0)=='Y' || in.charAt(0)=='y' || in.charAt(0)=='S' || in.charAt(0)=='s'  ) {
				
				//Seed initialization
				
			}
			else {
				
				//Inicializacion normal/default
				Game game = new Game();
				game.start(gameCount);
			}
			
		}
		else {
			System.out.println("Do you want to exit? ");
			boolean exiting;
			in = sc.nextLine();
			if(in.charAt(0)=='Y' || in.charAt(0)=='y' || in.charAt(0)=='S' || in.charAt(0)=='s'  ) {
				gaming = false;
				System.exit(0);
			}
			else {
				exiting = false;
				gaming = true;
			}
		}
		} while(gaming == true);
		

	}

}
