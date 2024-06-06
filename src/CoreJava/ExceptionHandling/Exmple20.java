package CoreJava.ExceptionHandling;

public class Exmple20 {
    public static void main(String[] args) {
        System.out.println(m1());
    }

    private static int m1() {
        try {

            return 5;

        } catch (Exception e) {

        } finally {
            return 10;
        }
    }
}
