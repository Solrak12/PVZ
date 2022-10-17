package tp1.p1.logic;

import java.util.Random;


import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.Peashooter;
import tp1.p1.logic.gameobjects.PeashooterList;
import tp1.p1.logic.gameobjects.Sunflower;
import tp1.p1.logic.gameobjects.SunflowerList;
import tp1.p1.logic.gameobjects.Zombie;
import tp1.p1.logic.gameobjects.ZombieList;
import tp1.p1.view.GamePrinter;

public class Game {
	
	public final static int NUM_COLS = 8;
	public final static int NUM_ROWS = 4;
	
	int seed;
	Level level;
	int contc = 0;
	int soles = 50;
	Random rand;
	
	ZombieList zombies;
	SunflowerList Sunflowers;
	PeashooterList Peashooters;
	ZombiesManager zombieRemain;

	public void Update(){
		
	}
	public void reset() {
		
	}
	public String listPlants() { //Muestra las plantas
		
		return null;
	}
	public ZombiesManager getZombiesLeft() {
		
		return zombieRemain;
	}
	public void setZombiesLeft(ZombiesManager zombiesRemain) {
		this.zombieRemain = zombiesRemain;
	}
	public int getRandom() {
		
		return 0;
	}
	public void addZombie(Zombie z) {
		
		
	}
	
	public int getContCiclos() {
		return contc;
		
	}
	public void setContCiclos(int ciclos) {
		this.contc = ciclos;
		
	}
	public String draw() {
		System.out.println("Number of cycles: "+getContCiclos()+"\n" + "Sun coins: "+this.getSoles()+"\n"+"Remaining zombies: "+ getZombiesLeft()+"\n");
		return null;
	}
	public GamePrinter getGamePrinter() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addPeashooter(Peashooter pesh) {
		// TODO Auto-generated method stub
		
	}
	public int getSoles() { //?
		return soles;
		
	}
	public void setSoles(int Soles) {
		this.soles = Soles;
	}
	public void addSunflower(Sunflower sunf) {
		// TODO Auto-generated method stub
		
	}
	public void addSoles(int i) {
		// TODO Auto-generated method stub
		
	}
	public String positionToString(int col, int row) {
		// TODO Auto-generated method stub
		return null;
	}
}
