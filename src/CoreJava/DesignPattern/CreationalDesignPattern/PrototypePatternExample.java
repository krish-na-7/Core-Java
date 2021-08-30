package CoreJava.DesignPattern.CreationalDesignPattern;

import java.util.ArrayList;
import java.util.List;

/*
     Prototype Design Pattern:
     =========================
     It is Creational Design Pattern(related to creation of object).
     Used when you want to avoid multiple Object creation of same instance;instead you copy the
     object to new object, and then we can modify as per our need.

     Implementation of Prototype Design Pattern:
     ===========================================
     Object which we're copying should provide copying feature by implementing Cloneable interface.
     We can override clone() method to implement as per our need
 */
class VehiclePrototype implements Cloneable
{
    private List<String> vehicleList;

    public VehiclePrototype()
    {
        this.vehicleList = new ArrayList<String>();
    }

    public VehiclePrototype(List<String> list)
    {
        this.vehicleList = list;
    }

    public void insertData()
    {
        vehicleList.add("Honda amaze");
        vehicleList.add("Audi A4");
        vehicleList.add("Hyundai Creta");
        vehicleList.add("Maruti Baleno");
        vehicleList.add("Renault Duster");
    }

    public List<String> getVehicleList()
    {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> tempList = new ArrayList<String>();

        for(String s : this.getVehicleList())
        {
            tempList.add(s);
        }
        return new VehiclePrototype(tempList);
    }
}

public class PrototypePatternExample
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
        VehiclePrototype a = new VehiclePrototype();
        a.insertData();

        VehiclePrototype b = (VehiclePrototype) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Honda new Amaze");

        System.out.println(a.getVehicleList());
        System.out.println(list);

        b.getVehicleList().remove("Audi A4");
        System.out.println(list);
        System.out.println(a.getVehicleList());
    }
}
/*
Output:
=======
[Honda amaze, Audi A4, Hyundai Creta, Maruti Baleno, Renault Duster]
[Honda amaze, Audi A4, Hyundai Creta, Maruti Baleno, Renault Duster, Honda new Amaze]
[Honda amaze, Hyundai Creta, Maruti Baleno, Renault Duster, Honda new Amaze]
[Honda amaze, Audi A4, Hyundai Creta, Maruti Baleno, Renault Duster]

 */