import java.util.*;

public class CPSC319HashMap<K, V> {
    private int capacity;
    private float loadFactor;
    private int size;
    ArrayList<LinkedList<Pair<K, V>>> data;
    public CPSC319HashMap(int theCapacity, float theLoadFactor){
        size = 0;
        capacity = theCapacity;
        loadFactor = theLoadFactor;
        data = new ArrayList<>(theCapacity);
        for(int i=0; i < capacity; i++)
            data.add(new LinkedList<Pair<K, V>>());
    }

    public int getCapacity(){
        return capacity;
    }
    public int size() {
        //TODO: Implement this method
        return 0;
    }

    public boolean isEmpty() {
        //TODO: Implement this method
        return false;
    }

    public boolean containsKey(K key) {
        //TODO: Implement this method
        return false;
    }

    public V get(K key) {
        //TODO: Implement this method
        return null;
    }

    public V put(K key, V value) {
        //TODO: Implement this method
        return null;
    }

    public V remove(K key) {
        //TODO: Implement this method
        return null;
    }

    public Set<K> keySet() {
        //TODO: Implement this method
        return null;
    }

    public Collection<V> values() {
        //TODO: Implement this method
        return null;
    }

    public HashSet<Pair<K, V>> entrySet() {
        //TODO: Implement this method
        return null;
    }
    private float load(){
        return this.size/ data.size();
    }

    public String toString(){
        //TODO: Implement this method
        return "";
    }
    private int getIndex(K key){
        int index = key.hashCode() % capacity;
        if(index < 0)
            index += capacity;
        return index;
    }
}
