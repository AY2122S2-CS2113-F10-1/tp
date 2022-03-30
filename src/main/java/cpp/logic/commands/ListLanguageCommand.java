package cpp.logic.commands;

import cpp.model.ProjectList;
import cpp.response.Response;

public class ListLanguageCommand extends Command {
    private final String projectName;

    public ListLanguageCommand(String projectName) {
        this.projectName = projectName;
    }

    public String execute(ProjectList projectList) {
        projectList.listLanguages(projectName);
        return Response.listLanguageSuccessfully();
    }
}
