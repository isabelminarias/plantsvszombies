import java.util.*;

import Game.*;

public class PlantsVsZombies {

	public static void main(String[] args) {
		boolean gaming;
		int seed = 0;
		int level; 
		Scanner sc = new Scanner(System.in);
		
		//Menu de inicio 
		//Aqui se preguntara si se quiere jugar (y en caso de que se termine un juego y se quiera 
		//iniciar uno nuevo, se podra o terminar (exit de la consola) o seguir. 
		
		do { 
		System.out.println("Welcome to Plants Vs Zombies! Do you want to play a new game? ");
		String in = sc.next();
		if(in.charAt(0)=='Y' || in.charAt(0)=='y' || in.charAt(0)=='S' || in.charAt(0)=='s'  ) {
			gaming = true;
			
			//	Aqui se inicializa el juego. 
			//	A continuacion, se preguntara si se quiere seed o no.
			
			/// ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !
			
			//	Seed actualmente no funcional
			
			/// ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !
			
			System.out.println("Do you want a randomized board?");
			in = sc.next();
			if(in.charAt(0)=='Y' || in.charAt(0)=='y' || in.charAt(0)=='S' || in.charAt(0)=='s'  ) {
				System.out.println("Alrighty, hit me with a number between 1-99");
				in = sc.next();
				if (Integer.getInteger(in) != null)
					seed = Integer.getInteger(in);
				//Seed initialization
				Game game = new Game(seed); 
				
			}
			else {
				//Inicializacion normal/default
				Game game = new Game(seed);
				game.start();
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
