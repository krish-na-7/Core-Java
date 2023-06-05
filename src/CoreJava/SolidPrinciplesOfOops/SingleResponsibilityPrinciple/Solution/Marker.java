package CoreJava.SolidPrinciplesOfOops.SingleResponsibilityPrinciple.Solution;

/**
 * S - Single Responsibility Principle
 * A Class should have only one reason to change.
 * A class should have only one responsibility not more than one.
 */

public class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker() {
    }

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}