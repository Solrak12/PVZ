package tp1.p1.logic.gameobjects;

import tp1.p1.control.*;
import tp1.p1.logic.Game;

public class Peashooter {
	int x,y;
	Game instancia;
	int cost = 50;
	int damage = 1;
	int endurance = 3;
	
	
	public Peashooter(int cost, int damage, int endurance){
		this.cost = cost;
		this.damage = damage;
		this.endurance = endurance;
	}

	public static Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
