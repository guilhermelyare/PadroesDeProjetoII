package CommandPattern;

public class GarageDoorOnCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
