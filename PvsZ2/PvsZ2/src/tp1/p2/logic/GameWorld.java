package tp1.p2.logic;

import tp1.p2.logic.gameobjects.GameObject;

public interface GameWorld {

	public static final int NUM_ROWS = 4;

	public static final int NUM_COLS = 8;
	
	private static final int SunIni = 50;
	
	private boolean exit = false;
	private int ciclos;
	
	private SunsManager sun;
	
	private GameObjectContainer PlantList;
	private GameObjectContainer ZombieList;
	
	public GameWorld{
		PlantList = new GameObjectContainer();
		ZombieList = new GameObjectContainer();
		sun = new SunsManager(SunIni);
		ciclos =0;
	}


	void addSun();

	boolean tryToCatchObject(int col, int row);

	boolean addItem(GameItem item);
	
	boolean addPlant(Plant plant, int x, int y) {
		if(IsBoard(x,y))&&IsEmpty(x,y)&&SunsManager.getCatchedSuns()>=Plant.cost){
			plant.getRow(x);
			plant.getCol(y);
			SunsManager.setCatchedSuns(SunsManager.getCatchedSuns-Plant.cost);
			return true;
		}
		return false;
	}
	
	public void setExit() {
		exit = true;
	}
	public boolean isBoard(int x, int y) {
		return (x>= 0 && x < NUM_ROWS) && (y >= 0 && y < NUM_COLS);
	}
	public boolean IsEmpty(int x,int y) { //Comprueba si la celda esta vacia
		boolean empty =false;
		
	}
	public void reset() {
		ciclos = 0;
		sun = new SunsManager(SunIni);
		PlantList = new GameObjectContainer();
		ZombieList = new GameObjectContainer();
	}

}