package CoreJava.MethodOverloading;

   /*  In Method Overloading method resolution always takes care by compiler,based on reference type
       In Method Overloading run time object won't play any role.
  */

class Animal
{

}
class Lion extends Animal{

}
public class Example7 {

        public void m1(Animal a)
        {
            System.out.println("Animal version");
        }
        public void m1(Lion l){
            System.out.println("Lion Version");
        }
        public static void main(String[] args)
        {
            Example7 c =new Example7();
            Animal a = new Animal();
            Lion l = new Lion();

            c.m1(a);
            c.m1(l);
            Animal al = new Lion();
            c.m1(al);

            /*
            Output:
            Animal version
            Lion Version
            Animal version
             */

        }
}
