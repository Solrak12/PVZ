package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Zombie {
	
	public int x;
	public int y;
	private int endurance;
	private int vida;
	private int speed;
	private int ciclos;
	private int damage;
	
	public Zombie(int fil, int col) {
		this.x =fil;
		this.y =col;
		this.endurance = 5;
		this.vida =5;
		this.speed = 1;
		this.ciclos =0;
		this.damage =1;
	}
	
	Game instancia;
	public String drawZ() {
		return "P[" + this.vida + "]";
	}
	//SETTERS GETTERS
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
	public int getdaño() { 
		return damage;
	}
	public void setDaño(int daño) {
		this.damage = daño;
	}
}
