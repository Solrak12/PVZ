package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Sunflower {
	int x,y;
	Game instancia;
	int cost = 20;
	int endurance = 1;
	int damage = 0;
	
	public Sunflower(int cost, int endurance, int damage) {
		this.cost = cost;
		this.endurance = endurance;
		this.damage = damage;
	}

	public static Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
