package CoreJava.InstanceControlFlow;

public class Example3 {

    private static String method1(String str)
    {
        System.out.println(str);
        return str;
    }
    static String m=method1("1");
    {
        m=method1("2");
    }

    static
    {
        m=method1("3");
    }

    public static void main(String[] args)
    {
        Object o = new Example3();

    }
}

/*
Output:
=======
1
3
2

 */