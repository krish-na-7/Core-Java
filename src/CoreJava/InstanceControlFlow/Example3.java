package CoreJava.InstanceControlFlow;

public class Example3 {

    private static String method1(String str) {
        System.out.println(str);
        return str;
    }

    public Example3() {
        System.out.println("In Constructor");
    }

    static String m = method1("1");

    {
        m = method1("2");
    }

    static {
        m = method1("3");
    }

    public static void main(String[] args) {
        System.out.println("In Main method");
        new Example3();
    }
}

/*
Output:
=======
1
3
In Main method
2
In Constructor

 */