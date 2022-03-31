package cpp.logic.parser;

import cpp.logic.commands.ViewProjectCommand;
import cpp.ui.Constants;
import cpp.exceptions.IllegalCommandException;
import cpp.logic.commands.OpenGitCommand;

import java.util.Arrays;

/**
 * Parses input arguments and creates a new OpenGitCommand object
 */

public class OpenGitCommandParser implements CommandParser<OpenGitCommand> {

    /**
     * Parses the given {@code String[]} of arguments in the context of the OpenGitCommand
     * and returns an OpenGitCommand object for execution.
     * @throws IllegalCommandException if the user input does not conform the expected format
     */

    @Override
    public OpenGitCommand parse(String[] userInput) throws IllegalCommandException {
        if (userInput.length < Constants.TWO_ARGUMENTS) {
            throw new IllegalCommandException(Constants.MESSAGE_INVALID_COMMAND_FORMAT);
        }
        String projectTitle = getProjectTitle(userInput);
        return new OpenGitCommand(projectTitle);
    }

    private String getProjectTitle(String[] userInput) {
        String[] splitedName = Arrays.copyOfRange(userInput, 1, userInput.length);
        return String.join(" ", splitedName);
    }
}
