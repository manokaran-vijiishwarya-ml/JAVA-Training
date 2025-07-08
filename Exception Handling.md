
Exception handling in Java allows developers to manage runtime errors effectively by using mechanisms like
try-catch block, finally block, throwing Exceptions, Custom Exception handling, etc.  

An Exception is an unwanted or unexpected event that occurs during the execution of a program, i.e., at runtime, and disrupts the normal flow of the program.

It occurs when something unexpected happens, like accessing an invalid index, dividing by zero, or trying to open a file that does not exist.


Difference Between Exception and Error

    An Error indicates a serious problem that a reasonable application should not try to catch.
    
    Exception indicates conditions that a reasonable application might try to catch
    
    This is caused by issues with the JVM or hardware.
    
    This is caused by conditions in the program such as invalid input or logic errors.
    
    Examples: OutOfMemoryError, StackOverFlowError
    
    Examples: IOException, NullPointerException


1. Built-in Exception

Build-in Exception are pre-defined exception classes provided by Java to handle common errors during program execution.

  1.1 Checked Exceptions
  
  Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
  
  ClassNotFoundException: Throws when the program tries to load a class at runtime but the class is not found because it's belong not present in the correct location or it is missing from the project.
  
  InterruptedException: Thrown when a thread is paused and another thread interrupts it.
  
  IOException: Throws when input/output operation fails.
  
  InstantiationException: Thrown when the program tries to create an object of a class but fails because the class is abstract, an interface, or has no default constructor.
  
  SQLException: Throws when there is an error with the database.
  
  FileNotFoundException: Thrown when the program tries to open a file that does not exist.

  1.2 Unchecked Exceptions
  
  The unchecked exceptions are just opposite to the checked exceptions. 
  
  The compiler will not check these exceptions at compile time. 
  
  If a program throws an unchecked exception, and even if we did not handle or declare it, the program would not give a compilation error. 
  
  ArithmeticException: It is thrown when there is an illegal math operation.
  
  ClassCastException: It is thrown when we try to cast an object to a class it does not belong to.
  
  NullPointerException: It is thrown when we try to use a null object (e.g. accessing its methods or fields).
  
  ArrayIndexOutOfBoundsException: This occurs when we try to access an array element with an invalid index.
  
  ArrayStoreException: This happens when we store an object of the wrong type in an array.
  
  IllegalThreadStateException: It is thrown when a thread operation is not allowed in its current state.
  

Try-Catch Block:

A try-catch block in Java is a mechanism to handle exception. 

The try block contains code that might thrown an exception and the catch block is used to handle the exceptions if it occurs.

finally Block
The finally block is used to execute important code regardless of whether an exception occurs or not.

Used after try-catch block.

Used for resource cleanup.


FINAL:

final keyword applies restrictions on variable, method and classes.

Prevent modification of variables, inheritance of classes, or overriding of methods.

executed when declared.

FINALLY:

The finally block in exception handling is used with try-catch block.

Executed after try-catch block if exception occurs or not.

FINALIZE:

finalize is a method of object class.

finalize method in Java is used to perform cleanup operations before an object is garbage collected.

throw -	Used to manually throw an exception

throws -	Declares that a method might throw an exception


```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method using throws
    static void riskyMethod() throws CustomException {
        int age = 15;
        if (age < 18) {
            throw new CustomException("Underage - Custom Exception thrown");
        }
    }

    public static void main(String[] args) {
        final int divider = 0; // final variable (cannot be changed)

        ExceptionDemo obj = new ExceptionDemo();

        try {
            // Using riskyMethod which throws CustomException
            riskyMethod();
        } 
        catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());

        }
        try{

            int result = 10 / divider; 

        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        }  finally {
            System.out.println("finally block executed (always runs)");
        }
    }
}



```

Output:

Caught CustomException: Underage - Custom Exception thrown

Caught ArithmeticException: / by zero

finally block executed (always runs)


throws -> delegate exception handling to caller and declare method might throw exeption so caller should handle it

throw -> to manually write an exception

throws without throw -> valid

throw without throws -> invalid

final -> to make variable or constant immutable

finally -> always execute after try catch block


Checked exception only try catch

Unchecked optional both trycatch and throws is used to handle it
