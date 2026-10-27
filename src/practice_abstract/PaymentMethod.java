package practice_abstract;

import java.util.ArrayList;

public abstract class PaymentMethod {
    protected String transactionId;
    protected double amount;

    public PaymentMethod(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract boolean validatePayment();

    public abstract double calculateProcessingFee();

    public void processTransaction(){
        if(validatePayment()){
            double totalAmt = this.amount + calculateProcessingFee();
            IO.println("Transaction ID: " + this.transactionId);
            IO.println("Amount: " + this.amount);
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + this.transactionId + " FAILED: Invalid payment details.");
        }
    }
}

class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String transactionId, double amount, String cardNumber, String cvv){
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }
}

class DigitalWalletPayment extends PaymentMethod {
    private String walletId;
    private double walletBalance;

    public DigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        super(transactionId, amount);
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    @Override
    public boolean validatePayment(){
        return walletBalance >= amount + calculateProcessingFee();
    }

    @Override
    public double calculateProcessingFee(){
        return amount > 1000 ? 15 : 0;
    }
}







class CheckoutSystem{
    static void main() {
        ArrayList<PaymentMethod> payments = new ArrayList<>();
        payments.add(new CreditCardPayment("#001",
                5500, "1234567890123456",
                "455"));
        payments.add(new DigitalWalletPayment("#002",
                5000, "12345", 10000));
        payments.add(new DigitalWalletPayment("#002",
                5000, "12345", 0));
        for(PaymentMethod p : payments){
            p.processTransaction();
        }
    }
}






