package tp1.p1.logic.gameobjects;

public class SunflowerList {
	
	public Sunflower[] listaS;
	public int Sunflowercont = 0;
	
	//initializing the SunflowerList
	public SunflowerList() {
		listaS = new Sunflower[32];
	}
	
	//methods
	public void AddSunflower(int col, int row) {
		listaS[Sunflowercont].x=row;
		listaS[Sunflowercont].y=col;
		Sunflowercont++;
	}
	public void DeleteSunflower(int col, int row) {
		
	}
}
