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
	int sunflowercont;
	int peashootercont;
	int contc;
	int soles;
	int numZombies;
	Random rand;
	GamePrinter gamePrinter;
	ZombieList zombies;
	SunflowerList Sunflowers;
	PeashooterList Peashooters;
	ZombiesManager zombieManager;
	public Game(long seed2, Level level2) { //Añadir parametros
		this.soles =50;
		this.contc =0;
		this.sunflowercont =0;
		this.peashootercont=0;
		this.Sunflowers = new SunflowerList();
		this.Peashooters = new PeashooterList();
		this.zombies = new ZombieList();
		this.numZombies = numZombies;
		
	}

	public void Update(){
	    contc++;

	    //aquí se generan los soles de cada ciclo

	    soles += Sunflowers.addSoles(Sunflowers);
	        for(int i=0; i<sunflowercont ; i++) {
	            Sunflowers.listaS[i].setCiclos(Sunflowers.listaS[i].getCiclos() + 1);
	        }

	    //aquí atacan las plantas lanzaguisantes

	    while(zombieManager.getRemainingZombies() > 0) {
	        for(int i=0;i<Peashooters.Peashootercont;i++) {
	            int x = Peashooters.listaP[i].getX();
	            int y = zombieManager.MasIzquierda(zombies, x);
	            zombieManager.DamageZombie(zombies, x, y);
	        }
	    }

	    }
	public void reset() {
		this.Sunflowers = new SunflowerList();
		this.Peashooters = new PeashooterList();
		this.zombies = new ZombieList();
		this.zombieManager.setRemainingZombies(numZombies);
		
		this.contc =0;
		this.soles =50;
		this.gamePrinter = new GamePrinter(this);
	}
	
	public String ListPlants() { //Muestra las plantas
		System.out.println(Messages.PEASHOOTER_DESCRIPTION +"\n"+Messages.SUNFLOWER_DESCRIPTION);
		return null;
	}
	
	
	private boolean isPositionEmptyS(int Cols, int row) {
        boolean vacio = false;
        for(int i = 0; i<sunflowercont ;i++) {
            if(Sunflowers.listaS[i].getX() != row && Sunflowers.listaS[i].getY() != Cols) {
                vacio = true;
            }
        }
        return vacio;
    }
	private boolean isPositionEmptyP(int Cols, int row) { 
        boolean vacio = false;
        for(int i = 0; i<peashootercont ;i++) {
            if(Peashooters.listaP[i].getX() != row && Peashooters.listaP[i].getY() != Cols) {
                vacio = true;
            }
        }
        return vacio;
    }

	public void addPeashooter(Peashooter pesh) { //Position empty para las plantas tambn
		if(isPositionEmptyP(pesh.getX(),pesh.getY())&& getSoles()>=50) {
			setSoles(getSoles()-50);
			Peashooters.AddPeashooter(pesh.getY(),pesh.getX());
			//Dibujarlo en tablero
		}
		
	}
	public void addSunflower(Sunflower sunf) { //Position empty para las plantas tambn
		if(isPositionEmptyS(sunf.getX(),sunf.getY())&& getSoles()>=20) {
			setSoles(getSoles()-20);
			Sunflowers.AddSunflower(sunf.getY(),sunf.getX());
			//Dibujarlo en tablero
		}
		
		
	}
public ZombiesManager getZombiesLeft() {
		
		return zombieManager;
	}
	public void setZombiesLeft(ZombiesManager zombiesRemain) {
		this.zombieManager = zombiesRemain;
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
	
	
	public int getSoles() { //?
		return soles;
		
	}
	public void setSoles(int Soles) {
		this.soles = Soles;
	}
	
	public String positionToString(int col, int row) {//?
		// TODO Auto-generated method stub
		return null;
	}
}
