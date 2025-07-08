	Class and Object
	•	Constructors, methods
	•	Inheritance, polymorphism
	•	Encapsulation and abstraction  Yes, in Java it is absolutely possible to have multiple objects (instances) of the same class. In your Main.java example, both myDog and yourDog are separate objects created from the Dog class. Each object has its own set of attributes and can behave independently.
This is a fundamental concept in object-oriented programming—one class can be used to create many objects.

In Java, you can define a class (like Dog) either inside another class (Main) or separately. In your example, Dog is written as a separate class in the same file, but not inside the Main class. This is called a "top-level" or "package-private" class.
Why is it done this way?
* It keeps the code organized and readable.
* The Dog class can be reused by other classes in the same file or package.
* Java allows only one public class per file (the file name must match the public class), but you can have multiple non-public classes in the same file.
Can you put Dog inside Main? Yes, you can make Dog an inner class inside Main, but then it would only be accessible through Main (e.g., Main.Dog). For most cases, especially for simple models like Dog, keeping it separate is clearer and more flexible.

```java
 public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); 
        myDog.name = "Buddy";
        myDog.breed = "Golden Retriever";
        myDog.bark(); 

        Dog yourDog = new Dog();
        yourDog.name = "Scooby";
        yourDog.breed = "Labrador";
        yourDog.bark(); 
    }

    // Dog class as an inner class inside Main
    static class Dog {
        String name;
        String breed;

        void bark() {
            System.out.println(name + " barks!");
        }
    }
}
```
The Dog class is now defined inside the Main class as a static inner class. You can use it just like before, and your code will work the same way. 


         ```java
         public class Main {
         public static void main(String[] args) {
         Dog myDog = new Dog(); 
          myDog.name = "Buddy";
          myDog.breed = "Golden Retriever";
          myDog.bark(); 

        Dog yourDog = new Dog();
        yourDog.name = "Scooby";
        yourDog.breed = "Labrador";
        yourDog.bark(); 

                 
              }
          }
          
          class Dog {
              String name;
              String breed;
          
              void bark() {
                  System.out.println(name + " barks!");
              }
          }
          ```


Class	Object
Class is the blueprint of an object. It is used to create objects.	An object is an instance of the class.
No memory is allocated when a class is declared.	Memory is allocated as soon as an object is created.
A class is a group of similar objects.	An object is a real-world entity such as a book, car, etc.
Class is a logical entity.	An object is a physical entity.
A class can only be declared once.	Objects can be created many times as per the requirement.
An example of class can be a car.	Objects of the class car can be BMW, Mercedes, Ferrari, etc.
 
Modifier	Class	Interface
public	Accessible from anywhere from different classes.	Similar to Class, accessible anywhere from different classes.
default	It is only accessible within the same package.	Accessible within the same package.
protected	Accessible within the same package and subclasses.	Not applicable to top-level interfaces.
private	Accessible only in the class where it is defined	Not applicable to top-level interfaces and accessible in the same class or interface where it is defined.

```java
import java.io.*;

class static_gfg {

    // static variable
    static int count = 0; 
    void myMethod()
    {
        count++;
        System.out.println(count);
    }
}
class Static{
    public static void main(String[] args)
    {
        // first object creation
        static_gfg obj1 = new static_gfg(); 
          
        // method calling of first object
        obj1.myMethod(); 
          
        // second object creation
        static_gfg obj2
            = new static_gfg(); 
      
        // method calling of second object
        obj2.myMethod(); 
    }
}
```
1. Why does static int count = 0; and int count = 0; give different output?
* static int count = 0; The variable count belongs to the class, not to any specific object. All objects of the class share the same count. So, if one object changes it, the change is visible to all other objects.
* int count = 0; The variable count belongs to each object separately. Each object has its own copy, so changes in one object do not affect the others.
2. Use of static
* static makes a variable or method belong to the class itself, not to any instance (object).
* It is used when you want to share data or behavior across all objects of a class.

3. Why is static necessary here?
* You want to keep a count that is shared by all objects, not separate for each object.
* If you remove static, each object will have its own count, and you won't get a running total.

4. Why is static a non-access modifier in Java?
* Access modifiers (like public, private, protected) control visibility.
* Non-access modifiers (like static, final, abstract) change other properties of classes, methods, or variables.
* static is a non-access modifier because it changes how the variable or method is stored and accessed (at the class level, not the object level), not its visibility.


which is declared as final. If a class is declared as final, then we cannot extend it or inherit from that class.

A final method cannot be overridden 
S.No.	Normal/Regular inner class	Static nested class
1.	Without an outer class object existing, there cannot be an inner class object. That is, the inner class object is always associated with the outer class object.	Without an outer class object existing, there may be a static nested class object. That is, a static nested class object is not associated with the outer class object.
2.	As the main() method can't be declared, the regular inner class can't be invoked directly from the command prompt.	As the main() method can be declared, the static nested class can be invoked directly from the command prompt.
3.	Both static and non-static members of the outer class can be accessed directly.	Only a static member of an outer class can be accessed directly.

Inner Class	Sub Class
It is a class that is nested within another class.	It is a class that inherits from another class.
It can be accessed with the reference of the outer class.	No reference is required. It can be accessed directly without any reference to any class.
It is useful in performing encapsulation properties of OOPs and event handling in AWT(GUI).	It is beneficial in performing the inheritance property of object-oriented programming (OOPs).
It is used when the "has-a" relationship with its outer class is defined.	It is used when the "is-a" relationship is defined with its parent class.
It contains methods as per the requirement.	It must include the methods which are present in the parent class. Also, it can include any other methods too as per the need.
It is always present in the same file where the outer class is present.	It may or may not be available in the same file/package as its parent class.
It cannot define any static methods inside it.	It contains all types of methods either static or non-static.

Need of Wrapper Classes
There are certain needs for using the Wrapper class in Java as mentioned below:
* They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
* The classes in java.util package handle only objects and hence wrapper classes help in this case.
* Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
* An object is needed to support synchronization in multithreading.

Primitive Data Type	Wrapper Class
char	Character
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
boolean	Boolean

1. Autoboxing
The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc. 
2. Unboxing
It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example, conversion of Integer to int, Long to long, Double to double, etc. 

Advantages of Wrapper Classes
* Collections allow only object data.
* On object data we can call multiple methods compareTo(), equals(), toString()
* The cloning process only works on objects
* Object data allows null values.
* Serialization allows only object data.

In Java, constructors play an important role in object creation. A constructor is a special block of code that is called when an object is created. Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes. This process happens automatically when we use the "new" keyword to create an object.
Characteristics of Constructors:
* Same Name as the Class: A constructor has the same name as the class in which it is defined.
* No Return Type: Constructors do not have any return type, not even void. The main purpose of a constructor is to initialize the object, not to return a value.
* Automatically Called on Object Creation: When an object of a class is created, the constructor is called automatically to initialize the object’s attributes.
* Used to Set Initial Values for Object Attributes: Constructors are primarily used to set the initial state or values of an object’s attributes when it is created.
a constructor is automatically called when an object is created in Java.

Features	Constructor	Method
Name	Constructors must have the same name as the class name	Methods can have any valid name
Return Type	Constructors do not return any type	Methods have the return type or void if does not return any value.
Invocation	Constructors are called automatically with new keyword	Methods are called explicitly
Purpose	Constructors are used to initialize objects	Methods are used to perform operations

Constructor Overriding:

Constructor overriding is not possible in Java. Overriding applies to methods, where a subclass provides a specific implementation for a method already defined in its superclass, with the same method signature. Constructors, however, are not inherited by subclasses. When a subclass is instantiated, its constructor is called, and implicitly or explicitly, the superclass's constructor can be invoked using super(), but this is not overriding. Instead, it is a form of constructor chaining, where constructors are linked together.
 
Method Overloading	Method Overriding
Method overloading is a compile-time polymorphism.	Method overriding is a run-time polymorphism.
Method overloading helps to increase the readability of the program.	Method overriding is used to grant the specific implementation of the method that is already provided by its parent class or superclass.
It occurs within the same class or across different classes.	It is performed in two classes with inheritance relationships.
Method overloading does not require inheritance.	Method overriding always needs inheritance.
In method overloading, methods must have the same name but different signatures.	In method overriding, methods must have the same name and the same signature.
In method overloading, the return type can or can not be the same, but the parameter list must differ.	In method overriding, the return type must be the same or covariant.
Static binding is used for overloaded methods.	Dynamic binding is used for overriding methods.
Private and final methods can be overloaded.	Private and final methods can't be overridden.
The argument list should be different while doing method overloading.	The argument list should be the same in method overriding.

Advantages of Method Overloading
The advantages of Method Overloading are listed below:
* It allows same methods name to be used for different operations.
* It allows us to define multiple methods with the same name but with different number of parameter
* Overloaded methods have the same name so we can easily update them in one place rather than updating them in multiple method names.
Disadvantages of Method Overloading
The disadvantages of Method Overloading are listed below:
* Too many overloaded methods with similar signatures can make the code more difficult to understand.
* Managing multiple overloaded methods with different parameters can make debugging more difficult.
* To many overloaded methods can also increase the complexity of the program


Overriding a method:
* Method Overriding requires inheritance.
* In method overriding, method signature including name and parameter must match exactly.
* In method overriding, return type must be same.
* In method overriding, private and final methods can not be overridden.
* @Override annotation ensures correct overriding.

Advantages of Method Overriding
The advantages of Method Overriding are listed below:
* It allows for dynamic method dispatch which enhance the flexibility.
* It allows changes to specific class behaviors without changing the entire class hierarchy.
* We can easily extend classes and modify behaviors without altering the parent class.
Disadvantages of Method Overriding
The disadvantages of Method Overriding are listed below:
* Overriding methods can make the code more complex in large inheritance hierarchies.
* It is only useful in inheritance, it is not applicable for all design situation.
* Overriding methods can also lead to unintentional behavior changes.

Algorithm to Implement Abstraction
* Determine the classes or interfaces that will be part of the abstraction.
* Create an abstract class or interface that defines the common behaviors and properties of these classes.
* Define abstract methods within the abstract class or interface that do not have any implementation details.
* Implement concrete classes that extend the abstract class or implement the interface.
* Override the abstract methods in the concrete classes to provide their specific implementations.
* Use the concrete classes to contain the program logic.

When to Use Abstract Classes and Abstract Methods?
There are situations in which we will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method. Sometimes we will want to create a superclass that only defines a generalization form that will be shared by all of its subclasses, leaving it to each subclass to fill in the details.
Consider a classic “shape” example, perhaps used in a computer-aided design system or game simulation. The base type is “shape” and each shape has a color, size, and so on. From this, specific types of shapes are derived(inherited)-circle, square, triangle, and so on — each of which may have additional characteristics and behaviors. For example, certain shapes can be flipped. Some behaviors may be different, such as when you want to calculate the area of a shape. The shape hierarchy shows both the similarities that all shapes share and the differences that makes each one unique.
 Abstraction code observation:
You get an error at Animal myDog = new Animal("Scooby"); because Animal is an abstract class, and in Java, you cannot create objects (instances) of an abstract class directly.
Abstract classes are meant to be extended by other classes. You can only create objects of concrete subclasses (like Dog or Cat) that implement all abstract methods.


In Java, abstract class is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies). An abstract is a Java modifier applicable for classes and methods in Java but not for Variables. In this article, we will learn the use of abstract classes in Java.
What is Abstract Class in Java?
Java abstract class is a class that can not be instantiated by itself, it needs to be subclassed by another class to use its properties. An abstract class is declared using the "abstract" keyword in its class definition.


In Java, the following some important observations about abstract classes are as follows:
1. An instance of an abstract class can not be created.
2. Constructors are allowed.
3. We can have an abstract class without any abstract method.
4. There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: "Illegal combination of modifiers: abstract and final"
5. We can define static methods in an abstract class
6. We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
7. If a class contains at least one abstract method then compulsory should declare a class as abstract 
8. If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method

Difference Between Abstract Class and Interface
Points	Abstract Class	Interface
Definition	Cannot be instantiated; contains both abstract (without implementation) and concrete methods (with implementation)	Specifies a set of methods a class must implement; methods are abstract by default.
Implementation Method	Can have both implemented and abstract methods.	Methods are abstract by default; Java 8, can have default and static methods.
Inheritance	class can inherit from only one abstract class.	A class can implement multiple interfaces.
Access Modifiers	Methods and properties can have any access modifier (public, protected, private).	Methods and properties are implicitly public.
Variables	Can have member variables (final, non-final, static, non-static).	Variables are implicitly public, static, and final (constants).

Encapsulation:
in Java, encapsulation is one of the coret concept of Object Oriented Programming (OOP) in which we bind the data members and methods into a single unit. Encapsulation is used to hide the implementation part and show the functionality for better readability and usability. The following are important points about encapsulation.
* Better Code Management : We can change data representation and implementation any time without changing the other codes using it if we keep method parameters and return values same. With encapsulation, we ensure that no other code would have access to implementation details and data members.
* Simpler Parameter Passing : When we pass an object to a method, everything (associated data members and methods are passed along). We do not have to pass individual members.
* getter and setter: getter (display the data) and setter method ( modify the data) are used to provide the functionality to access and modify the data, and the implementation of this method is hidden from the user. The user can use this method, but cannot access the data directly.

Advantages of Encapsulation
The advantages of encapsulation are listed below:
* Data Hiding: Encapsulation is used to hides the details of a class. We do not need to worry about how it works. It just use the setter methods to give values to the variables.
* Data Integrity: With the help of setter and getter methods we can ensure that the correct data is assigned to the variable.
* Reusability: Witht the help of encapuslation the readability of the code increases also the changing of code becomes eaiser when we need to add new feature in the code.
* Testing code is easy: Encapsulated code is easy to test for unit testing.
* Freedom of advantages the details: one of the major advantages of encapsulation is that it gives the programmer freedom to implement the details of a system. The only constraint on the programmer is to maintain the abstract interface that outsiders see. 
Disadvantages of Encapsulation
The disadvantages of encapsulation are listed below:
* Sometimes encapuslation can make the code complex and hard to understand if we do not use it in the right way.
* It can make it more difficult to understand how the program works because some part of the program are hidden.
Common Mistakes To Avoid
The common mistakes that can occur when working with encapsulation in Java are listed below:
* Exposing Internal Data Directly: Changing or reading the class variables directly without using getter and setter, breaks the encapuslation concepts.
* Not Using Access Modifiers Correctly: Not using correct access modifier can allow unauthorzied access to the data.
* Overuse of Public Methods: Making all the methods public is not a good practice, only declared needed methods to be public so that the data keep safe.
* Failing to Validate Input: If we don’t check the values before setting them, wrong or bad data can go into the class, which may cause problems later.
Best Practices
* Use Private Fields: Keep the class varaibles as private so that no one outside the class can change them directly.
* Use Getter and Setter Methods: Use getters to get the value and setters to change the value.
* Control Access with Access Modifiers: Use access modifiers the right way to hide what should be hidden and show only what is needed.
* Validate Data Before Modifying: Always check the data inside setter methods before saving it to make sure it is correct.

Encapsulation in Java
Encapsulation = Binding data (fields) and methods (operations) together in one unit — a class — and restricting direct access to some of the class’s components.

Why Data Members Are private?
To protect the internal state of the object.
Prevent unauthorized or accidental modification of critical data.

Why methods as public? To allow controlled access to the private data.
The public methods (called getters/setters) serve as gatekeepers.
They enforce validation, security, and rules.


/*
 * POLYMORPHISM IN JAVA - COMPLETE EXPLANATION
 * ===========================================
 * 
 * Polymorphism means "many forms" - the ability of objects of different types
 * to be treated as instances of the same type through a common interface.
 * 
 * KEY CONCEPTS:
 * - Runtime Polymorphism (Method Overriding)
 * - Compile-time Polymorphism (Method Overloading)
 * - Dynamic Method Dispatch
 * - Upcasting and Downcasting
 */
```java
// =============================================================================
// BASIC POLYMORPHISM EXAMPLE
// =============================================================================

class Hospital {
    public void treat() {
        System.out.println("Do Treatment");
    }
    
    public void emergencyService() {
        System.out.println("Providing emergency service");
    }
}

class Doctor extends Hospital {
    @Override
    public void treat() {
        System.out.println("Doctor treats patients with medicine");
    }
    
    public void prescribe() {
        System.out.println("Doctor prescribing medicine");
    }
}

class Nurse extends Hospital {
    @Override
    public void treat() {
        System.out.println("Nurse treats patients with care");
    }
    
    public void checkVitals() {
        System.out.println("Nurse checking patient vitals");
    }
}

class Surgeon extends Hospital {
    @Override
    public void treat() {
        System.out.println("Surgeon treats patients with surgery");
    }
    
    public void performSurgery() {
        System.out.println("Surgeon performing complex surgery");
    }
}

// =============================================================================
// WHY POLYMORPHISM WORKS - TECHNICAL EXPLANATION
// =============================================================================

/*
 * HOW POLYMORPHISM WORKS:
 * =====================
 * 
 * 1. INHERITANCE: Child classes inherit from parent class
 * 2. METHOD OVERRIDING: Child classes override parent methods
 * 3. DYNAMIC METHOD DISPATCH: JVM decides which method to call at RUNTIME
 * 4. UPCASTING: Child object referenced by parent type
 * 
 * EXAMPLE:
 * Hospital h = new Doctor();  // Upcasting
 * h.treat();                  // Calls Doctor's treat() method, not Hospital's
 * 
 * The JVM looks at the ACTUAL OBJECT TYPE (Doctor), not the REFERENCE TYPE (Hospital)
 */

// =============================================================================
// POLYMORPHISM BENEFITS DEMONSTRATION
// =============================================================================

class HospitalManager {
    
    // Method that works with ANY Hospital staff member
    public void conductTreatment(Hospital staff) {
        System.out.println("=== Treatment Session ===");
        staff.treat();  // Polymorphic call - different behavior based on actual object
        staff.emergencyService();
        System.out.println("=== Session Complete ===\n");
    }
    
    // Array-based polymorphism
    public void dailyOperations(Hospital[] staff) {
        System.out.println("=== Daily Hospital Operations ===");
        for (Hospital member : staff) {
            member.treat();  // Each object calls its own version
        }
        System.out.println("=== Operations Complete ===\n");
    }
    
    // Demonstrating method overloading (compile-time polymorphism)
    public void scheduleAppointment(String patientName) {
        System.out.println("Appointment scheduled for: " + patientName);
    }
    
    public void scheduleAppointment(String patientName, String time) {
        System.out.println("Appointment scheduled for: " + patientName + " at " + time);
    }
    
    public void scheduleAppointment(String patientName, String time, String doctor) {
        System.out.println("Appointment scheduled for: " + patientName + " at " + time + " with Dr. " + doctor);
    }
}

// =============================================================================
// ADVANCED POLYMORPHISM CONCEPTS
// =============================================================================

abstract class MedicalDevice {
    protected String deviceName;
    
    public MedicalDevice(String name) {
        this.deviceName = name;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract void operate();
    
    // Concrete method - shared by all devices
    public void powerOn() {
        System.out.println(deviceName + " is powering on...");
    }
}

class XRayMachine extends MedicalDevice {
    public XRayMachine() {
        super("X-Ray Machine");
    }
    
    @Override
    public void operate() {
        System.out.println("Taking X-Ray images");
    }
    
    public void adjustRadiation() {
        System.out.println("Adjusting radiation levels");
    }
}

class UltrasoundMachine extends MedicalDevice {
    public UltrasoundMachine() {
        super("Ultrasound Machine");
    }
    
    @Override
    public void operate() {
        System.out.println("Performing ultrasound scan");
    }
    
    public void adjustFrequency() {
        System.out.println("Adjusting ultrasound frequency");
    }
}

class MRIMachine extends MedicalDevice {
    public MRIMachine() {
        super("MRI Machine");
    }
    
    @Override
    public void operate() {
        System.out.println("Performing MRI scan");
    }
    
    public void magneticFieldCalibration() {
        System.out.println("Calibrating magnetic field");
    }
}

// =============================================================================
// INTERFACE-BASED POLYMORPHISM
// =============================================================================

interface Treatable {
    void provideTreatment();
    default void recordTreatment() {
        System.out.println("Recording treatment in patient file");
    }
}

interface Diagnosable {
    void performDiagnosis();
    static void printProtocol() {
        System.out.println("Following standard diagnostic protocol");
    }
}

class Specialist extends Hospital implements Treatable, Diagnosable {
    private String specialization;
    
    public Specialist(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public void treat() {
        System.out.println(specialization + " specialist providing specialized treatment");
    }
    
    @Override
    public void provideTreatment() {
        System.out.println("Providing advanced " + specialization + " treatment");
    }
    
    @Override
    public void performDiagnosis() {
        System.out.println("Performing " + specialization + " diagnosis");
    }
}

// =============================================================================
// MAIN DEMONSTRATION CLASS
// =============================================================================

public class PolymorphismDetailedExplanation {
    
    public static void main(String[] args) {
        
        System.out.println("=== 1. BASIC POLYMORPHISM DEMONSTRATION ===\n");
        
        // Reference type: Hospital, Object types: Doctor, Nurse, Surgeon
        Hospital h1 = new Doctor();   // Upcasting
        Hospital h2 = new Nurse();    // Upcasting  
        Hospital h3 = new Surgeon();  // Upcasting
        
        // Dynamic method dispatch - JVM calls correct method based on object type
        h1.treat(); // Calls Doctor's treat()
        h2.treat(); // Calls Nurse's treat()
        h3.treat(); // Calls Surgeon's treat()
        
        System.out.println("\n=== 2. POLYMORPHIC VARIABLE ASSIGNMENT ===\n");
        
        // Same reference variable, different objects
        Hospital h;
        h = new Doctor(); 
        h.treat();        // Doctor's method
        
        h = new Nurse();
        h.treat();        // Nurse's method
        
        h = new Surgeon();
        h.treat();        // Surgeon's method
        
        System.out.println("\n=== 3. POLYMORPHISM WITH METHODS ===\n");
        
        HospitalManager manager = new HospitalManager();
        
        // Same method, different behaviors
        manager.conductTreatment(new Doctor());
        manager.conductTreatment(new Nurse());
        manager.conductTreatment(new Surgeon());
        
        System.out.println("=== 4. ARRAY-BASED POLYMORPHISM ===\n");
        
        // Array of Hospital references holding different object types
        Hospital[] staff = {
            new Doctor(),
            new Nurse(), 
            new Surgeon(),
            new Doctor(),
            new Nurse()
        };
        
        manager.dailyOperations(staff);
        
        System.out.println("=== 5. METHOD OVERLOADING (COMPILE-TIME POLYMORPHISM) ===\n");
        
        // Same method name, different parameters
        manager.scheduleAppointment("John Doe");
        manager.scheduleAppointment("Jane Smith", "2:00 PM");
        manager.scheduleAppointment("Bob Johnson", "3:30 PM", "Wilson");
        
        System.out.println("\n=== 6. ABSTRACT CLASS POLYMORPHISM ===\n");
        
        // Abstract class reference, concrete object implementations
        MedicalDevice[] devices = {
            new XRayMachine(),
            new UltrasoundMachine(),
            new MRIMachine()
        };
        
        for (MedicalDevice device : devices) {
            device.powerOn();    // Shared method
            device.operate();    // Polymorphic method - different implementation for each
            System.out.println();
        }
        
        System.out.println("=== 7. INTERFACE-BASED POLYMORPHISM ===\n");
        
        Specialist cardio = new Specialist("Cardiology");
        Specialist neuro = new Specialist("Neurology");
        
        // Interface references
        Treatable t1 = cardio;
        Treatable t2 = neuro;
        
        t1.provideTreatment();
        t1.recordTreatment();
        
        t2.provideTreatment();
        t2.recordTreatment();
        
        // Interface references
        Diagnosable d1 = cardio;
        Diagnosable d2 = neuro;
        
        d1.performDiagnosis();
        d2.performDiagnosis();
        
        Diagnosable.printProtocol(); // Static method call
        
        System.out.println("\n=== 8. DOWNCASTING EXAMPLE ===\n");
        
        Hospital generalRef = new Doctor();
        generalRef.treat(); // Can call Hospital methods
        
        // Downcasting to access Doctor-specific methods
        if (generalRef instanceof Doctor) {
            Doctor specificDoc = (Doctor) generalRef;
            specificDoc.prescribe(); // Now can call Doctor-specific methods
        }
        
        System.out.println("\n=== 9. POLYMORPHISM BENEFITS SUMMARY ===\n");
        
        demonstratePolymorphismBenefits();
    }
    
    // Method to demonstrate why polymorphism is beneficial
    public static void demonstratePolymorphismBenefits() {
        
        System.out.println("WHY USE POLYMORPHISM?");
        System.out.println("1. CODE FLEXIBILITY: Same method works with different object types");
        System.out.println("2. EXTENSIBILITY: Easy to add new types without changing existing code");
        System.out.println("3. MAINTAINABILITY: Changes in subclasses don't affect client code");
        System.out.println("4. ABSTRACTION: Client code works with interfaces, not implementations");
        
        // Example: Adding a new staff type doesn't break existing code
        class Pharmacist extends Hospital {
            @Override
            public void treat() {
                System.out.println("Pharmacist treats patients with medication guidance");
            }
        }
        
        // Existing polymorphic code still works
        Hospital newStaff = new Pharmacist();
        newStaff.treat(); // Works without any changes to existing methods
        
        HospitalManager manager = new HospitalManager();
        manager.conductTreatment(newStaff); // Existing method works with new type!
    }
}
```

/*
 * EXPECTED OUTPUT:
 * ===============
 * 
 * === 1. BASIC POLYMORPHISM DEMONSTRATION ===
 * 
 * Doctor treats patients with medicine
 * Nurse treats patients with care
 * Surgeon treats patients with surgery
 * 
 * === 2. POLYMORPHIC VARIABLE ASSIGNMENT ===
 * 
 * Doctor treats patients with medicine
 * Nurse treats patients with care
 * Surgeon treats patients with surgery
 * 
 * === 3. POLYMORPHISM WITH METHODS ===
 * 
 * === Treatment Session ===
 * Doctor treats patients with medicine
 * Providing emergency service
 * === Session Complete ===
 * 
 * === Treatment Session ===
 * Nurse treats patients with care
 * Providing emergency service
 * === Session Complete ===
 * 
 * === Treatment Session ===
 * Surgeon treats patients with surgery
 * Providing emergency service
 * === Session Complete ===
 * 
 * ... (and more output demonstrating all polymorphism concepts)
 * 
 * KEY TAKEAWAYS:
 * =============
 * 
 * 1. RUNTIME POLYMORPHISM: Method calls resolved at runtime based on actual object type
 * 2. COMPILE-TIME POLYMORPHISM: Method overloading resolved at compile time
 * 3. DYNAMIC DISPATCH: JVM automatically calls the correct overridden method
 * 4. FLEXIBILITY: Same code works with multiple object types
 * 5. EXTENSIBILITY: New types can be added without modifying existing code
 * 6. ABSTRACTION: Client code depends on interfaces, not implementations
 */


Why Polymorphism is Used:
1. Code Flexibility
* Same method (conductTreatment) works with Doctor, Nurse, Surgeon
* No need to write separate methods for each type
2. Extensibility
* Can add new staff types (Pharmacist) without changing existing code
* Existing polymorphic methods automatically work with new types
3. Maintainability
* Changes in subclass implementations don't affect client code
* Reduces coupling between classes
4. Runtime Decision Making
* JVM decides which method to call based on actual object type
* Enables dynamic behavior based on runtime conditions
5. Abstraction
* Client code works with Hospital interface
* Doesn't need to know specific implementation details


Key Features of Abstract Classes:
1. Abstract Class Properties:
* Cannot be instantiated (new Hospital() would fail)
* Can contain both abstract and concrete methods
* Used as reference type for polymorphism
2. Abstract Methods:
* No implementation in abstract class
* MUST be implemented by concrete subclasses
* Enforces contract for subclasses
3. Concrete Methods:
* Have implementation in abstract class
* Can be inherited as-is or overridden
* Shared behavior across subclasses
4. Benefits:
* Enforces Implementation: Guarantees subclasses implement required methods
* Code Reuse: Share common methods across subclasses
* Polymorphism: Use abstract reference for different implementations
* Design Contract: Define required methods for subclasses
 Key Abstract Class Concepts Demonstrated:
1. Abstract Class (Doctor):
* Cannot be instantiated (new Doctor() would fail)
* Has constructors (called when Surgeon object created)
* Contains both abstract and concrete methods
* Serves as template for subclasses
2. Abstract Methods:
* No implementation in abstract class
* MUST be implemented by concrete subclasses
* Includes overloaded abstract methods (treat() with different parameters)
* Enforces contracts for subclasses
3. Concrete Methods:
* Have implementation in abstract class
* Can be inherited as-is or overridden
* Provide shared functionality across subclasses
* Include overloaded concrete methods (prescribe())
4. Inheritance Requirements:
* Surgeon MUST implement ALL abstract methods
* Can optionally override concrete methods
* Can add new methods specific to subclass
* Constructor chain: Surgeon() → Doctor()
5. Method Types:
* Abstract: performPrimaryDuty(), diagnose(), treat() methods
* Concrete: checkPatientHistory(), prescribe() methods
* Final: takeMedicalOath() (cannot be overridden)
* Static: displayMedicalEthics() (class-level method)
  Explanation of the Code
1. Abstract Class (Animal):
    * Contains abstract methods (makeSound(), move()) that must be implemented by subclasses.
    * Contains concrete methods (sleep(), eat()) that are ready to use and inherited by all subclasses.
2. Concrete Subclasses (Dog and Bird):
    * Both subclasses inherit the concrete methods (sleep(), eat()) from Animal.
    * Both subclasses implement the abstract methods (makeSound(), move()).
3. Polymorphism:
    * Abstract class reference (Animal) is used to hold objects of concrete subclasses (Dog and Bird).
    * Method calls (makeSound(), move()) are resolved at runtime based on the actual object type.
Why This Code Is Beginner-Friendly
* Simple structure: One abstract class, two concrete subclasses.
* Clear method names: Easy to understand (makeSound(), move()).
* Step-by-step execution: Demonstrates inheritance, method overriding, and polymorphism.
* Visual output: Shows how abstract methods are implemented differently by each subclass.


KEY CONCEPTS DEMONSTRATED:
 * ==========================
 * 
 * 1. Abstract Class:
 *    - Cannot be instantiated directly
 *    - Provides a template for subclasses
 *    - Contains both abstract and concrete methods
 * 
 * 2. Abstract Methods:
 *    - No implementation in the abstract class
 *    - MUST be implemented by concrete subclasses
 * 
 * 3. Concrete Methods:
 *    - Have implementation in the abstract class
 *    - Can be inherited as-is by subclasses
 * 
 * 4. Polymorphism:
 *    - Abstract class reference can hold objects of concrete subclasses
 *    - Method calls resolved at runtime based on actual object type
 */

 comparable and comparator

both are interface
Comparable is used with compareTo and allows only natural ordering -> single sorting order 
Comparator is used with Compare used with multiple sorting techniques -> multiple sorting order
The Collections.sort() method is used to sort collections such as ArrayList.
This method is also based on the natural ordering of the elements or a custom comparator.



Collection vs Collections

Collections - class

Collection - interface 

➤ What is Collection?

* Collection is a root interface in the Java Collection Framework.
* It represents a group of objects (like a bag of items).
* Subinterfaces: List, Set, Queue.
  
➤ What is Collections?

* Collections is a utility class (in java.util.Collections) that provides static methods to operate on collections (like sorting, reversing, shuffling, etc.).
  
➤ Why are they used?

* Collection: For organizing and storing data (e.g., arrays with dynamic size).
* Collections: For common operations like sorting, searching, min/max, etc.
  
➤ When to use?

* Use Collection when you want to store multiple items (like ArrayList, HashSet, etc.).
* Use Collections when you want to manipulate those collections (e.g., Collections.sort(list))

