package midterm_exam;

public class Device {
    private String brand;
    private int ageInYears;
    private double basePrice;
    private int daysInInventory;
    private static int deviceCount;

    public Device(String brand, int ageInYears, double basePrice, int daysInInventory) {
        this.brand = brand;
        this.ageInYears = ageInYears;
        this.basePrice = basePrice;
        this.daysInInventory = daysInInventory;
    }

    public String getBrand() {
        return brand;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getDaysInInventory() {
        return daysInInventory;
    }

    public static int getDeviceCount() {
        return deviceCount;
    }

    public String getSupportLevel(){
        return "Standard Support";
    }

    public boolean isMoreExpensive(Device other){
        if(other == null) return false;
//        if(this.basePrice > other.basePrice) return true;
//        else return false;
        return this.basePrice > other.basePrice;
    }

}
