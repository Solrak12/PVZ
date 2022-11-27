package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public abstract class Plant extends GameObject{
	public static int AVIABLE_PLANTS = 10;
	
	int cost;
	
	public Plant(GameWorld game, int col, int row) {
		super(game,col,row);
	}
	
	public int getCost() {
		return this.cost;
	}
	public int getDamage() {
		return this.damage;
	}
	
	public void DamagePlant(int d) {
		this.vida = vida-d;
	}


    abstract String getPlantName();

    
}
