HashSet:

No order
not allow duplicates
1 null value

Set<String> s = new HashSet<>();

LinkedHashSet:

maintain insertion order

not allow duplicates

1 null value is allowed

Set <String> l = new LinkedHashSet<>();

TreeSet:

sorted order

no duplicates

no null values allowed

Set <String> t = new TreeSet<>();

```java
import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana"); // duplicate
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); // duplicate
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana"); // duplicate
        System.out.println("TreeSet: " + treeSet);


        // Set<String> s = new HashSet<>();
        treeSet.addAll(Arrays.asList("Apple", "Strawberry", "Cherry"));
        System.out.println(treeSet);

        Set<String> setunion =new HashSet<>(treeSet);
        setunion.addAll(Arrays.asList("Grapes", "Mango"));
        System.out.println(setunion);
        Set<String> setinter=new HashSet<>(treeSet);
        setinter.retainAll(Arrays.asList("Apple", "Banana"));
        System.out.println(setinter);
        Set<String> setdiff = new HashSet<>(treeSet);
        setdiff.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println(setdiff);

        hashSet.add(null);
        System.out.println(hashSet);

        if (!linkedHashSet.isEmpty()) {
            String min = Collections.min(linkedHashSet);
            String max = Collections.max(linkedHashSet);
            System.out.println("Lexicographically smallest: " + min);
            System.out.println("Lexicographically largest: " + max);
        }
    }
}
```


Union-> addAll()

Intersection->retainAll()

Set Difference -> removeAll()

Add multiple elements to set using set.addAll(Arrays.asList())

-> creates list<> with elements 

-> adds all elements to list

EnumSet -> All Enums of same enum type
