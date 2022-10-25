package tp1.p1.logic.gameobjects;

public class PeashooterList {
	public Peashooter[] listaP;
	public int Peashootercont = 0;
	
	//initializing the peashooterList
	public PeashooterList() {
		listaP = new Peashooter[32];
	}
	
	//methods
	//Añade un guisante
	public void AddPeashooter(int col, int row) {
		listaP[Peashootercont].x=row;
		listaP[Peashootercont].y=col;
		Peashootercont++;
	}
	//Elimina el guisante de la lista
	public void DeletePeashooter(int col, int row) {
        int pos=-1;
        for(int i = 0 ; i<Peashootercont; i++) {
            if(row == listaP[i].getX() && col == listaP[i].getY()) {
                pos = i;
            }
        }

        for(int j=pos; j<Peashootercont - 1 ;j++) {
            listaP[j]=listaP[j+1];
        }
        Peashootercont--;
		}
	//busca si en una cuadrícula del tablero hay un Peashooter
	public void DamagePeashooter(int pos) {
        listaP[pos].vida--;
    }

    //busca si en una cuadrícula del tablero hay un Peashooter
    public int SearchPeashooter(int row, int col) {
        int pos = -1;
        for(int i = 0; i < Peashootercont; i++) {
            if(listaP[i].getX()==row && listaP[i].getY()==col) {
                pos = i;
            }
        }
        return pos;
    }

    public void ActEndurance(PeashooterList lista) {
        for(int i = 0; i < Peashootercont; i++) {
            lista.listaP[i].setEndurance(lista.listaP[i].getEndurance() - 1);
        }
    }

    public void EnoughEndurance(PeashooterList lista) {
        for(int i = 0; i < Peashootercont; i++) {
            if(listaP[i].getEndurance()==0) {
                int x = listaP[i].getX();
                int y = listaP[i].getY();
                lista.DeletePeashooter(x, y);
            }
        }
    }
    

	
	}
