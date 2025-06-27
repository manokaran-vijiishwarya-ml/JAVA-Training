CONSTRUCTOR AND TYPES

A class can have multiple constructors with the same name but with different parameter lists.

Parameters can differ by:

Number of parameters

Type of parameters

Order of parameters

```java
class Doctor{
    Doctor(){
        System.out.println("Default constructor called");
    }
    Doctor(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
    Doctor(String name){
        System.out.println("Name: " + name);
    }
    Doctor(int age, String name){
        System.out.println("Orderwise");
        System.out.println("Age: " + age + ", Name: " + name);
    }
    Doctor (Doctor d7){
        System.out.println("Copy constructor called");
        this.name = d7.name;
        this.age = d7.age;      
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args){
        Doctor dr = new Doctor(); // calls default constructor
        Doctor d = new Doctor("Viji", 22); // calls constructor with 2 parameters
        Doctor d2 = new Doctor("ishwarya"); // calls constructor with 1 parameter
        Doctor d3 = new Doctor(23,"Vijii"); //calls constructor having 1st parameter age and 2nd one is string
        Doctor d4 = new Doctor(d); //copy constructor
    }
}

```
Output:

Default constructor called

Name: Viji, Age: 22

Name: ishwarya

Orderwise

Age:23, Name: Vijii

Copy Constructor Called

Name: Viji, Age: 22
