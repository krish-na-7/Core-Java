package CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Problem;

/**
 * S - Single Responsibility Principle
 * A Class should have only one reason to change.
 * A class should have only one responsibility not more than one.
 * In Invoice class has three responsibilities
 * 1. Calculate the total price
 * If I introduce GST then I have to change the calculateTotal logic
 * 2. Print the Invoice
 * If I change the logic to print Invoice
 * 3. Save Data to the DB
 * If I want to save to file
 * Here there are 3 reasons to change Invoice the class,
 * so it is not following Single Responsibility Principle.
 */

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice() {
        // print the Invoice
    }

    public void saveToDB() {
        // Save the data to DB
    }
}