package classesobjects;

public class Car {
    String maker;
    String model;
    boolean isAutomatic;
    short speed;
    static short count = 0;

    //constructor - initialize
    Car(){
        maker = "";
        model = "";
        isAutomatic = false;
        speed = 0;
        count++;
    }

    Car(String maker, String model, boolean isAutomatic, short speed){
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
}
