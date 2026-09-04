package classesobjects;

public class Car {
     String maker;
    String model;
    boolean isAutomatic;
    short speed;
    static short count = 0;

    //constructor - initialize
    public Car(){
        maker = "";
        model = "";
        isAutomatic = false;
        speed = 0;
        count++;
    }

    public Car(String maker, String model, boolean isAutomatic, short speed){
        this.maker = maker;
        this.model =  model;
        this.isAutomatic = isAutomatic;
        this.speed = speed;
        count++;
    }

    void displayStatus(){
        System.out.println(maker);
        System.out.println(model);
        System.out.println(speed);
        System.out.println(count);
    }

    static void displayCount(){
        System.out.println(count);
    }

    void speedUp(short s){
        speed += s;
    }

    void slowdown(short s){
        speed -= s;
    }

    short getSpeed(){
        return this.speed;
    }

    void setSpeed(short speed){
        this.speed =  speed;
    }
}


