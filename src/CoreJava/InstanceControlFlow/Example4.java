package CoreJava.InstanceControlFlow;

public class Example4 {

    {
        System.out.println("In 1st Instance block");
    }

    static {
        System.out.println("In 1st Static block");
    }

    Example4() {
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        Example4 c1 = new Example4();
        System.out.println("main");
        new Example4();

    }

    {
        System.out.println("In 2nd Instance block");
    }

    static {
        System.out.println("In 2nd Static block");
    }
}
/*
Output:
=======
In 1st Static block
In 2nd Static block
In 1st Instance block
In 2nd Instance block
In Constructor
main
In 1st Instance block
In 2nd Instance block
In Constructor

 */