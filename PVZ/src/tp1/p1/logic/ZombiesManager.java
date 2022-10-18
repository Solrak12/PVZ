package tp1.p1.logic;

import java.util.Random;

import tp1.p1.control.Level;
import tp1.p1.logic.gameobjects.Zombie;
import tp1.p1.logic.gameobjects.ZombieList;

/**
 * Manage zombies in the game.
 *
 */
public class ZombiesManager {

	private Game game;

	private Level level;

	private Random rand;

	private int remainingZombies;

	private ZombieList zombies;

	public ZombiesManager(Game game, Level level, Random rand) {
		this.game = game;
		this.level = level;
		this.rand = rand;
		this.remainingZombies = level.getNumberOfZombies(level);
		this.zombies = new ZombieList(this.remainingZombies);
	}

	/**
	 * Checks if the game should add (if possible) a zombie to the game.
	 * 
	 * @return <code>true</code> if a zombie should be added to the game.
	 */
	private boolean shouldAddZombie() {
		return rand.nextDouble() < level.getZombieFrequency();
	}
	private boolean isPositionEmpty(int Cols, int row) {
        boolean vacio = false;
        for(int i = 0; i<remainingZombies ;i++) {
            if(zombies.listaZ[i].getX() != row && zombies.listaZ[i].getY() != Cols) {
                vacio = true;
            }
        }
        return vacio;
    }
	
	/**
	 * Return a random row within the board limits.
	 * 
	 * @return a random row.
	 */
	public int randomZombieRow() {
		return rand.nextInt(Game.NUM_ROWS);
	}
	
	public boolean addZombie() {
		int row = randomZombieRow();
		return addZombie(row);
	}
	public boolean addZombie(int row) {
        boolean canAdd = getRemainingZombies() > 0 && shouldAddZombie()
                && isPositionEmpty(Game.NUM_COLS, row);

        if(canAdd) {
            //zombie added
            zombies.listaZ[remainingZombies].setX(row);
            remainingZombies--;
        }
        return canAdd;
       
    }
	public int MasIzquierda(ZombieList lista, int row) {
        int aux = 0;
        for(int i = 0 ; i<remainingZombies;i++) {
            if(lista.listaZ[i].getX()==row) {
                aux = lista.listaZ[i].getY();
                if(lista.listaZ[i].getY() < aux) {
                aux = lista.listaZ[i].getY();
                }
            }
        }
        return aux;
    }
	public void DamageZombie(ZombieList lista, int row, int col) {
        for(int i = 0; i<remainingZombies;i++) {
            if(lista.listaZ[i].getX() == row && lista.listaZ[i].getY() == col) {
                if(lista.listaZ[i].getVida() > 0) {
                    lista.listaZ[i].setVida(lista.listaZ[i].getVida()-1);
                }else if(lista.listaZ[i].getVida() > 0){
                    //el zombie sigue vivo
                }else {
                    //el zombie ha muerto
                    lista.DeleteZombie(col, row);
                }
            }
        }
    }

	public int getRemainingZombies() {
		
		return remainingZombies;
	}
	public void setRemainingZombies(int numZ) {
		this.remainingZombies = numZ;
	}

	public boolean zombieRandom() {
		// TODO Auto-generated method stub
		return false;
	}


	// TODO fill your code
}