package CoreJava.MethodOverloading;

/*   In general var - arg methods gets least priority if no other method matched then var -arg method get chance
 */

public class Example6 {

    public void m1(int i)
    {
        System.out.println("int method");
    }
    public void m1(int...i)
    {
        System.out.println("var - arg method ");
    }
    public static void main(String[] args)
    {
        Example6 c = new Example6();
        c.m1(7);
        c.m1(7,12,97);
        c.m1();

        /*
        Output:
        int method
        var - arg method
        var - arg method
         */

    }

}
