package CoreJava.Generics.GenericClasses;

public class Pair <K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair() {

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

    private <K,V> void printValue(Pair <K,V> pair1, Pair <K,V> pair2){
        if(pair2.getKey().equals(pair1.getKey())){
            // do something
        }
    }
    public static void main(String[] args){
        Pair<Integer, String > pair = new Pair<>();
        pair.put(7, "Ram");
    }
}
