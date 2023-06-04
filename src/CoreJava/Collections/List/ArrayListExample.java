package CoreJava.Collections.List;

import java.util.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add("ram");
        l1.add(14.7);
        l1.add(null);
        l1.set(3,new Object());
        // new capacity = current capacity * (3/2) +1

        Iterator itr = l1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        ArrayList l2 = new ArrayList(14);
        //creates ArrayList with size 14


        Set s = new HashSet();
        s.add(12);
        s.add(3);
        s.add(6);
        s.add(5);

        ArrayList l3 = new ArrayList(s);
        //  sorting ArrayList
        Collections.sort(l3);
        System.out.println(l3);

        //Generic ArrayList
        ArrayList<String> l4 = new ArrayList<>();
        l4.add("ram");
        l4.add("sita");
        l4.add("krishna");
        l4.add("radha");
        l4.add(2,"lakshmi");
        System.out.println("Element at index 2 is "+l4.get(2));
        //printing through for each loop
        for(String str : l4)
        {
            System.out.println(str);
        }
        //printing through ListIterator Interface
        ListIterator listitr = l4.listIterator(l1.size());
        while (listitr.hasPrevious())
        {
            System.out.println(listitr.previous());
        }

    }
}
