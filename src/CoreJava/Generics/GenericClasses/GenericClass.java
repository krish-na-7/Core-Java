package CoreJava.Generics.GenericClasses;

public class GenericClass<T> {
    T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void show() {
        System.out.println("The type of Object: " + object.getClass().getName());
    }

    public T getObject() {
        return object;
    }


    public static void main(String[] args){
        GenericClass<String> genericClassString = new GenericClass<>("RAM");
        genericClassString.show();
        System.out.println(genericClassString.getObject());

        GenericClass<Integer> genericClassInteger = new GenericClass<>(100);
        genericClassInteger.show();
        System.out.println(genericClassInteger.getObject());

    }
}
