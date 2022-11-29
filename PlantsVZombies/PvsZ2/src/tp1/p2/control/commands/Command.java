package tp1.p2.control.commands;

import tp1.p2.control.CommandObtainer;
import tp1.p2.control.ExecutionResult;
import tp1.p2.logic.GameWorld;

public interface Command {
	
	public String getName();

	public String getShortcut();

	public String getDetails();

	public String getHelp();

	
	/**
	 * Execute the command.
	 * 
	 * @param game Where to execute the command.
	 * 
	 * @return {@code true} if game board must be printed {@code false} otherwise.
	 */
	public abstract ExecutionResult execute(GameWorld game);

	public abstract Command create(String[] parameters);
	
	default public boolean isDefaultAction() {
		return CommandObtainer.getDefaultCommand().equals(this);
	}
	
	default public boolean matchCommand(String token) {
		String shortcut = getShortcut();
		String name = getName();
		return shortcut.equalsIgnoreCase(token) || name.equalsIgnoreCase(token)
				|| (isDefaultAction() && "".equals(token));
	}

}
