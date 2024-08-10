package CommandPattern;

public class SimpleControl {
    Command slot;
    public SimpleControl() {}
    
    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
