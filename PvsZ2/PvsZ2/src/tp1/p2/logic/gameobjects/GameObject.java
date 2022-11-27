package tp1.p2.logic.gameobjects;

import static tp1.p2.view.Messages.status;

import tp1.p2.logic.GameItem;
import tp1.p2.logic.GameWorld;

/**
 * Base class for game non playable character in the game.
 *
 */
public abstract class GameObject implements GameItem {

	protected GameWorld game;

	protected int col;

	protected int row;
	
	protected int endurance;
	
	protected  int vida;
	
	protected int ciclos;
	
	protected int damage;
	
	public GameObject(GameWorld game, int col, int row) {
		this.game = game;
		this.col = col;
		this.row = row;
	}

	public boolean isInPosition(int col, int row) {
		return this.col == col && this.row == row;
	}

	public int getCol() {
		return col;
	}
	public void setCol(int y) {
		col=y;
	}

	public int getRow() {
		return row;
	}
	public void setRow(int x) {
		row=x;
	}
	
	public int getEndurance() {
		return endurance;
	}
	public void setEndurance(int e) {
		endurance=e;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int v) {
		vida = v;
	}
	
	public int getCiclos() {
		return ciclos;
	}
	public void setCiclos(int c) {
		ciclos=c;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int d) {
		damage = d;
	}
	
	public boolean isAlive() {
		boolean alive = true;
		if(vida==0) {
			alive=false;
		}
		return alive;
	}

	
	abstract public void update();
	
	abstract public void onEnter();
	
	abstract public void onExit();
	
	public String toString() {
		if (isAlive()) {
			// TODO add your code here
		} else {
			return "";
		}
	}

	abstract protected String getSymbol();

	abstract public String getDescription();
}