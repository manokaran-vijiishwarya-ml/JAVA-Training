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

interface MonthSalary {
    double calculateMonthlySalary(Employee employee);
}

interface  HourSalary{
    double calculateHourlySalary(Employee employee, int hoursWorked);
}

class FullTimeEmployee implements MonthSalary {
    public double calculateMonthlySalary(Employee employee) {
        return employee.getSalary() * 2;
    }
}

class PartTimeEmployee implements  HourSalary{
    public double calculateHourlySalary(Employee employee, int hoursWorked) {
        return hoursWorked * 100;
    }
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        Employee emp = new Employee("Viji", 20000);
        
        MonthSalary fullTime = new FullTimeEmployee();
        System.out.println("Full-time Salary: " + fullTime.calculateMonthlySalary(emp));

        HourSalary partTime = new PartTimeEmployee();
        System.out.println("Part-time Salary for 50 hours: " + partTime.calculateHourlySalary(emp, 50));
    }
}