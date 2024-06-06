package CoreJava.Generics.GenericClasses;

/*
 *   Multi Bound:
 *   ===========
 *   <T extends Superclass & interface1 & interface2>
 *   - The first restrictive type should be concrete class.
 *   - 2,3 and so on can be interfaces.
 *
 * */

public class Print1<T extends Number & Runnable & Comparable> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args){
//        A obj = new A();
//        Print<A> print = new Print<>();
    }
}
