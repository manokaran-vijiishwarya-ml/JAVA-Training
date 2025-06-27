Constructor:

A constructor is a special block of code that is called when an object is created. Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes. This process happens automatically when we use the "new" keyword to create an object.

Order Of constructor execution:

```java
class UG{
     UG() {
        System.out.println("UG constructor called");
    }
}
 
class PG extends UG{
    PG() {
        System.out.println("PG constructor called");
    }
}

class SuperPg extends PG{
    SuperPg() {
        System.out.println("SuperPg constructor called");
    }
}

class Oncologist extends SuperPg{
    Oncologist() {
        System.out.println("Oncologist constructor called");
    }
}

public class OrderOfConstructor {
    public static void main(String[] args){
       Oncologist dr = new Oncologist();
    } 
}

```

Output:

UG constructor called

PG constructor called

SuperPg constructor called

Oncologist Constructor called

When you create new Oncologist(), the JVM first goes up the inheritance chain to make sure all parent classes are initialized first.
Even though you are creating the most derived class, the constructors are called in the base-to-derived order.
