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
        int pos=-1;
        for(int i = 0 ; i<Sunflowercont; i++) {
            if(row == listaS[i].x && col == listaS[i].y) {
                pos = i;
            }
        }

        for(int j=pos; j<Sunflowercont - 1 ;j++) {
            listaS[j]=listaS[j+1];
        }
        Sunflowercont--;
	}
	public int addSoles(SunflowerList sunflowers) {
        //soles producidos
        int soles = 0;
        for(int i = 0; i<sunflowers.Sunflowercont ; i++) {
            if(sunflowers.listaS[i].getCiclos() % 3 == 0) {
                soles += 10;
            }
        }
        return soles;
    }
	//busca si en una cuadrícula del tablero hay una Sunflower
    public boolean SearchSunflower(int row, int col) {
        boolean libre = true;
        for(int i = 0; i < Sunflowercont; i++) {
            if(listaS[i].getX()==row && listaS[i].getY()==col) {
                libre = false;
            }
        }
        return libre;
    }

    public void ActEndurance(SunflowerList lista) {
        for(int i = 0; i < Sunflowercont; i++) {
            lista.listaS[i].endurance--;
        }
    }

    public void EnoughEndurance(SunflowerList lista) {
        for(int i = 0; i < Sunflowercont; i++) {
            if(listaS[i].endurance==0) {
                int x = listaS[i].getX();
                int y = listaS[i].getY();
                lista.DeleteSunflower(x, y);
            }
        }
    }
	
}
