import java.util.*;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = input.nextInt();
        System.out.print("Enter breadth: ");
        int bre = input.nextInt();
        int area = len * bre;
        System.out.println("Area of Rectangle: " + area);
    }
}

