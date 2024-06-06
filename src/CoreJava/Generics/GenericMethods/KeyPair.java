package CoreJava.Generics.GenericMethods;

import CoreJava.Generics.GenericClasses.Pair;

/*
 *  What if we only wants to make  Method Generic, not  complete Class, we can write Generic Methods too.
 *  - Type Parameter should be before the return type of the method declaration.
 *  - Type Parameter scope is limited to method only.
 *
 * */

public class KeyPair<K,V> {
    private K key;
    private V value;

    public KeyPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public KeyPair() {

    }

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    private <K,V> void printValue(Pair<K,V> pair1, Pair <K,V> pair2){
        if(pair2.getKey().equals(pair1.getKey())){
            // do something
        }
    }
    public static void main(String[] args){
        Pair<Integer, String > pair = new Pair<>();
        pair.put(7, "Ram");
    }
}
