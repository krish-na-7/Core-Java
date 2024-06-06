package CoreJava.Generics.GenericClasses;

public class RawType {
    public static void main(String[] args) {
        // Internally it passes  Object as parametrized type.
        Print rawTypePrintObject = new Print();
        rawTypePrintObject.setValue(7);
        rawTypePrintObject.setValue("Ram");
    }
}
