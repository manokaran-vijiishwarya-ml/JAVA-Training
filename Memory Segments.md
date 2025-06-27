Memory Segments in java

Stack:
  Stores method calls, local variables, and function parameters.

Heap:
   Stores all objects and instance variables.

``` java
public class Example {
    int i=2;
    void display(int i){
        System.out.println(i);
        i=5;
        System.out.println("After:" +i);   
     }
     void display(Example obj){
        System.out.println(obj.i);
        obj.i=5;
        System.out.println("After:" +obj.i);
     }
    public static void main(String[] args){
        int i =1;
        Example obj = new Example();
        Integer a = i;
        System.out.println(i); 
        System.out.println(obj);
        System.out.println(obj.i);
        obj.display(i);
        System.out.println("After method call: " + i); 
        obj.display(obj);
        System.out.println("After method call: " + obj.i);
    }    
}
```

Output:
  1
  Example@<memory_address>
  2
  1
  After:5
  After method call: 1
  2
  After:5
  After method call: 5

Explanation:

   main() method execution:
    
    int i = 1;
    i is a primitive local variable stored on the stack.
    
    
    Example obj = new Example();
    obj is a reference variable stored on the stack.
    
    new Example() creates an object on the heap.
    
    Field int i = 2 is stored in the heap as part of the object.
    
    obj (on the stack) stores a reference (memory address) to that heap object. (heap object reference stored in stack).
    
    
    Integer a = i;
    Autoboxing: the primitive int i = 1 is converted to an Integer object.
    
    a is a reference (stack), pointing to an Integer object on the heap.
    
    The actual Integer object holds the value 1.
    
    
  obj.display(i):
    
    void display(int i) {
        System.out.println(i);  // prints 1
        i = 5;
        System.out.println("After:" + i); 
    }
    Here, the method parameter int i shadows the variable i from main.
    
    The value 1 is passed by value (i.e., a copy) → so changes to i inside display() do not affect main's i.
    
    i inside display() is stored in the stack as a methods local variable

   obj.display(obj):
   
     void display(Example obj) {
        System.out.println(obj.i); // prints 2
        obj.i = 5;
        System.out.println("After:" + obj.i); // prints 5
    }
      obj (in the method) is a reference copy of the same obj from main.
      
      So obj.i = 5; modifies the original object on the heap.


Stack:
  i = 1 => Primitive local variable in main()
  a	=> Reference to Integer object
  obj => Reference to Example object
  i in display(int i) => Local parameter (primitive)
  obj in display(Example obj) => Local parameter (reference)

Heap:
  new Example() => object	Created explicitly with new
  Field i = 2 (later becomes 5) =>	Instance variable of Example object
  Integer a	=> Autoboxed value of int i = 1




