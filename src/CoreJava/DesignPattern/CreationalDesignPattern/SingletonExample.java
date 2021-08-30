package CoreJava.DesignPattern.CreationalDesignPattern;

/*
     Singleton Design Pattern:
     ==========================
     It is Creational Design Pattern(related to creation of object).
     Only one instance of the class should exist
     other classes should be able to get instance of Singleton class
     Used in Logging,Cache,Session,Drivers.

     Implementation of Singleton Design Pattern:
     ===========================================
     Constructor should be private
     Public method for returning instance
     Instance type should be private and static

     Initialisation Types:
     =====================
     1. Eager Initialisation
     2. Lazy Initialisation
     3. Thread safe Method Initialisation
     4. Thread safe block Initialisation
 */
class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager()
    {

    }

    public static SingletonEager getInstance()
    {
        return instance;
    }
}

class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSynchronized.class) {
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}

public class SingletonExample {

    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);
        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance2);

        System.out.println();

        SingletonLazy instance3 = SingletonLazy.getInstance();
        System.out.println(instance3);
        SingletonLazy instance4 = SingletonLazy.getInstance();
        System.out.println(instance4);

        System.out.println();

        SingletonSynchronizedMethod instance5 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance5);
        SingletonSynchronizedMethod instance6 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance6);

        System.out.println();

        SingletonSynchronized instance7 = SingletonSynchronized.getInstance();
        System.out.println(instance7);
        SingletonSynchronized instance8 = SingletonSynchronized.getInstance();
        System.out.println(instance8);
    }
}
/*
Output:
=======
CoreJava.DesignPattern.CreationalDesignPattern.SingletonEager@1b6d3586
CoreJava.DesignPattern.CreationalDesignPattern.SingletonEager@1b6d3586

CoreJava.DesignPattern.CreationalDesignPattern.SingletonLazy@4554617c
CoreJava.DesignPattern.CreationalDesignPattern.SingletonLazy@4554617c

CoreJava.DesignPattern.CreationalDesignPattern.SingletonSynchronizedMethod@74a14482
CoreJava.DesignPattern.CreationalDesignPattern.SingletonSynchronizedMethod@74a14482

CoreJava.DesignPattern.CreationalDesignPattern.SingletonSynchronized@1540e19d
CoreJava.DesignPattern.CreationalDesignPattern.SingletonSynchronized@1540e19d

 */