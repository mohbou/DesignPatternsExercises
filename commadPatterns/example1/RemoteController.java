package main.commadPatterns.example1;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class RemoteController {

    private List<Command> turnOnCommands = new ArrayList<>();
    private List<Command> turnOffCommands=new ArrayList<>();
    private List<Command> increaseTemp =  new ArrayList<>();
    private List<Command> decreaseTemp = new ArrayList<>();

    public void insertNewOnCommand(Command command) {
        turnOnCommands.add(command);
    }
    public void insertNewOffCommand(Command command) {
        turnOffCommands.add(command);
    }
}
