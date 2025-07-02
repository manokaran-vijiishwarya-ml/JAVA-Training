```java
import java.util.HashMap;
import java.util.Map;

// Generic class with T and U
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public <E> void printElement(E element) {
        System.out.println("Element (E): " + element + " | Type: " + element.getClass().getSimpleName());
    }

    public <K, V> void storeInMap(K key, V value) {
        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        System.out.println("Map Entry -> Key (K): " + key + ", Value (V): " + value);
    }
}

public class Generic {
    public static void main(String[] args) {
        // Using Pair with T = String, U = Integer
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("First (T): " + pair.getFirst());
        System.out.println("Second (U): " + pair.getSecond());

        // Using generic method with E
        pair.printElement(3.14);              // E = Double
        pair.printElement("Generic Element"); // E = String

        // Using generic method with K and V (like a Map)
        pair.storeInMap("Name", "Viji");     // K = String, V = String
        pair.storeInMap(101, true);           // K = Integer, V = Boolean
    }
}

```



T	-> Class-level -> First type in the Pair class	-> String in Pair<String, Integer>

U	-> Class-level ->	Second type in the Pair -> class	Integer

E	-> Method-level	-> For printing any element	-> 3.14, "Hello"

K	-> Method-level	-> Key in a key-value pair (map style) -> "Name", 101

V -> Method-level	-> Value in key-value pair ->	"Viji", true
