UPCASTING:

```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Barking");
    }
    void fetch() {
        System.out.println("Fetching");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.makeSound();        
        // a.fetch();          // Not allowed — only Animal methods are accessible
    }
}

```
Upcasting will be done internally.

The actual object is a Dog, but accessed through an Animal reference — only parent class methods and child class overriden methods are accessible. 

Supports Polymorphism.



