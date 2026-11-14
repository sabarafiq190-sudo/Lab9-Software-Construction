public class CsvFormatter implements ReportFormatter {
    @Override
    public void write(String output) {
        System.out.println("Writing CSV: " + output);
    }
}