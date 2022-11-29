package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public class Sunflower extends Plant {
	
	String PlantName = "Sunflower";
	
	public Sunflower() {
		super(null,0,0);
		this.endurance=1;
		this.vida=1;
		this.ciclos=0;
		this.damage=0;
		this.cost=20;
	}
	
	public Sunflower(GameWorld game, int col, int row) {
		super(game,col,row);
		this.endurance=1;
		this.vida=1;
		this.ciclos=0;
		this.damage=0;
		this.cost=20;
	}
	
	public String getPlantName() {
		return this.PlantName;
	}
	
	protected String getSymbol() {
		return "S[" + this.vida + "]";
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	Plant getPlant(String PlantName) {
		Sunflower s = null;
		if(PlantName=="Sunflower") {
			s = new Sunflower();
		}
		return s;
	}

	public void update() {
		ciclos++;
	}





	
}
