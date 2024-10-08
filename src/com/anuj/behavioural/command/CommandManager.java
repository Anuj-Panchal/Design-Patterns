package com.anuj.behavioural.command;

import java.util.ArrayDeque;

public class CommandManager {

    private final ArrayDeque<Command> commandHistory;

    public CommandManager() {
        this.commandHistory = new ArrayDeque<>();
    }

    public void execute(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if(commandHistory.isEmpty())
            return;
        Command prevCommand = commandHistory.pop();
        prevCommand.undo();
    }
}
