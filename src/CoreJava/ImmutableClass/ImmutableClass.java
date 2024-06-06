package CoreJava.ImmutableClass;

/*
 *   Immutable class means that once an object is created, we cannot change its content.
 *   In Java,all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
 *   We can create our own immutable class as well.
 *
 *   Following are the requirements:
 *   ===============================
 *   The class must be declared as final. (So that child classes can’t be created)
 *   Data members in the class must be declared as final. (So that we can’t change the value of it after object creation)
 *   A parameterized constructor.
 *   Getter method for all the variables in class.
 *   No setters methods(To not have the option to change the value of the instance variable)
 *
 * */

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private final int regNo;
    private final String name;
    private final Set<Integer> marks;
    public ImmutableClass(int regNo, String name, Set<Integer> marks) {

        this.regNo = regNo;
        this.name = name;
        this.marks = new HashSet<>(marks); // deep copy
    }
    public String getName() {
        return name;
    }
    public int getRegNo() {
        return regNo;
    }
    public Set<Integer> getMarks() {
        return new HashSet<>(marks); // deep copy
    }
}

class ImmutableClassMain {
    public static void main(String[] args) {
        ImmutableClass immutableObj = new ImmutableClass(101, "Ram", Set.of(97, 98, 93, 100, 99));
        String name = immutableObj.getName();
        int id = immutableObj.getRegNo();
        Set<Integer> marks = immutableObj.getMarks();
        id = 102;
        name = "Sita";
        marks.add(95);

        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);

        System.out.println("================================");

        System.out.println(immutableObj.getRegNo());
        System.out.println(immutableObj.getName());
        System.out.println(immutableObj.getMarks());

        // Uncommenting below line causes error
        // s.regNo = 102;

    }
}