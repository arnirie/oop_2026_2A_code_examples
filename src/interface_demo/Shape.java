package interface_demo;

public interface Shape {
    //constansts, abstract methods, default methods

    double calculateArea(); //abstract by default
//    public abstract double calculateArea();


    //default method - with method body - optional to be overriden
    default void displayInfo(){
        IO.println("Area: " + calculateArea());
    }
}

interface Resizable {
    void resize(double factor);

    default void doubleSize(){
        resize(2);
    }

    default void halfSize(){
        resize(0.5);
    }
}

class Circle implements Shape, Resizable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo(){
        IO.println("Radius: " + radius);
        IO.println("Circle Area: " + calculateArea());
    }

    @Override
    public void resize(double factor){
        this.radius *= factor;
    }
}

class Trapezoid implements Shape{
    private double baseA, baseB, height;

    public Trapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }
}

class ShapeDemo{
    static void main() {
//        Shape s = new Shape();
//        Shape s = new Circle(5);
//        s.halfSize();
        Circle c = new Circle(5);
        c.displayInfo();
        c.doubleSize();
        c.displayInfo();
        c.halfSize();
        c.displayInfo();
    }
}