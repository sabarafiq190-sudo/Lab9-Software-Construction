public class PdfFormatter implements ReportFormatter {
    @Override
    public void write(String output) {
        System.out.println("Writing PDF: " + output);
    }
}