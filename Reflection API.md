In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

In order to reflect a Java class, we first need to create an object of Class.

1. Using .class extension
2. Using getClass() method
3. Using forName() method

For Classes:

getName() - returns the name of the class

getModifiers() - returns the access modifier of the class in integer form

getSuperclass() - returns the super class of the class



using object of Class to get all the declared methods of Dog:

Method[] methods = obj.getDeclaredMethods();

getName() - returns the name of a method

getModifiers() - returns the access modifier of methods in integer form

getReturnType() - returns the return type of methods

```java

import java.lang.reflect.Method;

class Animal{
    public void disp(){
        System.out.println("I am animal");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Barking");
    }
}

public class ReflectionDemo {
    public static void main(String[] args){
        Dog d = new Dog();
        // d.disp();
        // d.makeSound();

        Class obj = Dog.class;
        System.out.println("Class Name: " + obj.getName());
        System.out.println(obj.getSuperclass());
        Method[] methods = obj.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
    }

}

```

Including Interface, classname, modifier, superclass, constructors, methods, fields

```java
import java.lang.reflect.*;

interface Animal {
    public abstract void disp();
}

class Dog implements Animal {
    private String breed = "Labrador";  // Field for reflection

    public Dog() {}  

    public Dog(String name) {
        System.out.println("Dog name: " + name);
    }

    public void disp() {
        System.out.println("Barking");
    }
    private void test(String message, int count) {
        System.out.println("Message: " + message + ", Count: " + count);
        // System.out.println("This is a private method");
    }
}

public class Reflection{
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        try {
            // Getting the class object using reflection
            Class<?> obj = Class.forName("Dog");

            // Class Name
            System.out.println("Class Name: " + obj.getName());

            // Modifiers
            int modifiers = obj.getModifiers();
            System.out.println("Class Modifiers: " + Modifier.toString(modifiers));

            // Superclass
            System.out.println("Superclass: " + obj.getSuperclass().getName());
            
            // Interfaces
            Class<?>[] interfaces = obj.getInterfaces();
            if (interfaces.length == 0) {
                System.out.println("No interfaces implemented.");
            } else {
                System.out.println("Interfaces:");
                for (Class<?> i : interfaces) {
                    System.out.println(i.getName());
                }
            }

            // Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = obj.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("Constructor: " + c.getName());
                System.out.println("Parameter count: " + c.getParameterCount());
            }

            // Methods
            System.out.println("\nMethods:");
            Method[] methods = obj.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("Method Name: " + m.getName());
                System.out.println("Return Type: " + m.getReturnType().getName());

            }
            // Create an instance of the Dog class
            Object dogInstance = obj.getDeclaredConstructor().newInstance();
            
            // Get the private method 'test'
            Method privateMethod = obj.getDeclaredMethod("test", String.class, int.class);   
            privateMethod.setAccessible(true); // Allow access to private method   
            try {
                // Pass arguments to the 'test' method
                privateMethod.invoke(dogInstance, "Hello Reflection", 5); // Pass arguments
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

            // Fields
            System.out.println("\nFields:");
            Field[] fields = obj.getDeclaredFields();
            for (Field f : fields) {
                System.out.println("Field Name: " + f.getName());
                System.out.println("Type: " + f.getType().getName());
                System.out.println("Modifier: " + Modifier.toString(f.getModifiers()));
                //System.out.println(f.getModifiers());
                    // if f.getModifiers alone is used then it will print some integer values say 1 for public, 2 for private, 4 for protected.
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```
output:
Class Name: Dog

Class Modifiers: 

Superclass: java.lang.Object

Interfaces: Animal

Constructors:

Constructor: Dog

Parameter count: 0

Constructor: Dog

Parameter count: 1

Methods:

Method Name: test 

Return Type: void

Method Name: disp

Return Type: void

Message: Hello Reflection, Count: 5

Fields:

Field Name: breed

Type: java.lang.String

Modifier: private


The exception java.lang.NoSuchMethodException: Dog.<init>() occurs because the Dog class does not have a default (no-argument) constructor, and the reflection code is trying to create an instance of the Dog class using obj.getDeclaredConstructor().newInstance().

Angle brackets represents the class with any type.
