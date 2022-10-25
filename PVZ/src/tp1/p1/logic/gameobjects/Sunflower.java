package tp1.p1.logic.gameobjects;

import tp1.p1.logic.Game;

public class Sunflower {
	int x;
	int y;
	private Game instancia;
	private int cost;
	private int endurance;
	private int damage;
	int vida;
	private int ciclos;
	//VALORES
	public Sunflower(int x, int y) {
		this.x =x;
		this.y =y;
		this.cost = 20;
		this.setEndurance(1);
		this.damage = 0;
		this.vida =1;
		this.ciclos =0;
	}

	public static Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	//ICONO
	public String drawS() {
		return "S[" + this.vida + "]";
	}
	//GETTERS SETTERS
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

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
}
