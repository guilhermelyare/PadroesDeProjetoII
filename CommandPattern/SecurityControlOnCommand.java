package CommandPattern;

public class SecurityControlOnCommand implements Command {
    SecurityControl securityControl;

    public SecurityControlOnCommand(SecurityControl securityControl){
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void undo() {
        securityControl.disarm();
    }
    
}
