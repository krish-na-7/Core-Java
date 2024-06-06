package CoreJava.Generics.GenericMethods;

import java.util.ArrayList;

public class GenericBehaviour {

    private static void addElements(ArrayList arrayList) {
        arrayList.add(10);
        arrayList.add(1.9);
        arrayList.add(true);
        arrayList.add(null);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ram");
        arrayList.add("Sita");
//        arrayList.add(10);
        addElements(arrayList);
        System.out.println(arrayList);
    }
}
