package tp1.p1.view;

import static tp1.utils.StringUtils.*;

import tp1.p1.control.Level;
import tp1.p1.logic.Game;
import tp1.utils.StringUtils;

public class GamePrinter {

	private static final String SPACE = " ";
	
	private static final String CELL_BORDER_CHAR = "─";

	private static final String VERTICAL_DELIMITER = "|";

	private static final String NEW_LINE = System.lineSeparator();

	private static final int MARGIN_SIZE = 2;
	
	private static final String MARGIN = repeat(SPACE, MARGIN_SIZE);

	private static final int CELL_SIZE = 8;

	private static final String CELL_BORDER = repeat(CELL_BORDER_CHAR, CELL_SIZE);

	private static final String ROW_BORDER = SPACE + repeat(CELL_BORDER + SPACE, Game.NUM_COLS);

	private static final String IDENTED_ROW_BORDER = String.format("%n%s%s%n", MARGIN, ROW_BORDER);

	private Game game;
	
	
	String[][] board;
	int X;
	int Y;
	

	public GamePrinter(Game game, int x, int y) {
		this.game = game;
		this.X =x;
		this.Y =y;
		board = new String[x][y];


	}//Matriz de tablero y lo pinta
	public void RellenaTablero() {
		for(int i =0; i<X;i++) {
			for(int j=0;j<Y;j++) {
				board[i][j] = " ";
			}
		}
		System.out.println(this.toString());
	}

	/**
	 * Builds a string that represent the game status: cycles, suncoins, remaining zombies.
	 * 
	 * @return the string that represents the game status.
	 */
	public String getInfo() {
		
		String draw ="";
		draw += "Number of cycles: " + game.getContCiclos()+"\n"+"Sun coins: "+ game.getSoles()+"\n"+"Remaining zombies"+game.getZombiesLeft()+"\n";

		return draw;
	}

	/**
	 * Builds complete representation (status+board) of the game.
	 * 
	 * @return a string representation of the game.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();

		// Game Status

		str.append(getInfo());

		// Paint game board

		str.append(IDENTED_ROW_BORDER);

		for (int row = 0; row < Game.NUM_ROWS; row++) {
			str.append(MARGIN).append(VERTICAL_DELIMITER);
			for (int col = 0; col < Game.NUM_COLS; col++) {
				str.append(StringUtils.centre(game.positionToString(col, row), CELL_SIZE)).append(VERTICAL_DELIMITER);
			}
			if (row < Game.NUM_COLS - 1) {
				str.append(IDENTED_ROW_BORDER);
			}
		}

		return str.toString();
	}

	/**
	 * Builds the message to be printed once the game has finished.
	 * 
	 * @return a string representing a message to be printed once the game has finished.
	 */
	public String endMessage() {
		StringBuilder buffer = new StringBuilder(Messages.GAME_OVER);

		// TODO your code here

		return buffer.toString();
	}
	public String[][] getBoard(){
		return board;
	}
	public void setBoard(int x,int y,String draw) { // Para pintar los iconos
		this.board[x][y] = draw;
	}
	
	
}