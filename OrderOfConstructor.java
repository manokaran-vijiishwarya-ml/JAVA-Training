
class UG {
    UG() {
        System.out.println("UG default constructor called");
    }

    UG(String s) {
        System.out.println("UG parameterized constructor  with " + s);
    }
}

class PG extends UG {
    PG() {
        System.out.println("PG default constructor called");
    }

    PG(String s) {
        // super(s);  
        System.out.println("PG parameterized constructor with " + s);
    }
}

class SuperPg extends PG {
    SuperPg() {
        System.out.println("SuperPg default constructor called");
    }

    SuperPg(String s) {
        super(s); 
        System.out.println("SuperPg parameterized constructor  with " + s);
    }
}

class Oncologist extends SuperPg {
    Oncologist(String name) {
        super(name);  
        System.out.println("Oncologist constructor  with " + name);
    }
}

public class OrderOfConstructor {
    public static void main(String[] args) {
        Oncologist dr = new Oncologist("Viji");
       
    }
}


OUTPUT:

UG default constructor called
     
PG parameterized constructor with Viji
     
SuperPg parameterized constructor  with Viji
     
Oncologist constructor  with Viji
