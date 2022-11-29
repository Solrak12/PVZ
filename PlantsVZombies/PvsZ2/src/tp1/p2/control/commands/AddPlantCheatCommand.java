package tp1.p2.control.commands;

import tp1.p2.control.ExecutionResult;
import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class AddPlantCheatCommand implements Command  {

	// Aquí no necesitas los atributos de las plantas, commo mucho un parámetro tipo planta pero mejor dentro del método 
	// execute y no como atributo de clase. Al comando básicamente le da igual la posición de la planta y los demás atributos,
	// eso corresponde a la propia planta conocerlos, también como mucho asignarle valores a la planta.
	private int col;

	private int row;

	private String plantName;

	private boolean consumeCoins;
	
	private String errorMessageP = "No se puede colocar la planta";

	public AddPlantCheatCommand() {
		new AddPlantCheatCommand(true);
	}

	@Override
	public String getName() {
		return Messages.COMMAND_ADD_NAME;
	}

	@Override
	public String getShortcut() {
		return Messages.COMMAND_ADD_SHORTCUT;
	}

	@Override
	public String getDetails() {
		return Messages.COMMAND_ADD_DETAILS;
	}

	@Override
	public String getHelp() {
		return Messages.COMMAND_ADD_HELP;
	}

	@Override
	public ExecutionResult execute(GameWorld game) {
		boolean ok = false;
		Plant plant = PlantFactory.isValidPlant(plantName);
		if(plant != null) {
			ok = game.addPlantS(plant);
		}
		if(!ok || plant == null) {
			System.out.println(errorMessageP);
			
		}
		return new ExecutionResult(ok);
	}

	@Override
	public Command create(String[] parameters) {
		return null;

}

