package CommandPattern;

public class SoundOnCommand implements Command {
    Sound sound;

    public SoundOnCommand(Sound sound){
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void undo() {
        sound.off();
    }
}
