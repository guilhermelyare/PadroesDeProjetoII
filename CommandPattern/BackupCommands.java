package CommandPattern;

public class BackupCommands implements Command {
    Command[] commands;

    public BackupCommands(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length ; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length ; i++){
            commands[i].undo();
        }
    }
    
}
