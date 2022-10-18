package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Sunflower {
	int x,y;
	Game instancia;
	int cost;
	int endurance;
	int damage;
	int vida;
	int ciclos;
	
	public Sunflower(int x, int y) {
		this.x =x;
		this.y =y;
		this.cost = 20;
		this.endurance = 1;
		this.damage = 0;
		this.vida =1;
		this.ciclos =0;
	}

	public static Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public String drawS() {
		return "S[" + this.vida + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x =x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y =y;
	}
	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}
	public int getCiclos() {
		return ciclos;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
}
