package CommandPattern;

public class LigthOnCommand implements Command {
    Light light;

    public LigthOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
