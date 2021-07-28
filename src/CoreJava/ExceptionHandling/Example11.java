package CoreJava.ExceptionHandling;
/*
      Example for throwing customized exception or user defined exception
 */

public class Example11 extends RuntimeException{

    public static void main(String[] args){
        throw new Example11();
    }

}
/*
  Output:
  =======
  Exception in thread "main" CoreJava.ExceptionHandling.Example11
	at CoreJava.ExceptionHandling.Example11.main(Example11.java:9)
 */