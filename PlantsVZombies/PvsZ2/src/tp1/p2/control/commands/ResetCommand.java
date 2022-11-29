package tp1.p2.control.commands;

import tp1.p2.control.ExecutionResult;
import tp1.p2.control.Level;
import tp1.p2.logic.GameWorld;
import tp1.p2.view.Messages;

public class ResetCommand implements Command {

	private Level level;

	private long seed;

	public ResetCommand() {
		
	}

	public ResetCommand(Level level, long seed) {
		this.level = level;
		this.seed = seed;
	}

	@Override
	public String getName() {
		return Messages.COMMAND_RESET_NAME;
	}

	@Override
	public String getShortcut() {
		return Messages.COMMAND_RESET_SHORTCUT;
	}

	@Override
	public String getDetails() {
		return Messages.COMMAND_RESET_DETAILS;
	}

	@Override
	public String getHelp() {
		return Messages.COMMAND_RESET_HELP;
	}

	@Override
	public ExecutionResult execute(GameWorld game){
		game.reset();
		return new ExecutionResult(true);
	}

	@Override
	public Command create(String[] parameters) {
		String levelParam = parameters[1];
		String seedParam =  parameters[2];
		if (levelParam == null || levelParam.isEmpty()
				|| seedParam == null || seedParam.isEmpty()) {
			
			return  null;
		}
		else {
			this.level = Level.valueOfIgnoreCase(levelParam);
			this.seed = Long.parseLong(seedParam);
			return this;
			
		}
	}

}