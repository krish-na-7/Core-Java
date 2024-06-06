package CoreJava.Generics.GenericClasses;

public class NonGenericSubclass extends Print<String>{

    public static void main(String[] args){
        NonGenericSubclass obj = new NonGenericSubclass();
        obj.setValue("Ram");
    }
}
