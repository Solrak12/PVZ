package tp1.p1.logic;

import java.util.Random;


import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.PeashooterList;
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
	public String listPlants() {
		
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
		// TODO Auto-generated method stub
		
	}
	public int getContCiclos() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setContCiclos(int i) {
		// TODO Auto-generated method stub
		
	}
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}
	public GamePrinter getGamePrinter() {
		// TODO Auto-generated method stub
		return null;
	}
}
