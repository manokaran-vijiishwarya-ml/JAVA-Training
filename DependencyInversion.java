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

class BonusSalary implements SalaryCal {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 2 + 5000;
    }
}

class SalaryService {
    private final SalaryCal calculator;
    
    public SalaryService(SalaryCal calculator) {
        this.calculator = calculator;
    }
    
    public double getSalary(Employee emp) {
        return calculator.calculateSalary(emp);
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        Employee emp = new Employee("Viji", 20000);
        SalaryCal calculator = new BonusSalary(); 
        SalaryService service = new SalaryService(calculator); 
        System.out.println("Final Salary: " + service.getSalary(emp));
    }
}
