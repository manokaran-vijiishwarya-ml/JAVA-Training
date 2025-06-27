abstract class Animal {
    public String name;

    public Animal(String name) { 
      this.name = name; 
    }

    public abstract void makeSound();

    public String getName() { 
      return name; 
    }
}

class Dog extends Animal {
    public Dog(String name) { 
      super(name); 
    }

    public void makeSound()
    {
        System.out.println(getName() + " barks");
    }
}

class Cat extends Animal {
    public Cat(String name) { 
      super(name); 
    }

    public void makeSound()
    {
        System.out.println(getName() + " meow");
    }
}

public class AbstractionEx {
    public static void main(String[] args)
    {
        Animal myDog = new Dog("Scooby");
        Animal myCat = new Cat("Kitty");

        myDog.makeSound();
        myCat.makeSound();
    }
}