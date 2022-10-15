package tp1.p1.logic;

import java.util.Random;

import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.PeashooterList;
import tp1.p1.logic.gameobjects.SunflowerList;
import tp1.p1.logic.gameobjects.ZombieList;

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

	public void Update(){
		
	}

}
