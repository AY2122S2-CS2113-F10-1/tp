package cpp.model.project;

/**
 * Represents a todo in a project.
 */
public class Todo {
    protected String description;
    protected boolean isDone;

    public Todo(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String toString() {
        return "[" + this.getStatusIcon() + "]" + this.description;
    }

    /**
     * Gets the status of a todo.
     *
     * @return todo status
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Marks the todo as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Marks the todo as undone.
     */
    public void markAsUndone() {
        this.isDone = false;
    }

    /**
     * Gets the description of a todo.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the done status of a todo.
     *
     * @return todo status isDone as String
     */
    public String getDone() {
        return isDone?"true":"false";
    }
}
