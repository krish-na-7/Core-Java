package CoreJava.MethodOverriding;

/*
      Rule 5 : While overriding we can't reduce the scope of the Parent class method access modifiers,
      but we can increase the scope of Parent class method access modifiers.

      private < default < protected < public

      Parent Class                  public              protected               default                    private
      Method access Modifier




      Child Class
      Method Access Modifier        public              protected or           default  or               Overriding concept not
                                                        public                 protected  or             applicable for private
                                                                                public                   methods
 */

public class Example5 {
    public static void main(String[] args){

    }
}
class Parent5{
    public void printMsg(){
        System.out.println("Hello !!");
    }
}
class Child5 extends Parent5{
     protected void printMsg(){
        //Compile Time Error ==> java: printMsg() in CoreJava.MethodOverriding.Child5 cannot override printMsg()
        // in CoreJava.MethodOverriding.Parent5 attempting to assign weaker access privileges; was public
        System.out.println("Good Morning !!!");
    }
}
