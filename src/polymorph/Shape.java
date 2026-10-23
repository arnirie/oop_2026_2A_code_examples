package polymorph;

public abstract class Shape {
    //instance var, constructor, concrete methods, abstract methods

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    //abstract method
    public abstract double calculateArea();

    //concrete method
    public void displayInfo(){
        IO.println("Color: " + color);
        IO.println("Area: " + calculateArea());
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

class Trapezoid extends Shape {
    private double baseA, baseB, height;

    public Trapezoid(String color, double baseA, double baseB, double height){
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }
}

class ShapeDemo {
    static void main() {
        Shape t = new Trapezoid("red", 2, 4, 3);
        Shape c = new Circle("blue", 5);
        Shape[] shapes = {t, c, new Circle("black", 0.3)};
        for(Shape s : shapes){
            s.displayInfo();
        }
    }
}
