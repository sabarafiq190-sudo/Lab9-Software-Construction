public class PaymentProcessor {
    public void charge(String txId, double amount) {
        System.out.println("[TraceID: " + txId + "] Processing payment...");
        try {
            System.out.println("[TraceID: " + txId + "] Charging amount: " + amount);
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid amount");
            }
            System.out.println("[TraceID: " + txId + "] Payment successful");
        } finally {
            System.out.println("[TraceID: " + txId + "] Context Cleared");
        }
    }
}