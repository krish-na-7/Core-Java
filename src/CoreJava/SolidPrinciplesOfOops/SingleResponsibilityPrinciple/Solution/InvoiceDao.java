package CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // print the Invoice
    }
}