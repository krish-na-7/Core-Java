package CoreJava.ExceptionHandling;

/*
     Case 2:
     =======
     We can use throws keyword only for throwable types, if we are trying to use for normal java classes
     then we will get compile time error saying "Incompatible Types."

 */
public class Example16 extends RuntimeException {
    public void add() throws Example16{

    }
}
