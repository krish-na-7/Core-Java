package CoreJava.SolidPrinciplesOfOops.OpenClosedPrinciple.Solution;

import CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
