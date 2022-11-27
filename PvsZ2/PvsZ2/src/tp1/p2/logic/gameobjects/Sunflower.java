package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

public class Sunflower extends Plant {
	
	String PlantName = "Sunflower";
	
	public Sunflower() {
		super(game,col,row);
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
	
	
	/*public int addSoles(SunflowerList sunflowers) {
        //soles producidos
        int soles = 0;
        for(int i = 0; i<sunflowers.Sunflowercont ; i++) {
            if(sunflowers.listaS[i].getCiclos() % 3 == 0) {
                soles += 10;
            }
        }
        return soles;
    }*/
	
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
