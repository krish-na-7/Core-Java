package CoreJava.InstanceControlFlow;

public class Example2 {
    private static String method1(String str) {
        System.out.println(str);
        return str;
    }

    public Example2() {
        System.out.println("In Constructor");
        m = method1("1");
    }

    {
        m = method1("2");
    }

    String m = method1("3");

    public static void main(String[] args) {
        System.out.println("In Main method");
        new Example2();
    }
}
/*
Output:
=======
In Main method
2
3
In Constructor
1

 */
