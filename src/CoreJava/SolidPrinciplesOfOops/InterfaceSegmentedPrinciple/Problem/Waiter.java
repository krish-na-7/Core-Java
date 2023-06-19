package CoreJava.SolidPrinciplesOfOops.InterfaceSegmentedPrinciple.Problem;

/**
 * I - Interface Segmented Principle
 * So here Waiter Class implemented all functions from RestaurantEmployee
 * which are not required for Waiter Class.
 * It is not following Interface Segmented Principle.
 * Solution is to divide the RestaurantEmployee interface into small based on the specific functionality
 * like WaiterInterface, ChefInterface.
 */
public class Waiter implements RestaurantEmployee {
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the Customers");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
