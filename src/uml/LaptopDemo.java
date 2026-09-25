package uml;

public class LaptopDemo {
    static void main() {
        Laptop lap = new Laptop("hp victus");
        Laptop.Processor gpu = new Laptop.Processor("nvidia", 5.5);
        PC.CPU cpu = new PC.CPU();
        PC.Memory mem = new PC.Memory();
//        Laptop.Processor cpu = lap.new Processor("intel", 2.5);
//        cpu.displayInfo();

    }
}
