package CoreJava.Generics.GenericMethods;

import java.util.ArrayList;

/*
*   WildCards:
*   ==========
*   - Upper bounded wildcard : <? extends UpperBoundedClassName> i.e class Name and below
*   - Lower bounded wildcard : <? super LowerBoundedClassName> i.e class Name and above
*   - Unbounded wildcard : <?> only you can readxx
*
* */

public class WildCard {
    private static void method1(ArrayList<String> arrayList){

    }

    private static void method2(ArrayList<?> arrayList){

    }

    private static void method3(ArrayList<? extends Number> arrayList){

    }

    private static void method4(ArrayList<? super Integer> arrayList){

    }

    public static void main(String[] args){

    }
}
