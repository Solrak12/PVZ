package tp1.p2.control.commands;

import tp1.p2.control.ExecutionResult;
import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class AddZmbieCommand implements Command  {

	
	private int col;

	private int row;

	private String ZombieName;
	
	private String errorMessageP = "No se puede colocar el zombie";

	public AddZmbieCommand() {
		new AddZmbieCommand(true);
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
		Zombie zombie = ZombieFactory.isValidZombie(ZombieName);
		if(zombie != null) {
			ok = ZombiesManager.addZombie(zombie);
		}
		if(!ok || zombie == null) {
			System.out.println(errorMessageP);
			
		}
		return new ExecutionResult(ok);
	}

	@Override
	public Command create(String[] parameters) {
		return null;
	}

}