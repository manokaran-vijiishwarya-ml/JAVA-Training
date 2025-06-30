```java
  
interface Shape {
    String getColor();  
    void setColor(String color);  
    String display(); 
}

class Circle implements Shape {
    private String color;  
    private double radius;

    public Circle(String color, double radius) {
        System.out.println("Circle constructor called");
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String display() {
        return "Circle color is " + getColor() + " and area is: " + area();
    }
}

class Rectangle implements Shape {
    private String color;  
    private double length;
    private double breadth;

    public Rectangle(String color, double length, double breadth) {
        System.out.println("Rectangle constructor called");
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public String display() {
        return "Rectangle color is " + getColor() + " and area is: " + area();
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Circle s1 = new Circle("Red", 2);  
        Shape s2 = new Rectangle("Yellow", 2, 4);  
        System.out.println(s1.display());
        System.out.println(s2.display()); 
        ((Circle) s1).setRadius(3);
        ((Rectangle) s2).setLength(3);
        ((Rectangle) s2).setBreadth(5);
        System.out.println("\nAfter modifying properties:");
        System.out.println(s1.display());  
        System.out.println(s2.display()); 
    }
}
```
