package CoreJava.StaticControlFlow;

public class Example2 {
    static
    {
        System.out.println(x);
    }
    static int x =10;
    public static void main(String[] args)
    {

    }
}
/*
Output:
=======
java: illegal forward reference
 */