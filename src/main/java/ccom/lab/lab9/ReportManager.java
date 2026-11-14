import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReportManager {
    private final Map<String, ReportFormatter> formatters;
    private final Notifier notifier;

    public ReportManager(Map<String, ReportFormatter> formatters, Notifier notifier) {
        this.formatters = Objects.requireNonNull(formatters);
        this.notifier = Objects.requireNonNull(notifier);
    }

    public void generate(String type, List<String> data, boolean sendEmail) {
        if (type == null) {
            throw new IllegalArgumentException("Report type must not be null");
        }
        Objects.requireNonNull(data, "data must not be null");

        String output = String.join(",", data);

        ReportFormatter formatter = formatters.get(type.toUpperCase());
        if (formatter == null) {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }
        formatter.write(output);

        if (sendEmail) {
            notifier.send("admin@company.com", output);
        }
    }
}