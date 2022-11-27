
package tp1.p2.control;

import static tp1.p2.view.Messages.error;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tp1.p2.control.commands.AddPlantCommand;
import tp1.p2.control.commands.Command;
import tp1.p2.control.commands.ExitCommand;
import tp1.p2.control.commands.HelpCommand;
import tp1.p2.control.commands.ListPlantsCommand;
import tp1.p2.control.commands.NoneCommand;
import tp1.p2.control.commands.NuevoComando;
import tp1.p2.control.commands.ResetCommand;
import tp1.p2.view.Messages;

/**
 * Represents a user action in the game.
 *
 */
public class CommandObtainer {

	/* @formatter:off */
	private static final List<Command> AVAILABLE_COMMANDS = Arrays.asList(
		new AddPlantCommand(),
		new ListPlantsCommand(),
		new ResetCommand(),
		new HelpCommand(),
		new ExitCommand(),
		new NoneCommand(),
		new NuevoComando()
	);
	/* @formatter:on */

	private static Command defaultCommand;

	public static Command parse(String[] commandWords) {
		if (commandWords.length == 1 && commandWords[0].isEmpty()) {
			// TODO add your code here
		}

		for (Command command : AVAILABLE_COMMANDS) {
			if (command.matchCommand(commandWords[0])) {
				return command;
			}
		}
		System.out.println(error(Messages.UNKNOWN_COMMAND));
		return null;
	}

	public static Iterable<Command> getAvailableCommands() {
		return Collections.unmodifiableList(AVAILABLE_COMMANDS);
	}

	
	public static Command getDefaultCommand() {
		return defaultCommand;
	}

	

	

}