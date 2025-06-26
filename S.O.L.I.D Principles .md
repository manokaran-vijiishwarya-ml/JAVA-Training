S - SINGLE RESPONSIBLITY PRINCIPLE => A class should have one and only one reason to change.

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


O - OPEN / CLOSE PRINCIPLE => Software entities should be open for extension, but closed for modification. (i.e) Add new function should not modify the existing code.

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

public class OCExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Viji", 20000);
        SalaryCal calculator = new RegularSalary();
        System.out.println("Salary: " + calculator.calculateSalary(emp));
        
        SalaryCal bonus = new BonusSalary();
        System.out.println("Bonus Salary: " + bonus.calculateSalary(emp));
    }
}

L - LISKOV SUBSTITUITION PRINCIPLE => Parent class feature inherits in child class should not change the parent class behaviour.

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

I - INTERFACE SEGREGATION PRINCIPLE => Should not be forced to depend on methods they do not use.

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

D - DEPENDENCY INJECTION => High-level modules should not depend on low-level modules. Both should depend on abstractions.

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


