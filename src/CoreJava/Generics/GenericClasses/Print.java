package CoreJava.Generics.GenericClasses;
/*
 *  Generic Type (in above example<T>) can be any non-primitive object
 *
 * */
public class Print <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args){
        Print<Integer> printClass = new Print<>();
        printClass.setValue(1);
        Integer value = printClass.getValue();
        if(value == 1){
            //do something
        }
    }
}
