Generics -> used to pass any type to class or method

Generic has two wildcard:

1. Lower Bound -> It will accept the present class type and its super types alone not the corresponding subtypes. -> only write -> Super
 
2. Upper Bound -> It will accept the current type and its sub class type alone, super is not supported. -> only read -> Extends
 

left side its mandatory to represent the type but in right side to avoid repetition we are not mentioning and it will automatically take the type from left <> i.e. <T>

1. Super

```java

import java.util.*;
public class SortedSuper {
public <T extends Comparable<T>> void copyAndPrintSorted(List<T> source, List<? super T> destination) {
     Collections.sort(source); 
        for (T item : source) {
            destination.add(item);
        }
        System.out.println("Copied & Sorted List:");
        for (Object obj : destination) { 
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
    
        SortedSuper sorter = new SortedSuper();
        List<Integer> intList = new ArrayList<>(Arrays.asList(10, 2, 5, 7));
        List<Number> numberList = new ArrayList<>();

        System.out.println("Integer : Number List:");
        sorter.copyAndPrintSorted(intList, numberList);  

        List<Float> floatList = new ArrayList<>(Arrays.asList(4.4f, 1.1f, 3.3f));
        List<Object> objectList = new ArrayList<>();

        System.out.println("Float : Object List:");
        sorter.copyAndPrintSorted(floatList, objectList);
    }
}

```
The above code will accept of type Integer and Number and Object but not float

2.Extends

```java

import java.util.*;
public class SortedExtends {
    public static <T extends Number & Comparable<T>> void sortAndPrint(List<T> list) {
        Collections.sort(list); 
        System.out.println("Sorted List:");
        for (T num : list) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(10, 2, 5, 7));
        List<Float> floatList = new ArrayList<>(Arrays.asList(4.4f, 1.1f, 3.3f));

        System.out.println("Integer List:");
        sortAndPrint(intList);  

        System.out.println("Float List:");
        sortAndPrint(floatList);
    }
}

```
The above code will accept if we pass Integer it will accept only integer if we gave it as number then both integer or float is accepted not object type.




Comparable interface is used inside collection or generics to compare two values (> or <) is not supported.

Inside Comparable we use compareTo for comparing.

> or < works only for primitive types and also invalid for type T.

```java
import java.util.Arrays;
public class Sort {
    public static <T extends Comparable<T>> void bubblesort(T[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j].compareTo(num[j + 1]) > 0) {
                    T temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] num = {10, 5, 8, 2};
        bubblesort(num);
        System.out.println(Arrays.toString(num));
    }
}
```


