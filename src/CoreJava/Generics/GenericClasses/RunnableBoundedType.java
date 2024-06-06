package CoreJava.Generics.GenericClasses;

public class RunnableBoundedType <T extends Runnable>{

    public static void main(String[] args) {
        RunnableBoundedType<Runnable> runnableBoundedType = new RunnableBoundedType<>();
        RunnableBoundedType<Thread> threadBoundedType = new RunnableBoundedType<>();
//        RunnableBoundedType<Integer> integerBoundedType = new RunnableBoundedType<>();
//        Type parameter 'java.lang.Integer' is not within its bound; should implement 'java.lang.Runnable'
    }
}
