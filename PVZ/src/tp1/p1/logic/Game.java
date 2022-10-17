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
import tp1.p1.view.Messages;

public class Game {
	
	public final static int NUM_COLS = 8;
	public final static int NUM_ROWS = 4;
	
	int seed;
	Level level;
	int contc;
	int soles;
	int numZombies;
	Random rand;
	GamePrinter gamePrinter;
	ZombieList zombies;
	SunflowerList Sunflowers;
	PeashooterList Peashooters;
	ZombiesManager zombieRemain;
	public Game() { //Añadir parametros
		this.soles =50;
		this.contc =0;
		this.Sunflowers = new SunflowerList();
		this.Peashooters = new PeashooterList();
		this.zombies = new ZombieList();
		this.numZombies = numZombies;
		
	}

	public void Update(){
		
	}
	public void reset() {
		this.Sunflowers = new SunflowerList();
		this.Peashooters = new PeashooterList();
		this.zombies = new ZombieList();
		this.zombieRemain.setRemainingZombies(numZombies);
		
		this.contc =0;
		this.soles =50;
		this.gamePrinter = new GamePrinter(this);
	}
	
	public String ListPlants() { //Muestra las plantas
		System.out.println(Messages.PEASHOOTER_DESCRIPTION +"\n"+Messages.SUNFLOWER_DESCRIPTION);
		return null;
	}
	public ZombiesManager getZombiesLeft() {
		
		return zombieRemain;
	}
	public void setZombiesLeft(ZombiesManager zombiesRemain) {
		this.zombieRemain = zombiesRemain;
	}
	public int getRandom() { //Salida random del zombie
		
		return 0;
	}
	private boolean isPositionEmpty(int Cols, int row) { //Usarlo para add zombie
        boolean vacio = false;
        for(int i = 0; i<numZombies ;i++) {
            if(zombies.listaZ[i].getX() != row && zombies.listaZ[i].getY() != Cols) {
                vacio = true;
            }
        }
        return vacio;
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
	
	public void addPeashooter(Peashooter pesh) { //Position empty para las plantas tambn
		if(isPositionEmpty(pesh.getX(),pesh.getY())&& getSoles()>0) {
			setSoles(getSoles()-50);
			Peashooters.add(pesh);
			//Dibujarlo en tablero
		}
		
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
	
	public String positionToString(int col, int row) {
		// TODO Auto-generated method stub
		return null;
	}
}
