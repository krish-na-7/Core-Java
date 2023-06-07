package CoreJava.SolidPrinciplesOfOops.LiskovSubstitutionPrinciple;

/**
 * L - Liskov Substitution Principle
 * If Class B  is subtype of Class A, then we should be able to replace
 * object of A with B without breaking the behaviour of the program.
 *
 * Subclass should extend the capability of the Parent Class not narrow down.
 */

public interface Bike {
    void turnOnEngine();
    void accelerate();
}
