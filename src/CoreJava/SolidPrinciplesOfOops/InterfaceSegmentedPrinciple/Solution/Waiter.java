package CoreJava.SolidPrinciplesOfOops.InterfaceSegmentedPrinciple.Solution;

/**
 * I - Interface Segmented Principle
 * So here Waiter Class implemented all functions from RestaurantEmployee
 * which are not required for Waiter Class.
 * It is not following Interface Segmented Principle.
 * Solution is to divide the RestaurantEmployee interface into small based on the specific functionality
 * like WaiterInterface, ChefInterface
 */
public class Waiter implements WaiterInterface {
    @Override
    public void serveCustomers() {
        System.out.println("Serving the Customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking Orders");
    }
}
