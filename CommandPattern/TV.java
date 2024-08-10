package CommandPattern;

public class TV {
    
    private int channel;
    private int volume;

    public void on(){
        System.out.println("TV ligada!!");
    }

    public void off(){
        System.out.println("TV desligada!!");
    }

    public void setInputChannel(int channel){
        this.channel = channel;
        System.out.printf("Canal alterado para ", channel);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.printf("Volume alterado para ", volume);
    }
}
