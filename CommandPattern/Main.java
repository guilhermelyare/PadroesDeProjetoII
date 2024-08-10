package CommandPattern;

public class Main {
    public static void main(String[] args) {
        SimpleControl remote = new SimpleControl();

        //Aparelhos
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();
        Hottub hottub = new Hottub();
        SecurityControl securityControl = new SecurityControl();
        Sound sound = new Sound();
        TV tv = new TV();

        //Comandos
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LigthOnCommand ligthOn = new LigthOnCommand(light);
        SecurityControlOnCommand securityControlOn = new SecurityControlOnCommand(securityControl);
        SoundOnCommand soundOn = new SoundOnCommand(sound);
        TVOnCommand tvOn = new TVOnCommand(tv);

        Command[] powerBack = { ceilingFanOn, hottubOn, ligthOn, securityControlOn, soundOn, tvOn};

        BackupCommands powerBackBackup = new BackupCommands(powerBack);

        remote.setCommand(powerBackBackup);
        remote.buttonWasPressed();
    }   
}
