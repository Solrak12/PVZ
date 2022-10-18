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
	public void DeletePeashooter(int col, int row) {
        int pos=-1;
        for(int i = 0 ; i<Peashootercont; i++) {
            if(row == listaP[i].x && col == listaP[i].y) {
                pos = i;
            }
        }

        for(int j=pos; j<Peashootercont - 1 ;j++) {
            listaP[j]=listaP[j+1];
        }
        Peashootercont--;
		}

	
	}
