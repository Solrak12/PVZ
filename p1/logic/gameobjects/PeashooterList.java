package tp1.p1.logic.gameobjects;

public class PeashooterList {
	public Peashooter[] listaP;
	public int Peashootercont = 0;
	
	//initializing the peashooterList
	public PeashooterList() {
		listaP = new Peashooter[32];
	}
	
	//methods
	
	public void AddPeashooter(int col, int row) {
		listaP[Peashootercont].x=row;
		listaP[Peashootercont].y=col;
		Peashootercont++;
	}
	public void DelPeashooter(int col, int row) {
		
	}
}
