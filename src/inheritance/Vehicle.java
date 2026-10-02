package inheritance;

public class Vehicle {
    private String owner; //package-private
    private int gears;
    private int speed;

    public Vehicle(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayStat(){
        System.out.println(owner);
        System.out.println(gears);
        System.out.println(speed);
    }
}

//subclass / child class from Vehicle
class Truck extends Vehicle{
    private int capacity;

    public Truck(String name, int capacity){
        super(name);
        this.capacity = capacity;
    }

    @Override  //annotion
    public void displayStat(){

    }

}

class VehicleDemo{
    static void main() {
        Truck t = new Truck("arni", 25);

    }
}

