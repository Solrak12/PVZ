package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public class Zombie extends GameObject {
	private int speed;
	
	public Zombie(GameWorld game, int col, int row) {
		super(game,col,row);
		this.endurance=5;
		this.vida=5;
		this.ciclos=0;
		this.damage=1;
		this.speed=1;
	}
	
	public void DamageZombie(int d) {
		this.vida = vida-d;
	}

	@Override
	protected String getSymbol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
