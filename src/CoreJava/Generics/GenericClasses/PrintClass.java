package CoreJava.Generics.GenericClasses;

public class PrintClass {
    Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args){
        PrintClass printClass = new PrintClass();
        printClass.setValue(1);
        Object value = printClass.getValue();
        // We cannot use value directly, we  have to typecast it ,else it will give compile time error.
        if((int)value == 1){
            // do something
        }
    }
}
