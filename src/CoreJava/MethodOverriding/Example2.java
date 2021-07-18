package CoreJava.MethodOverriding;

/*
     Rules for Overriding :
     ---------------------
     Rule 1 : In Overriding method names and argument types must be same
     i.e. method signature must be same.

     Rule 2 :  In Overriding return types must be same,but this is applicable until 1.4 version.
     From 1.5 version onwards we can take co-variant return types. According to this child class
     method return types need not to be same as parent class method return types,it's child types
     also allowed.It is invalid in 1.4 version and valid from 1.5 version.

     Parent Class                  Object             Number         String            Double
     Method Return Types




     Child Class                  Object or          Number  or      Object             int
     Method Return Types          String  or         Integer or      (Not correct)     (Not correct)
                                  String Buffer...    Float ....

     Co-Variant return types applicable only  for objects types but not for Primitive types.
 */


public class Example2 {
}
class Parent2{
    public Object method2(){
        return null;
    }
}
class Child2{
    public String method2(){
        return "Hello";        //  Example of Co-Variant return types
    }
}
