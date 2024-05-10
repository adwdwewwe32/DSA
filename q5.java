class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int Eid;
    private double salary;

    public Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    public void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: $" + salary);
    }
}

public class q5 {
    public static void main(String[] args) {
        // Example usage
        Employee emp = new Employee("Ankit raj", 19, 101, 5000.0);
        emp.empDisplay();
    }
}

