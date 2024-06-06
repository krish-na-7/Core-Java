package CoreJava.JVMArchitecture;

import java.lang.reflect.Method;

class Student{
    public String getName(){
        return "ram";
    }
    public int getMarks(){
        return 7;
    }
}
public class ClassObjectExample {
    public static void main(String[] args) throws ClassNotFoundException {
        int count = 0;
        Class c = Class.forName("CoreJava.JVMArchitecture.Student");
        Method[] m = c.getDeclaredMethods();
        for(Method m1 : m){
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The Number of methods: " + count);
        Student s1 = new Student();
        Class c1 = s1.getClass();
        Student s2 = new Student();
        Class c2 = s2.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);

        System.out.println(String.class.getClassLoader());
        System.out.println(ClassObjectExample.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());

        Runtime r = Runtime.getRuntime();
        System.out.println("max memory :" + r.maxMemory());
        System.out.println("total memory :" + r.totalMemory());
        System.out.println("free memory :" + r.freeMemory());
        System.out.println("consumed memory :" + (r.totalMemory() - r.freeMemory()));
    }
}
