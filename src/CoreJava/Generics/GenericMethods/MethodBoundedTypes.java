package CoreJava.Generics.GenericMethods;



public class MethodBoundedTypes {
    private <T> void method1(T object) {

    }

    private <T extends Number> void method2(T object) {

    }

    private <T extends Runnable> void method3(T object) {

    }

    private <T extends Number & Runnable> void method4(T object) {

    }

    private <T extends Comparable & Runnable> void method5(T object) {

    }

    private <T extends Number & Comparable & Runnable> void method6(T object) {

    }

    public static void main(String[] args) {

    }
}
