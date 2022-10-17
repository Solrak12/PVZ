package tp1.p1.logic.gameobjects;

import tp1.p1.control.*;
import tp1.p1.logic.Game;

public class Peashooter {
	int x,y;
	Game instancia;
	int cost;
	int damage;
	int endurance;
	int vida;
	int ciclos;
	
	
	public Peashooter(int x, int y){
		this.x =x;
		this.y =y;
		this.cost = 50;
		this.damage = 1;
		this.endurance = 3;
		this.vida = 3;
		this.ciclos = 0;
	}
	

	public static Object getDescription() {
		// TODO Auto-generated method stub
		return null;
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
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getdaño() {
		return damage;
	}
	public void setDaño(int daño) {
		this.damage = daño;
	}
	public void setCiclos(int ciclos) {
		this.ciclos = ciclos;
	}
	public int getCiclos() {
		return ciclos;
	}
}
