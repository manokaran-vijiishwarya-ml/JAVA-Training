Stores data in key value pair

Key must be unique and value can be dupliacted

1 null key and multiple nulll values are alllowed

Map<String, Integer> hm = new HashMap<>();

Each key must map one value

HashMap -> does not maintain order

LinkedHashMap -> naintains insertion order

TreeMap -> sorted order no null values


```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // Add elements to the map
        ageMap.put("Viji", 30);
        ageMap.put("Vinu", 25);
        ageMap.put("Ani", 28);

        // Update an existing key
        ageMap.put("Viji", 31);

        // Access value by key
        System.out.println("Age of Vinu: " + ageMap.get("Vinu"));

        // Check if key exists
        if (ageMap.containsKey("Ani")) {
            System.out.println("Ani is in the map.");
        }
        
        ageMap.put(new String("Nivas"), 35); // Adding a new key with a new String object

        // Iterate over keys and values
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Remove an entry
        ageMap.remove("Vinu");

        // Size of map
        System.out.println("Size: " + ageMap.size());

    }
}

```
