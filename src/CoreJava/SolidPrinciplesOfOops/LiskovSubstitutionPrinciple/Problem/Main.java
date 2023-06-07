package CoreJava.SolidPrinciplesOfOops.LiskovSubstitutionPrinciple.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * L - Liskov Substitution Principle
 * If Class B  is subtype of Class A, then we should be able to replace
 * object of A with B without breaking the behaviour of the program.
 *
 * Subclass should extend the capability of the Parent Class not narrow down.
 * Here the BiCycle class down-sizing the capability of Vehicle Class.
 * We can solve the problem by keeping the generic functionality.
 *
 */

public class Main {
    public static void main(String args[]){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
