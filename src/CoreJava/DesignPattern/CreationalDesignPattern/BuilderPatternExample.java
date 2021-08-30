package CoreJava.DesignPattern.CreationalDesignPattern;

/*
      Builder Design Pattern:
      =======================
      It is Creational Design Pattern(related to creation of object).
      Used when we have too many arguments to send in constructor, and it's hard to maintain the order.
      when we don't want to send all parameters in Object initialisation (Generally we send optional parameters as Null)

      Implementation of Builder Design Pattern:
      =========================================
      We create a 'static nested class', which contains all arguments of outer class.
      As per naming convention, If class name is 'Vehicle' builder class should be 'VehicleBuilder'
      Builder class have a  public constructor with all required parameters
      Builder class should have all methods for optional parameters.Method will return the Builder object.
      A 'build()' method that will return the final object.
      The main class 'Vehicle' has a private constructor so to create instance only via Builder class.
      The main class 'Vehicle' has only getter methods.
 */
class VehicleClass {
    //required parameter
    private String engine;
    private int wheel;

    //optional parameter
    private int airbags;

    public String getEngine()
    {
        return this.engine;
    }

    public int getWheel()
    {
        return this.wheel;
    }

    public int getAirbags()
    {
        return this.airbags;
    }

    private VehicleClass(VehicleBuilder builder)
    {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public static class VehicleBuilder
    {
        private String engine;
        private int wheel;

        private int airbags;

        public VehicleBuilder(String engine, int wheel)
        {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags)
        {
            this.airbags = airbags;
            return this;
        }

        public VehicleClass build()
        {
            return new VehicleClass(this);
        }
    }
}

public class BuilderPatternExample
{
    public static void main(String[] args)
    {
        VehicleClass car = new VehicleClass.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        VehicleClass bike = new VehicleClass.VehicleBuilder("250cc", 2).build();

        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}
/*
Output:
=======
1500cc
4
4
250cc
2
0

 */
