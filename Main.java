public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); 
        myDog.name = "Buddy";
        myDog.bark(); 

        Dog yourDog = new Dog();
        yourDog.name = "Scooby";
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

 