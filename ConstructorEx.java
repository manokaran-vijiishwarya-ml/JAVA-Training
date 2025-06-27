public class ConstructorEx {
    String name;
    int age;
    String state;
    ConstructorEx(String name, int age){
       this.name=name;
       this.age=age;
       System.out.println("Name : " +name+" Age :"+age);
    }
    ConstructorEx(String state){
        this.state=state;
        System.out.println("State: "+state);
    }
    ConstructorEx(ConstructorEx obj2){
        System.out.println("Copy constructor");
        this.state=obj2.state;
        // System.out.println("State: "+state);
    }
    public static void main(String[] args){
        ConstructorEx obj =new ConstructorEx("Viji",23);
        ConstructorEx obj2 = new ConstructorEx("Tamilnadu");
        ConstructorEx obj3 = new ConstructorEx(obj2);
        System.out.println("State is "+obj3.state);
    }
}
