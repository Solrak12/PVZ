package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public class Peashooter extends Plant {
	
	String PlantName = "Peashooter";
	
	public Peashooter() {
		super(null, 0, 0);
		this.endurance=3;
		this.vida=3;
		this.ciclos=0;
		this.cost=50;
		this.damage=1;
	}

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
	
	Plant getPlant(String PlantName) {
		Peashooter p = null;
		if(PlantName=="Peashooter") {
			p = new Peashooter();
		}
		return p;
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

	@Override
	public boolean catchObject() {
		// TODO Auto-generated method stub
		return false;
	}


	
	@Override
	public void update() {
		ciclos++;
		if(!isAlive()) {
			onExit();
		}
	}
}