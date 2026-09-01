package classesobjects;

public class CarDemo {
    static void main() {
        Car car1 = new Car();
        car1.displayStatus();
        Car car2 = new Car("toyota", "vios", true, (short)0);
        car2.displayStatus();
        Car.displayCount();
    }
}
