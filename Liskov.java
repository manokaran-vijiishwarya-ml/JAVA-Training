class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

interface SalaryCal {
    double calculateSalary(Employee employee);
}

class RegularSalary implements SalaryCal {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 2;
    }
}

class BonusSalary implements SalaryCal {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 2 + 5000;
    }
}

public class Liskov {
    public static void main(String[] args) {
        Employee emp = new Employee("Viji", 20000);
        SalaryCal calculator = new RegularSalary();
        System.out.println("Salary: " + calculator.calculateSalary(emp));   
        calculator = new BonusSalary();
        System.out.println("Bonus Salary: " + calculator.calculateSalary(emp));
    }
}