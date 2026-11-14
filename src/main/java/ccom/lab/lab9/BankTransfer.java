import java.math.BigDecimal;
import java.util.Objects;

public record BankTransfer(String fromAccount, String toAccount, BigDecimal amount) {
    public BankTransfer {
        Objects.requireNonNull(fromAccount, "fromAccount must not be null");
        Objects.requireNonNull(toAccount, "toAccount must not be null");
        Objects.requireNonNull(amount, "amount must not be null");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("amount must be strictly positive");
        }
    }
}