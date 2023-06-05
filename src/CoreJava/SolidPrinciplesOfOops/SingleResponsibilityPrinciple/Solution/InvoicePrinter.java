package CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save the data to DB
    }
}