package tp1.p2.control.commands;

import tp1.p2.control.ExecutionResult;
import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class AddPlantCommand implements Command  {

	// Aquí no necesitas los atributos de las plantas, commo mucho un parámetro tipo planta pero mejor dentro del método 
	// execute y no como atributo de clase. Al comando básicamente le da igual la posición de la planta y los demás atributos,
	// eso corresponde a la propia planta conocerlos, también como mucho asignarle valores a la planta.
	private int col;

	private int row;

	private String plantName;

	private boolean consumeCoins;

	public AddPlantCommand() {
		new AddPlantCommand(true);
	}

	public AddPlantCommand(boolean consumeCoins) {
		this.consumeCoins = consumeCoins;
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
		//  TODO
		return new ExecutionResult(true);
	}

	@Override
	public Command create(String[] parameters) {
		String param = parameters[0];
		if (param == null || param.isEmpty()) {
			return  new AddPlantCommand();
		}
		else {
			return new AddPlantCommand(Boolean.valueOf(param));
		}

	}

}