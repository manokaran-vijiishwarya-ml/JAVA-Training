class Doctor{
    public String name;
    public int age;
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
        Doctor dr = new Doctor();
        Doctor d = new Doctor("Viji", 22);
        Doctor d2 = new Doctor("ishwarya");
        Doctor d3 = new Doctor(23,"Vijii");
        Doctor d4 = new Doctor(d);
    }
}
