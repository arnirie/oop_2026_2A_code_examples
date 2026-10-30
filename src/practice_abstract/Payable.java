package practice_abstract;

import java.util.ArrayList;

public interface Payable {
    String getTransactionId();
    double getAmount();

    boolean validatePayment();
    double calculateProcessingFee();

    default void processTransaction(){
        if(validatePayment()){
            double totalAmt = getAmount() + calculateProcessingFee();
            IO.println("Transaction ID: " + getTransactionId());
            IO.println("Amount: " + getAmount());
            IO.println("Processing Fee: " + calculateProcessingFee());
            IO.println("Total Amount: " + totalAmt);
        } else {
            IO.println("Transaction " + getTransactionId() + " FAILED: Invalid payment details.");
        }
    }
}

interface Rewardable{
    double calculateRewardPoints();
}

class ICreditCardPayment implements Payable, Rewardable {
    private String transactionId, cardNumber, cvv;
    private double amount;

    public ICreditCardPayment(String transactionId, double amount, String cardNumber, String cvv){
        this.transactionId = transactionId;
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean validatePayment(){
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public double calculateProcessingFee(){
        return amount * 0.025;
    }

    //calculateRewardPoints(): Earns 1 point for every 100.00 spent (Math.floor(amount / 100.0)).
    @Override
    public double calculateRewardPoints(){
        return Math.floor(amount / 100);
    }
}

class IDigitalWalletPayment implements Payable{
    private String transactionId, walletId;
    private double amount, walletBalance;

    public IDigitalWalletPayment(String transactionId, double amount, String walletId, double walletBalance) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public double getAmount() {
        return amount;
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

class ICheckoutSystem{
    static void main() {
        ArrayList<Payable> payments = new ArrayList<>();
        payments.add(new ICreditCardPayment("#001",
                5500, "1234567890123456",
                "455"));
        payments.add(new IDigitalWalletPayment("#002",
                5000, "12345", 10000));
        payments.add(new IDigitalWalletPayment("#003",
                5000, "12345", 0));
        for(Payable p : payments){
            p.processTransaction();
        }
    }
}



/*
Task 3: Create Implementing Classes
Create two independent classes (no extends keyword needed):
CreditCardPayment (Implements BOTH Payable and Rewardable)
Attributes: transactionId (String), amount (double), cardNumber (String), cvv (String).
Constructor: Initializes all four attributes.
Payable Implementation:
validatePayment(): Returns true if cardNumber is 16 characters AND cvv is 3 characters.
calculateProcessingFee(): Returns amount * 0.025 (2.5% fee).
Rewardable Implementation:

DigitalWalletPayment (Implements ONLY Payable)
Attributes: transactionId (String), amount (double), walletId (String), walletBalance (double).
Constructor: Initializes all four attributes.
Payable Implementation:
calculateProcessingFee(): Returns 15.00 if amount > 1000.00, otherwise 0.00.
validatePayment(): Returns true if walletBalance >= (amount + calculateProcessingFee()).
Task 4: Create the Test Class (CheckoutSystem)
In main, create a List<Payable> and add:
One valid CreditCardPayment.
One valid DigitalWalletPayment.
One invalid DigitalWalletPayment (insufficient balance).
Loop through the Payable list:
Call processTransaction().

Lenth l = new Lenght();
l.
 */