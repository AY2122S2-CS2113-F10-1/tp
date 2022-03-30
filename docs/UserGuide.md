# User Guide

## Introduction

CSProj Planner is a desktop app to help Computer Science students manage their projects. However, while being optimized for CS students, the app will still be useful to any student looking to easily keep track of all their upcoming projects. Users are able to add and delete projects at will, as well as view the tasks needed to be done for their submissions.

## Contents

- [Quick Start](#Quick-Start)
- [Features](#Features)
   - [add a project](#add-a-project-addproject)
   - [delete a project](#delete-a-project-deleteproject)
   - [print all projects](#print-all-projects-listprojects)
   - [add todo to a project](#add-todo-to-a-project-todo)
   - [mark todo as done](#mark-todo-as-done-mark)
   - [add a deadline to a project](#add-a-deadline-to-a-project-adddeadline)
   - [view](#view-details-of-a-project-view)
   - [exit](#exit-exit)
   
- [FAQ](#FAQ)
- [Command Summary](#Command-Summary)

## Quick Start

- Ensure you have Java  `11` or above installed in your computer.
- Ensure you have downloaded our latest version.
- Copy the file to your preferred folder as the home folder for your CSProj Planner.
- Double-click the file to start the app.
- Type your command in the command box and press Enter to execute it. Some example commands you can try:
   - `addproject cs2113`: Add a new project named cs2113 to the planner.
   - `listproject`: list out all projects in the list.  
   - `exit`: Exits the project.


## Features 

### Add a project: `addproject`
Add a project to your current list of projects

Format: `addproject [project_name]`
*The `project_name` has no restrictions; it can be of any length, number of words, and any
types of characters.

#### Example of usage
`addproject project1`

### Example of output
```project1 added.```

### Delete a project: `deleteproject`
Delete a project from your current list of projects

Format: `deleteproject [project_name]`
*The `project_name` must be a match for a current project already in your list of projects

#### Example of usage
`deleteproject project1`

### Example of output
```project1 deleted.```

### Print all projects: `listprojects`
Prints all projects in the list with their names and project deadlines

Format: `listprojects` or `listproject`

* The `listprojects`(`listproject`) cannot contain a space, i.e., `list projects`(`list project`) will be considered an unknown command.

### Add todo to a project: `todo`
Adds a todo task with description to a project

Format: `todo [project_index] [description]`
* The `project_Index` must be a positive integer.

#### Example of usage
`todo 1 buy textbooks`
#### Example of output
```Todo:  buy textbooks have been added to project pro1```

### Mark todo as done: `mark`

Format: `mark [project_index] [todo_index]`
* The `project_index` and `todo_index` must be positive integers.

#### Example of usage
`mark 1 1`

#### Example of output

```aidl
Todo has been marked as done successfully: 
[X] buy textbooks
```

### add a deadline to a project: `adddeadline`
Adds a deadline date to a project

Format: `adddeadline [project_name] [deadline]`
* deadline must be entered in the following format "yyyy-mm-dd"
* Alternatively, entering a day of the week also works (i.e. Thursday)

#### Example of usage
`addDeadline nextProject Friday`

#### Example of output
```Deadline added to nextProject: Sunday```

### view details of a project: `view`
View details of a project: Name, deadline, todos

Format: `view [project_name]`

#### Example of usage
`view cs2113`

#### Example of output

```aidl
Project Name: cs2113
Deadline: 17/03/2022
	[1]. [X] complete addproject command
	[2]. [ ] complete deleteproject command
```

### help: `help`
List out all available commands

Format: `help`

### exit: `exit`
Exit the program

Format: `exit`


## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary

| Action              | Format                                   |
|---------------------|------------------------------------------|
| add project         | `addproject [project_name]`              |
| delete project      | `deleteproject [project_name]`           |
| view all project(s) | `listproject`, `listprojects`            |
| add todo            | `todo [project_index] [description]`     |
| mark todo as done   | `mark [project_index] [todo_index]`      |
| add deadline        | `adddeadline  [project_name] [deadline]` |
| view a project      | `view [project_name]`                    |
| Exit                | `exit`                                   |
