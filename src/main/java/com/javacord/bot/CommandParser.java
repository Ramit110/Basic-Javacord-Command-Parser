package com.javacord.bot;

public class CommandParser {
    private CommandBase command;

    public CommandParser(String[] message)
    {
        switch (message[0].split(" ")[0])
        {
            default:
                command = null;
                break;
        }
    }

    public String runCommand()
    {
        if(command != null)
        {
            return command.run();
        }
        return "";
    }
}
