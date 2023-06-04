package CoreJava.Collections.List;

import java.util.*;

public class ListExample
{
    public static void main(String[] args)
    {
        List ls = new ArrayList();
        ls.add("sita");
        ls.add(7);
        ls.add("ram");
        ls.add(-3);
        ls.add(false);
        // 1. int size(): to get the number of elements in the list.
        System.out.println("size of list => "+ ls.size());

        // 2. boolean isEmpty(): to check if list is empty or not.
        System.out.println("is list empty => "+ ls.isEmpty());

        // 3. boolean contains(Object o): Returns true if this list contains the specified element.
        System.out.println("list contains 7  => "+ ls.contains(7));

        // 4. Object[] toArray(): Returns an array containing all the elements in this list in proper sequence.
        Object[] lsArr = ls.toArray();
        System.out.println("Printing Array elements");
        for( Object obj : lsArr)
        {
            System.out.println("  :"+obj);
        }

        // 5. boolean add(E e): Appends the specified element to the end of this list.
        System.out.println("adding element to list  => "+ ls.add("-9"));

        // 6. Iterator<E> iterator(): Returns an iterator over the elements in this list in proper sequence.
        Iterator itr = ls.iterator();
        System.out.println("Printing List elements using Iterator");
        while(itr.hasNext())
        {
            System.out.println("  :- "+itr.next());
        }
        // 7. boolean remove(Object o): Removes the first occurrence of the specified element from this list.
        System.out.println(ls.remove(false));
        System.out.println("List Elements => " + ls);

        // 8. boolean retainAll(Collection<?> c): Retains only the elements in this list that are contained
        // in the specified collection.
        List lst = new LinkedList();
        lst.add("ram");
        lst.add("sita");
        lst.add(7);
        lst.add(-3);

        System.out.println(" ls Elements -> "+ls);
        System.out.println(" lst Elements -> "+lst);

        System.out.println(ls.retainAll(lst));
        System.out.println(" ls Elements -> "+ls);

        // 9. void clear(): Removes all the elements from the list.
        lst.clear();
        System.out.println(" lst Elements -> "+lst);

        // 10. E get(int index): Returns the element at the specified position in the list.
        System.out.println(" ls Elements -> "+ls);
        ls.get(3);

        // 11. E set(int index, E element): Replaces the element at the specified position in the list with the
        // specified element.
        ls.set(3,-9);
        System.out.println(" ls Elements -> "+ls);


        // 12. ListIterator<E> listIterator(): Returns a list iterator over the elements in the list.
        System.out.println("Printing List elements using ListIterator");
        ListIterator lsitr = ls.listIterator();
        while(lsitr.hasNext())
        {
            System.out.println(" -- "+lsitr.next());
        }

        // 13. List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified
        // fromIndex, inclusive, and toIndex, exclusive. The returned list is backed by this list, so non-structural changes
        // in the returned list are reflected in this list, and vice-versa.

        // 14. default void replaceAll(UnaryOperator<E> operator): Replaces each element of this list with the result of
        //applying the operator to that element.

        // 15. default void sort(Comparator<super E> c): Sorts this list according to the order induced
        // by the specified Comparator.

        System.out.println(" ls Sorted Elements -> "+ls);

        // Java Array to List
        String[] vowels = {"a","e","i","o","u"};
        List<String> vowelsList = Arrays.asList(vowels);
        System.out.println(vowelsList);

        // 16 .default Spliterator<E> spliterator(): Creates a Spliterator over the elements in this list.
        //My custom sorting, reverse order
        Collections.sort(vowelsList);
        System.out.println("Sorted List: "+vowelsList);

        System.out.println(vowelsList.indexOf("i"));

        System.out.println(vowelsList.lastIndexOf("e"));

        // Sorting AlphaNumeric List
        List<String> lis = new ArrayList();
        lis.add("ram");
        lis.add("2");
        lis.add("sita");
        lis.add("7");
        lis.add("-9");
        lis.add("0");
        lis.add("Arjun");
        lis.add("5Pandavas");

        lis.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println(lis);
    }
}
