package tp1.p2.logic.gameobjects;

import tp1.p2.logic.GameWorld;

import tp1.p2.logic.GameObjectContainer;

public class Zombie extends GameObject {
	private int speed;
	
	public Zombie() {
		super(null,0,0);
		this.endurance=5;
		this.vida=5;
		this.ciclos=0;
		this.damage=1;
		this.speed=1;
	}
	
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
	
	void Update() {
		ciclos++;
		if(isPositionEmpty(this.row, this.col - 1)) {
			
		}
	}


	public boolean reciveZombieAttack(int damage) {
    	return false;
    }
    public boolean recivePlantAttack(int damage) {
    	this.vida-=damage;
    	return true;
    }
    
	protected String getSymbol() {
		return "P[" + this.vida + "]";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
