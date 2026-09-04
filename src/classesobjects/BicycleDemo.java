package classesobjects;

import java.util.Scanner;

public class BicycleDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Bicycle[] bicycles = new Bicycle[3];
        for(byte i = 0 ; i < bicycles.length ; i++){
            bicycles[i] = new Bicycle();
        }
        //input
        for(byte i = 0 ; i < bicycles.length ; i++){
            System.out.println("--Bike #"+ (i+1));
            System.out.print("Enter Owner's Name: ");
            bicycles[i].setOwner(sc.nextLine());
            System.out.print("Enter Bike Speed: ");
            bicycles[i].setSpeed(sc.nextShort());
            sc.nextLine();
        }
        for(Bicycle bike : bicycles){
            bike.displayInfo();
        }
        //activity
        //call the display info into all elements of the array
        //Bike #,
        //owner speed (shown using displayInfo)
        //<object>[index].<methodname>
    }
}

class Bicycle{
    private short speed;
    private String owner;
//    private boolean isMotorized;
//    private char initials;

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

//    public boolean isMotorized() {
//        return isMotorized;
//    }
//
//    public void setMotorized(boolean motorized) {
//        isMotorized = motorized;
//    }
//
//    public char getInitials() {
//        return initials;
//    }
//
//    public void setInitials(char initials) {
//        this.initials = initials;
//    }

    public Bicycle(){
        //init
        speed  = 0;
        owner = "";
//        isMotorized =false;
//        initials = 0;
    }

    public void displayInfo(){
        System.out.println(speed);
        System.out.println(owner);
//        System.out.println(isMotorized);
//        System.out.println(initials);
    }
}