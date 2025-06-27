abstract class Animal {
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    
    public void eat() {
        System.out.println("Animal is eating food");
    }

    public abstract void makeSound();
    
    public abstract void move();
}

class Dog extends Animal {
   
    @Override
    public void makeSound() {
        System.out.println("Dog says: bow! bow!");
    }
    
    @Override
    public void move() {
        System.out.println("Dog runs");
    }
   
}

class Bird extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp! Chirp!");
    }
    
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
    
   
}

public class AnimalDemo {
    public static void main(String[] args) {
        
        Animal pet1 = new Dog();
        Animal pet2 = new Bird();
        
        System.out.println("Dog:");
        pet1.makeSound();
        pet1.move();

        System.out.println("\nBird:");
        pet2.makeSound();
        pet2.move();       

    }
}
