package CoreJava.SolidPrinciplesOfOops.InterfaceSegmentedPrinciple.Problem;

/**
 * I - Interface Segmented Principle
 * Interfaces should be such, that clients should not implement
 * unnecessary functions/methods they do not need.
 */
public interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}