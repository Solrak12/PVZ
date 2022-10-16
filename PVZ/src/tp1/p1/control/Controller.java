package tp1.p1.control;

import static tp1.p1.view.Messages.*;

import java.util.Scanner;

import tp1.p1.logic.Game;
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

	private Scanner scanner;

	private GamePrinter gamePrinter;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		this.gamePrinter = new GamePrinter(game);
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
	public void run() {
		char op = scanner.next().charAt(0);
		switch(op) {
		case 'a':
			//ADD 
			break;
		case 'l':
			System.out.println(this.game.listPlants() +"\n");
			break;
		case 'r':
			game.reset();
			break;
		case 'h':
			System.out.println("Add <plant> <col> <row>: add a plant in position (col, row)" + "\n" + "List: print the list of available plants"+"\n" +
			"Reset: start a new game" + "\n" + "Help: print this help message" + "\n" + "Exit: terminate the program" + "\n" + "None | \"\": skips cycle");
			
			break;
		case 'e':
			System.out.println(StringUtils.centre("GAME OVER",100));
			System.exit(0);
			break;
		case 'n':
			if(game.getZombiesLeft().zombieRandom() && game.getZombiesLeft().getRemainingZombies() > 0) {
				Zombie z = new Zombie(game.getRandom(),7);
				game.addZombie(z);
			}
			this.game.setContCiclos(this.game.getContCiclos()+1);
			game.Update();
			System.out.println(game.draw());
			System.out.println(this.game.getGamePrinter().toString());
			break;
		}
		
		
	}

}