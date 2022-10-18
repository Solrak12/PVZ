package tp1.p1.control;

import static tp1.p1.view.Messages.*;

import java.util.Scanner;

import tp1.p1.logic.Game;
import tp1.p1.logic.ZombiesManager;
import tp1.p1.logic.gameobjects.Peashooter;
import tp1.p1.logic.gameobjects.Sunflower;
import tp1.p1.logic.gameobjects.Zombie;
import tp1.p1.view.GamePrinter;
import tp1.p1.view.Messages;
import tp1.utils.StringUtils;

/**
 * Accepts user input and coordinates the game execution logic.
 *
 */
public class Controller {

	private Game game;
	
	private ZombiesManager zombies;

	private Scanner scanner;

	private GamePrinter gamePrinter;
	
	private int X,Y;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		this.gamePrinter = new GamePrinter(game,X,Y);
	}

	/**
	 * Draw / Paint the game.
	 */
	private void printGame() {
		System.out.println(gamePrinter);
	}

	/**
	 * Prints the final message once the match is finished.
	 */
	public void printEndMessage() {
		System.out.println(gamePrinter.endMessage());
	}

	/**
	 * Show prompt and request command.
	 *
	 * @return the player command as words
	 */
	private String[] prompt() {
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		String[] words = line.toLowerCase().trim().split("\\s+");

		System.out.println(debug(line));

		return words;
	}

	/**
	 * Runs the game logic.
	 */
	public void run() { //MENU
		char op = scanner.next().charAt(0);
		String[] word = null;
		System.out.println("Command >");
		switch(op) {
		case 'a': //AÑADE PLNTAS
			int x = Integer.parseInt(word[2]);
			int y =Integer.parseInt(word[3]);
			if(x<0||x>4&&y<0||y>7) { //SI SE PONE DENTRO DEL TABLERO
			if(word[1].equals("p") || word[1].equals("s") || word[1].equals("Peashooter")|| word[1].equals("Sunflower")) {
				if(word[1].equalsIgnoreCase("p")||word[1].equalsIgnoreCase("Peashooter")) { //SI SE ESCRIBE ESAS LETRAS CORRECTAS ACCIONA
					if(game.getSoles() >=50) {
						Peashooter pesh = new Peashooter(x,y);
						game.addPeashooter(pesh);
					}
					else
						System.out.println("No tienes suficientes soles");
				
				}
				else if(word[1].equalsIgnoreCase("s")|| word[1].equalsIgnoreCase("Sunflower")) {
					if(game.getSoles() >=20) {
						Sunflower sunf = new Sunflower(x,y);
						game.addSunflower(sunf);
					}
					else
						System.out.println("No tienes suficientes soles");
				}
				if(game.getZombiesLeft().shouldAddZombie() && game.getZombiesLeft().getRemainingZombies() > 0) { //PASA EL TURNO Y AÑADE UN ZOMBIE
					Zombie z = new Zombie(zombies.randomZombieRow(),7);
					zombies.addZombie();
				}
				this.game.setContCiclos(this.game.getContCiclos()+1);
				game.Update();
			}
			else 
				System.out.println("No se puede poner");
			}
			System.out.println(gamePrinter.getInfo());
			System.out.println(this.game.getGamePrinter().toString());
			
			break;
		case 'l': //MUESTRA LA LISTA DE PLANTAS
			System.out.println(this.game.ListPlants() +"\n");
			break;
		case 'r': //RESETEA LA PARTIDA
			game.reset();
			break;
		case 'h': //COMANDOS DE AYUDA
			System.out.println(Messages.HELP_LINES);
			
			break;
		case 'e'://SALE DEL JUEGO
			System.out.println("GAME OVER");
			System.exit(0);
			break;
		case 'n'://PASA TURNO 
			if(game.getZombiesLeft().shouldAddZombie() && game.getZombiesLeft().getRemainingZombies() > 0) {
				Zombie z = new Zombie(zombies.randomZombieRow(),7);
				zombies.addZombie();
			}
			this.game.setContCiclos(this.game.getContCiclos()+1);
			game.Update();
			System.out.println(gamePrinter.getInfo());
			System.out.println(this.game.getGamePrinter().toString());
			break;
		default :
			System.out.println("Ese comando no es valido\n");
		}
		
		
	}

}