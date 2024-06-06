package CoreJava.GarbageCollection;

import java.util.Date;

public class Example1 {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        for(int i = 0 ; i < 900000000 ; i++){
            Date date = new Date();
            date.clone();
            date = null;
        }
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.gc();
        System.out.println(runtime.freeMemory());
    }
}
