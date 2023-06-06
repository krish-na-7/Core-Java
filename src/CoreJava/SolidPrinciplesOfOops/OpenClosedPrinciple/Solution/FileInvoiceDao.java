package CoreJava.SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;

import CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
