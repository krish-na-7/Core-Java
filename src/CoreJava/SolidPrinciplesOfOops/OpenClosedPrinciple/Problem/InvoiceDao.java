package CoreJava.SolidPrinciplesOfOops.OpenClosedPrinciple.Problem;

import CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution.Invoice;

/**
 * O - Open/Closed Principle
 * Open for Extension but Closed for Modification.
 * New Requirement came to add feature to save data to file. So introduced a method to save data to file.
 * So here we have modified the InvoiceDao class instead of extending the same Class
 * to New class for implementing the feature.
 * InvoiceDao class is not following Open/Closed Principle.
 */

//public class InvoiceDao {
//    Invoice invoice;
//
//    public InvoiceDao(Invoice invoice) {
//        this.invoice = invoice;
//    }
//
//    public void printInvoice() {
//        // print the Invoice
//    }
//}

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        // print the Invoice
    }

    public void saveToFile(){
        // Save Invoice in file
    }
}
