1. Array List -> Allow duplicates, Maintain insertion order, null insertion also allowed, better for random access
   
2. Linked List -> Better for frequent access and doesnt care much about index based access

ArrayList
```java

  import java.util.ArrayList;
  import java.util.ListIterator;
  
  public class ArrayListEx {
      public static void main(String[] args){
          ArrayList <String> ar = new ArrayList<>();
          ar.add("Viji");
          ar.add("Vinu");
          ar.add(1,"2");
          System.out.println("ArrayList: " + ar);
          ar.remove(2);
          System.out.println(ar);
          ar.set(0,"vijiishwarya");
          System.out.println(ar);
          System.out.println(ar.contains("2"));
          for(String s:ar){
              System.out.println(s);
          }
          System.out.println("Size of ArrayList: " + ar.size());
          System.out.println("Is ArrayList empty? " + ar.isEmpty());
          System.out.println("Index of 'Vinu': " + ar.indexOf("Vinu"));
          ar.add("Vinu");
          System.out.println(ar.get(2));
          ListIterator list_Iter = ar.listIterator(1);
          while(list_Iter.hasNext()){
              System.out.println(list_Iter.next());
          }
      }
  }

```

LinkedList
```java
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
    public static void main(String[] args){
        LinkedList <String> ll = new LinkedList<>();
        ll.add("Viji");
        ll.add("Vinu");
        ll.add(1,"2");
        System.out.println("LinkedList: " + ll);
        ll.remove(2);
        System.out.println(ll);
        ll.set(0,"vijiishwarya");
        System.out.println(ll);
        System.out.println(ll.contains("2"));
        for(String s:ll){
            System.out.println(s);
        }
        System.out.println("Size of LinkedList: " + ll.size());
        System.out.println("Is LinkedList empty? " + ll.isEmpty());
        System.out.println("Index of 'Vinu': " + ll.indexOf("Vinu"));
        ll.add("Vinu");
        System.out.println(ll.get(2));
        System.out.println(ll);
        ListIterator list_Iter = ll.listIterator(1);
        while(list_Iter.hasNext()){
            System.out.println("beg to end: " + list_Iter.next());
        }
        ListIterator l2 =ll.listIterator(ll.size());
        while(l2.hasPrevious()){
            System.out.println(l2.previous());
        }
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll);
    }
}

```

