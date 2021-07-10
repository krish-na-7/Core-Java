package CoreJava.MethodOverloading;

public class Example4 {

    public void m1(String s)
    {
        System.out.println("String Version");
    }
    public void m1(StringBuffer sb)
    {
        System.out.println("StringBuffer version");
    }
    public static void main(String[] args) {
        Example4 c = new Example4();
        c.m1("ram");
        c.m1(new StringBuffer("hari"));

        /*
        c.m1(null);  -->
        java: reference to m1 is ambiguous
        both method m1(java.lang.String) in CoreJava.MethodOverloading.Example4 and
        method m1(java.lang.StringBuffer) in CoreJava.MethodOverloading.Example4 match

        We get Compile time error if we pass null as parameter since both argument types are at same level
        String class and StringBuffer class are at same level.
        Both String class and StringBuffer class are child class of Object Class.

        */

        /*
          Output:
          String Version
          StringBuffer version
        */

    }
}
