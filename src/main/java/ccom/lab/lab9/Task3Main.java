public class Task3Main {
    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();
        p.charge("TX-1001", 2500.0);
        try {
            p.charge("TX-1002", -10);
        } catch (Exception e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}