class UG{
     UG() {
        System.out.println("UG constructor called");
    }
}
 
class PG extends UG{
    PG() {
        System.out.println("PG constructor called");
    }
}

class SuperPg extends PG{
    SuperPg() {
        System.out.println("SuperPg constructor called");
    }
}

class Oncologist extends SuperPg{
    Oncologist() {
        System.out.println("Oncologist constructor called");
    }
}

public class OrderOfConstructor {
    public static void main(String[] args){
       Oncologist dr = new Oncologist();
    } 
}
