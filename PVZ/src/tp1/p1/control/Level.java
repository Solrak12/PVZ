package tp1.p1.control;

import tp1.utils.StringUtils;
import java. util. Scanner;
/**
 * Represents the allowed levels in the game.
 *
 */
public class Level {
	
	public enum Dificultad{
		EASY,
		HARD,
		INSANE;
	}

	private static int numberOfZombies;
	
	private static double zombieFrequency;

	public Level(int numberOfZombies, double zombieFrequency) {
		this.numberOfZombies = numberOfZombies;
		this.zombieFrequency = zombieFrequency;
	}
	
	// TODO fill your code

	/**
	 * Parse an string and return any matching level
	 * 
	 * @param inputString string to parse
	 * @return the parsed {@link Level} or <code>null</code> if none match.
	 */
	/*public static Level valueOfIgnoreCase(String inputString) {
		for (Level level : Level.values()) {
			if (level.name().equalsIgnoreCase(inputString)) {
				return level;
			}
		}
		return null;
	}

	private String name() {
		
	}

	private static Level[] values() {
		
		
	}

	/**
	 * Returns a string representation of all the levels joined with <code>separator</code>
	 * 
	 * @param separator String used as separator
	 * 
	 * @return the string resulted from joining all levels using <code>separator</code>
	 */
	

	/*public static String all(String separator) {
		StringBuilder buffer = new StringBuilder();
		int levelCount = 0;
		for (Level level : Level.values()) {
			if (levelCount > 0) {
				buffer.append(separator);
			}
			buffer.append(level.name());
			levelCount++;
		}
		return buffer.toString();
	}


	
	public String getLevel() {
		Scanner valor = new Scanner(System.in);
		String nivel = valor.next();
		return nivel;
	}
	
	public int getSeed() {
		Scanner valor = new Scanner(System.in);
		int seed = valor.nextInt();
		return seed;
	}
	

	/*double getZombieFrequency(String valor) {
		if(valor=="EASY") {
			zombieFrequency = 0.1;
		}else if(valor == "HARD") {
			zombieFrequency = 0.2;
		}else if(valor == "INSANE"){
			zombieFrequency = 0.3;
		}
		return zombieFrequency;
	}
	public int getNumberOfZombies(String valor) {
		if(valor=="EASY") {
			numberOfZombies = 3;
		}else if(valor == "HARD") {
			numberOfZombies = 5;
		}else if(valor == "INSANE"){
			numberOfZombies = 10;
		}
		return numberOfZombies;
	}*/
}