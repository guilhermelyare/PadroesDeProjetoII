package CommandPattern;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
    
}
