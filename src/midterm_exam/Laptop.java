package midterm_exam;

public class Laptop extends Device {
    private String processorType;
    private boolean hasSSD;

    public Laptop(String brand, int ageInYears, double basePrice, int daysInInventory,String processorType, boolean hasSSD) {
        super(brand, ageInYears, basePrice, daysInInventory); //constructor's superclass call
        this.processorType = processorType;
        this.hasSSD = hasSSD;
    }

    public double calculateDiscountedPrice(){
        double bPrice = this.getBasePrice();
        if(hasSSD) bPrice -= bPrice * 0.1;
//        if(hasSSD) bPrice *= 0.9;
        if(getDaysInInventory() > 30) bPrice -= bPrice * 0.15;
        return bPrice;
    }

    public boolean hasSSD(){
        return hasSSD;
    }

    public String getProcessorType(){
        return processorType;
    }

    @Override
    public String getSupportLevel(){
        if(super.getAgeInYears() > 7) return "Legacy Support";
        else if(!hasSSD) return "Upgrade Recommended";
        else return "Standard Support";
    }
}
