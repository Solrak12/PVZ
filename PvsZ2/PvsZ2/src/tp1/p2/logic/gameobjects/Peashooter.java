package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public class Peashooter extends Plant {
	
	String PlantName = "Peashooter";
	

	public Peashooter(GameWorld game, int col, int row) {
		super(game,col,row);
		this.endurance=3;
		this.vida=3;
		this.ciclos=0;
		this.cost=50;
		this.damage=1;
	}
	

	
	public String getPlantName() {
		return this.PlantName;
	}
	
	public void update() {
		ciclos++;
		
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