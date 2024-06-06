package CoreJava.Generics.GenericClasses;

public class ColorPrint<T> extends Print<T> {
    public static void main(String[] args) {
        ColorPrint<String> ColorPrint = new ColorPrint<>();
        ColorPrint.setValue("Ram");
        Object value = ColorPrint.getValue();
    }
}
