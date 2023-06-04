package CoreJava.Collections.List;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program1
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();


        List<Character> ls1 = str1.chars().mapToObj(a -> (char)a).collect(Collectors.toList());
        List<Character> ls2 = str2.chars().mapToObj( a -> (char)a).collect(Collectors.toList());
        List<Character> ls3 = str1.chars().mapToObj(a -> (char)a).collect(Collectors.toList());
        System.out.println(ls1);
        System.out.println(ls2);

        ls1.removeAll(ls2);
        ls2.removeAll(ls3);
        String result1 = ls1.stream().map(s -> String.valueOf(s)).collect(Collectors.joining());
        String result2 = ls2.stream().map(s -> String.valueOf(s)).collect(Collectors.joining());
        System.out.println(result1);
        System.out.println(result2);
    }
}
