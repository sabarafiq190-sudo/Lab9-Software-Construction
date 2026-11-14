import java.math.BigDecimal;

public class Task2Main {
    public static void main(String[] args) {
        try {
            new BankTransfer("ACC1", "ACC2", new BigDecimal("-500"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            new BankTransfer(null, "ACC2", new BigDecimal("100"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}