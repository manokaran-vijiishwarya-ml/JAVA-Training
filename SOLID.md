```java
// S — Single Responsibility Principle
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class SalaryCalculator {
    public double calculateAnnualSalary(Employee emp) {
        return emp.getSalary() * 12;
    }
}

// O — Open/Closed Principle
interface BonusCalculator {
    double calculateBonus(Employee emp);
}

class RegularBonusCalculator implements BonusCalculator {
    public double calculateBonus(Employee emp) {
        return emp.getSalary() * 0.10;
    }
}

class SpecialBonusCalculator implements BonusCalculator {
    public double calculateBonus(Employee emp) {
        return emp.getSalary() * 0.20;
    }
}

// L — Liskov Substitution Principle
abstract class BaseEmployee {
    public abstract double getSalary();
}

class FullTimeEmployee extends BaseEmployee {
    public double getSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends BaseEmployee {
    public double getSalary() {
        return 15000;
    }
}

// I — Interface Segregation Principle
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Developer implements Workable, Eatable {
    public void work() {
        System.out.println("Developer is coding.");
    }

    public void eat() {
        System.out.println("Developer is eating.");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is assembling parts.");
    }
}

// D — Dependency Inversion Principle
interface NotificationService {
    void sendNotification(String message);
}

class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class HR {
    private NotificationService notificationService;

    public HR(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyEmployee(String message) {
        notificationService.sendNotification(message);
    }
}

public class SolidPrinciplesDemo {
    public static void main(String[] args) {
        // SRP
        Employee emp = new Employee("Viji", 5000);
        SalaryCalculator Calc = new SalaryCalculator();
        System.out.println("Annual Salary: " + Calc.calculateAnnualSalary(emp));

        // OCP
        BonusCalculator bonus = new SpecialBonusCalculator(); 
        System.out.println("Bonus: " + bonus.calculateBonus(emp));

        // LSP
        BaseEmployee emp1 = new FullTimeEmployee();
        BaseEmployee emp2 = new PartTimeEmployee();
        System.out.println("Full-time salary: " + emp1.getSalary());
        System.out.println("Part-time salary: " + emp2.getSalary());

        // ISP
        Developer dev = new Developer();
        dev.work();
        dev.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();

        // DIP
        NotificationService emailService = new EmailService();
        HR hr = new HR(emailService);
        hr.notifyEmployee("Welcome to the company!");
    }
}

```
STACK:

main() method → stack frame for local variables:

emp, Calc, bonus, emp1, emp2, dev, robot, emailService, hr

Method calls like Calc.calculateAnnualSalary(emp) 

Temporary local variables and references passed as parameters exist in the stack frame of those methods


HEAP:

Employee object on Heap: Fields: name = "Viji", salary = 5000

HR object on Heap: Field: reference to EmailService object

Developer object:  No explicit fields, but work() and eat() methods can be called from the object

