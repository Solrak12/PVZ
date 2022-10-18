package tp1.p1.logic.gameobjects;

import tp1.p1.control.*;

public class ZombieList {
	public Zombie[] listaZ;
	int remainingZombies;
	
	
	public ZombieList() {
		listaZ = new Zombie[getNumberOfZombies()]; //Numero de zombies
	}
	
	public ZombieList(int remainingZombies) {
		this.remainingZombies = remainingZombies;
	}
	public void DeleteZombie(int col, int row) {
        int pos=-1;
        for(int i = 0 ; i<remainingZombies; i++) {
            if(row == listaZ[i].x && col == listaZ[i].y) {
                pos = i;
            }
        }

        for(int j=pos; j<remainingZombies - 1 ;j++) {
            listaZ[j]=listaZ[j+1];
        }
        remainingZombies--;
    }

}
