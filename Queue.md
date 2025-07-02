Queue <> q = new LinkedList<>();

FIFO processing (e.g., LinkedList, ArrayDeque)

Priority-based processing (PriorityQueue)

Thread-safe, non-blocking communication (ConcurrentLinkedQueue)

Double-ended operations (ArrayDeque)

Method	Description:

add(E e)	-> Adds element; throws exception if full

offer(E e) -> Adds element; returns false if full

poll() ->	Retrieves and removes head; returns null if empty

remove() ->	Retrieves and removes head; throws exception if empty

peek() ->	Retrieves head without removing; returns null if empty

element() ->	Retrieves head without removing; throws exception if empty


```java
import java.util.*;
import java.util.concurrent.*;

public class QueueTypesExample {
    public static void main(String[] args) {
        // 1. LinkedList as Queue (FIFO)
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("Linked-A");
        linkedListQueue.add("Linked-B");
        linkedListQueue.add("Linked-C");
        System.out.println("LinkedList Queue (FIFO): " + linkedListQueue);
        System.out.println("Removed from LinkedList: " + linkedListQueue.poll());

        // 2. PriorityQueue (Not FIFO – orders based on  priority)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        System.out.println("\nPriorityQueue" + priorityQueue);
        System.out.println("Polled from PriorityQueue: " + priorityQueue.poll());  // Smallest comes out first

        // 3. ArrayDeque (Double-ended queue – no nulls allowed)
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("Deque-A");
        arrayDeque.offerLast("Deque-B");
        arrayDeque.offerFirst("Deque-C");
        System.out.println("\nArrayDeque (Double-ended): " + arrayDeque);
        System.out.println("Polled from front: " + arrayDeque.pollFirst());
        System.out.println("Polled from end: " + arrayDeque.pollLast());

        // 4. ConcurrentLinkedQueue (Thread-safe, non-blocking)
        Queue<String> concurrentQueue = new ConcurrentLinkedQueue<>();
        concurrentQueue.add("Concurrent-A");
        concurrentQueue.add("Concurrent-B");
        System.out.println("\nConcurrentLinkedQueue (Thread-safe): " + concurrentQueue);
        System.out.println("Polled from ConcurrentLinkedQueue: " + concurrentQueue.poll());
    }
}

```

