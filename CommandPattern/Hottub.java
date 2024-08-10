package CommandPattern;

public class Hottub {
    int temperature;

    public void circulate(){
        System.out.println("Água da banheira circulando!");
    }

    public void jetsOn(){
        System.out.println("Ligando jatos da banheira!");
    }

    public void jetsOff(){
        System.out.println("Desligando jatos da banheira!");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.printf("Temperatura alterada para ", temperature);
    }
}
