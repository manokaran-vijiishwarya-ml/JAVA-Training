abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: bow bow!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}

public class Oops{
    public static void main(String[] args) {

        Animal myDog = new Dog("Scooby");
        Animal myCat = new Cat("Kitten");
        myDog.makeSound();
        myDog.sleep();       

        myCat.makeSound();   
        myCat.sleep();     
    }
}
