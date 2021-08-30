package CoreJava.DesignPattern.CreationalDesignPattern;

/*
    Factory Design Pattern:
    =======================
    It is Creational Design Pattern(related to creation of object).
    Used when we have multiple sub-classes of a super class and based on input we want to return one class instance.
    It provides abstraction between implementation and client classes.
    Remove the instantiation of client classes from client code.

    Implementation of Factory Design Pattern:
    ===========================================
    Super class can be an interface or abstract class or basic class
    Factory class has a static method which returns the instance of sub-class based on input.

 */
abstract class Vehicle
{
    public abstract int getWheel();

    public String toString()
    {
        return "Wheel: " + this.getWheel();
    }
}

class Car extends Vehicle
{
    int wheel;

    Car(int wheel)
    {
        this.wheel = wheel;
    }

    @Override
    public int getWheel()
    {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel)
    {
        this.wheel = wheel;
    }

    @Override
    public int getWheel()
    {
        return this.wheel;
    }
}

class VehicleFactory
{
    public static Vehicle getInstance(String type, int wheel)
    {
        if(type == "car")
        {
            return new Car(wheel);
        }
        else if(type == "bike")
        {
            return new Bike(wheel);
        }
        return null;
    }
}

public class FactoryPatternExample
{

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }

}
/*
Output:
=======
Wheel: 4
Wheel: 2
 */