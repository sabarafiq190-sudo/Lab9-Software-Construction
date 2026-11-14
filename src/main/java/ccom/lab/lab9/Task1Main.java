import java.util.List;
import java.util.Map;

public class Task1Main {
    public static void main(String[] args) {
        Notifier consoleNotifier = (to, msg) ->
                System.out.println("Email to " + to + ": " + msg);

        ReportManager manager = new ReportManager(
                Map.of("PDF", new PdfFormatter(), "CSV", new CsvFormatter()),
                consoleNotifier);

        manager.generate("PDF", List.of("A", "B", "C"), true);
        manager.generate("CSV", List.of("X", "Y"), false);
    }
}