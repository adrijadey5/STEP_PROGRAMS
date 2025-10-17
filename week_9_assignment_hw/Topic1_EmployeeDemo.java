// Topic 1: Using toString() and getClass()

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Overriding toString() for readable output
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Topic1_EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Adrija", 50000);
        Employee e2 = new Employee(102, "Rohan", 60000);
        Employee e3 = new Employee(103, "Priya", 55000);

        System.out.println(e1);
        System.out.println("Class Name: " + e1.getClass().getName());

        System.out.println(e2);
        System.out.println("Class Name: " + e2.getClass().getName());

        System.out.println(e3);
        System.out.println("Class Name: " + e3.getClass().getName());
    }
}
