package practice_abstract;

public interface Payable {
    String getTransactionId();
    double getAmount();
    boolean validatePayment();
    double calculateProcessingFee();

    default void processTransaction(){
        //same as previous
    }
}
