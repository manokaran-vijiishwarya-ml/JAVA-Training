UPCASTING: subclass object to a superclass reference.

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


DOWNCASTING: superclass reference back to a subclass.

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
        // Dog d = (Dog) a;      // Downcasting
        // d.fetch();            // Now we can access Dog methods

        if (a instanceof Dog) {
        Dog d = (Dog) a;
        d.fetch();  // safe way of downcasting
        } 

    }
}

```
To access child class methods.

Unsafe - causes ClassCastException

Safe way to downcast: is by using instance of.

classcastexception:
You cast a superclass reference to a subclass type, but the actual object is not an instance of that subclass.

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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // Animal a = new Dog();  // Upcasting
        Animal a = new Cat();  // Upcasting to Cat
        a.makeSound();        
        // a.fetch();          // Not allowed — only Animal methods are accessible
        Dog d = (Dog) a;      // Downcasting
        d.fetch();            // Now we can access Dog methods

        // if (a instanceof Dog) {
        // Dog d = (Dog) a;
        // d.fetch();  // safe way of downcasting
        // } 

    }
}

```

output : Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
at Upcasting.main(Upcasting.java:28)


safe way of downcast helps here:
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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // Animal a = new Dog();  // Upcasting
        Animal a = new Cat();  // Upcasting to Cat
        a.makeSound();        
        // a.fetch();          // Not allowed — only Animal methods are accessible
        // Dog d = (Dog) a;      // Downcasting
        // d.fetch();            // Now we can access Dog methods

        if (a instanceof Dog) {
        Dog d = (Dog) a;
        d.fetch();  // safe way of downcasting
        } 
        else{
            System.out.println("a is not an instance of Dog.");
        }
    }
}

```

