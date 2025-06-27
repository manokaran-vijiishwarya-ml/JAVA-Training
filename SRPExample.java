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
class SalaryCalc {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 2;
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Viji", 20000);
        SalaryCalc cal = new SalaryCalc();
        System.out.println("Salary: " + cal.calculateSalary(emp));

    }
}
