package CoreJava.StaticControlFlow;

/*
      Static Control Flow :
      =====================
      Whenever we are executing a java class the following sequence of activity will be executed as a part
      of Static Control Flow.
      i) Identification of Static members from top to bottom.
      ii) Execution of Static variable assignment and Static blocks from top to bottom.
      iii) Execution of Main method

      Read Indirect Write Only:
      =========================
      Inside Static Block if we are trying to read a variable that read operation is called Direct Read.
      If we are calling a static method in Static Block and within that method trying to read a variable that read operation
      is called InDirect Read.
      If a variable is just identified by JVM and original value not yet assigned then the variable is said to be in
      Read Indirectly and Write Only(RIWO).
      If a variable in RIWO then we can't perform Direct Read, but we can perform Indirect Read.
      If we try to read Directly then we get Compile Time Error Saying "Illegal Forward Reference"
 */

public class Example1 {
    static int i = 7;
    static
    {
        m1();                   // ==> InDirect Read
        System.out.println(i);  // ==> Direct Read
    }
    public static void m1()
    {
        System.out.println(i);
    }
    public static void main(String[] args)
    {

    }
}
/*
Output:
=======
7
7

 */