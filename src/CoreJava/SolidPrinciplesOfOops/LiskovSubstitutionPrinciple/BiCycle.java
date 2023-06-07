package CoreJava.SolidPrinciplesOfOops.LiskovSubstitutionPrinciple;

/**
 * L - Liskov Substitution Principle
 * In BiCycle class we are changing the behaviour of the Super Class
 */

public class BiCycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
       throw new RuntimeException("There is no engine");
    }

    @Override
    public void accelerate() {
        // do nothing
    }
}
