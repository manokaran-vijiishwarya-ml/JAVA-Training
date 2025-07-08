```java
import java.io.*;
public class Arithmetic {
    // public static void main(String[]args) throws ArithmeticException{
    //     int a=0;
    //     int b=5;
    //     int c =b/a;
    //     System.out.println(c);
    // }
    // public static void main(String[]args){
    //     String s=null;
    //     try{
    //        if(s.equals("viji")){
    //         System.out.println("Equal");
    //        }
    //        else{
    //         System.out.println("Not equal");
    //        }
    //     }
    //     catch(NullPointerException e){
    //         System.out.println(e);
    //     }
    // }
    public static void main(String[]args){
        try{
            Class <?> ob= Class.forName("Checked");
            System.out.println(ob.getName());
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
       
    }
}
```


checked exception are handled at compile time -> file not found exception and class not found exception. handleable by using only try catch block.

unchecked exception are handled at run time -> Arithmetic ,null pointer exception. handled by using both try catch and throws.

throw works only with throws (throw without throws is invalid)

throws without throw is valid

