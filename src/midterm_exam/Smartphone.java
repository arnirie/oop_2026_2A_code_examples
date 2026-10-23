package midterm_exam;

public class Smartphone extends Device {
    private String color;
    private boolean isCarrierLocked;

    public Smartphone(String brand, int ageInYears, double basePrice, int daysInInventory, String color, boolean isCarrierLocked) {
        super(brand, ageInYears, basePrice, daysInInventory); //constructor's superclass call
        this.color =  color;
        this.isCarrierLocked = isCarrierLocked;
    }

    public double calculateDiscountedPrice(){
        double bPrice = this.getBasePrice();
        if(isCarrierLocked) bPrice -= bPrice * 0.2;
//        if(hasSSD) bPrice *= 0.9;
        if(getDaysInInventory() > 45) bPrice -= bPrice * 0.1;
        return bPrice;
    }

    public String getColor() {
        return color;
    }

    public boolean isCarrierLocked() {
        return isCarrierLocked;
    }

    @Override
    public String getSupportLevel(){
        if(super.getAgeInYears() >= 7) return "Legacy Support";
        else return "Standard Support";
    }
}
