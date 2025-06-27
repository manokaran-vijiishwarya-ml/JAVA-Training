public class Example {
    int i=2;
    void display(int i){
        System.out.println(i);
        i=5;
        System.out.println("After:" +i);   
     }
     void display(Example obj){
        System.out.println(obj.i);
        obj.i=5;
        System.out.println("After:" +obj.i);
     }
    public static void main(String[] args){
        int i =1;
        
        Example obj = new Example();
        Integer a = i;
        // System.out.println(sizeof(i));
        System.out.println(i); //1
        System.out.println(obj);
        System.out.println(obj.i); //5 //2
        obj.display(i);
        //1 
        //5
        System.out.println("After method call: " + i); //2 //1
        obj.display(obj);
        //2
        //5
        System.out.println("After method call: " + obj.i); //5
    }
    
}
