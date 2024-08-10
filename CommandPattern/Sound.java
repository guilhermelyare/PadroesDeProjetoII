package CommandPattern;

public class Sound {
    private int radio;
    private int volume;
    private String dvd;
    private String cd;
    

    public void on(){
        System.out.println("Som ligada!!");
    }

    public void off(){
        System.out.println("Som desligada!!");
    }

    public void setCD(String cd){
        this.cd = cd;
        System.out.printf("CD alterado para ", cd);
    }

    public void setDVD(String dvd){
        this.dvd = dvd;
        System.out.printf("DVD alterado para ", dvd);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.printf("Volume alterado para ", volume);
    }

    public void setRadio(int radio){
        this.radio = radio;
        System.out.printf("Radio alterado para ", radio);
    }
}
