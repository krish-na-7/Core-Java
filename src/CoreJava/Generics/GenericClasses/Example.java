package CoreJava.Generics.GenericClasses;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<?> a2 = new ArrayList<String>();
        ArrayList<?> a3 = new ArrayList<Integer>();
        ArrayList<? extends Number> a4 = new ArrayList<Integer>();
//        ArrayList<? extends Number> a5 = new ArrayList<String>();
        ArrayList<? super String> a6 = new ArrayList<Object>();
//        ArrayList<?> a7 = new ArrayList<?>();
//        ArrayList<?> a3 = new ArrayList<? extends Number>();
    }
}
