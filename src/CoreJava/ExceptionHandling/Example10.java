package CoreJava.ExceptionHandling;

import CoreJava.MethodSignature.Example;

/*
   We can use throw keyword for only throwable types if we try to use for normal java objects we will get compile
   time error saying "Incompatible types".
 */
public class Example10 {
    public static void main(String[] args){
        throw new Example10();
    }
}
/*
   Output:
   =======
   java: incompatible types: CoreJava.ExceptionHandling.Example10 cannot be converted to java.lang.Throwable
 */
