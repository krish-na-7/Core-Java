package CoreJava.ImmutableClass;/*
   *   Immutable class means that once an object is created, we cannot change its content. In Java,
   *  all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
   * We can create our own immutable class as well.

Following are the requirements:

The class must be declared as final (So that child classes can’t be created)
Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
A parameterized constructor
Getter method for all the variables in it
No setters(To not have the option to change the value of the instance variable)
   *
   *
   *
   *
   * */

public final class ImmutableClassExample {

    final String name;
    final int regNo;

    public ImmutableClassExample(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
}
class Test
{
    public static void main(String[] args)
    {
        ImmutableClassExample s = new ImmutableClassExample("ABC", 101);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());

        // Uncommenting below line causes error
        // s.regNo = 102;
    }
}