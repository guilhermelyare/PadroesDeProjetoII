package CommandPattern;

public class CeilingFan {
    String speed;

    public void off(){
        System.out.println("Ventilador desligado!");
    }

    public void high(){
        this.speed = "High";
        System.out.printf("Velocidade alterada para", speed);
    }

    public void medium(){
        this.speed = "Medium";
        System.out.printf("Velocidade alterada para", speed);
    }

    public void low(){
        this.speed = "Low";
        System.out.printf("Velocidade alterada para", speed);
    }

    public String getSpeed() {
        return speed;
    }
}
