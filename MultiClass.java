import java.util.Scanner;

public class MultiClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("value of n: ");
        int n = scanner.nextInt();

        System.out.println("First " + n + " even numbers:");
        int count = 1;
        int num = 2;
        // while (count <= n) {
        //     System.out.println(num + " ");
        //     num += 2;
        //     count++;
        // }
        do{
            System.out.println(num + " ");
            num +=2;
            count++;
        }while(count<=n);
              
    }
}
class odd{
   static class Sum{
        static int sum=0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("value of n: ");
        int n = scanner.nextInt();

        System.out.println("First " + n + " odd numbers:");
        int count = 1;
        int num = 1;
        do{
            System.out.println(num + " ");
            num +=2;
            count++;
        }while(count<=n);
        System.err.println("Check");
    }
}
