package CoreJava.MethodOverloading;

/*
        while resolving overloaded methods compiler always gives preference to child type arguments compared
        to parent type arguments.
        Here String is child  class to Object class. So,compiler gives preference to String type argument method
        compared to Object type argument
*/

public class Example3 {

    public void m1(String s)
    {
        System.out.println("String version");
    }
    public void m1(Object o)
    {
        System.out.println("Object version");
    }
    public static void main(String[] args){
        Example3 c= new Example3();
        c.m1("ram");
        c.m1(new Object());
        c.m1(null);  // String version

        /*
        Output:
        String version
        Object version
        String version
        */
    }
}
