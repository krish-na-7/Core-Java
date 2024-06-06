package CoreJava.Generics.GenericClasses;

public class Display<T extends Number> {
    T value;

    public T getPrintValue() {
        return value;
    }

    public void setPrintValue(T value) {
        this.value = value;
    }

    public static void main(String[] args){
        Display<Integer> parametrizedTypePrintObject = new Display<>();
//        Display<String> parametrizedTypePrintObject1 = new Display<>();
    }
}
