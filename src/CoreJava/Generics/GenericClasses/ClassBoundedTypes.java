package CoreJava.Generics.GenericClasses;

public class ClassBoundedTypes<T extends Number> {
    T object;

    public ClassBoundedTypes(T object) {
        this.object = object;
    }

    public void show() {
        System.out.println("The type of Object: " + object.getClass().getName());
    }

    public T getObject() {
        return object;
    }


    public static void main(String[] args) {
//        BoundedTypes<String> genericClassString = new BoundedTypes<>("RAM");
//        Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
//        genericClassString.show();
//        System.out.println(genericClassString.getObject());

        ClassBoundedTypes<Integer> genericClassInteger = new ClassBoundedTypes<>(100);
        genericClassInteger.show();
        System.out.println(genericClassInteger.getObject());

    }
}
