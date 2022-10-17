package tp1.p1.logic.gameobjects;

import tp1.p1.control.*;

public class ZombieList {
	public Zombie[] listaZ;
	int remainingZombies;
	
	public ZombieList() {
		listaZ = new Zombie[getNumberOfZombies];
	}
	
	public ZombieList(int remainingZombies) {
		this.remainingZombies = remainingZombies;
	}

}
