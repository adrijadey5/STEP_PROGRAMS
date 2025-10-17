import java.util.HashSet;

class Employee {
    private String empCode;
    private String name;

    public Employee(String empCode, String name) {
        this.empCode = empCode;
        this.name = name;
    }

    // Override equals() - same empCode means same employee
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // same reference
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return this.empCode.equals(other.empCode); // compare by empCode only
    }

    // Override hashCode() based on empCode
    @Override
    public int hashCode() {
        return empCode.hashCode();
    }

    // toString() to display details
    @Override
    public String toString() {
        return "Employee Code: " + empCode + ", Name: " + name;
    }
}

public class EmployeeAuth {
    public static void main(String[] args) {
        // 1. Create two employees
        Employee e1 = new Employee("BL001", "Ritika");
        Employee e2 = new Employee("BL001", "Ritika S.");

        // 2. Compare using == (reference comparison)
        System.out.println("e1 == e2 → " + (e1 == e2));

        // 3. Compare using equals() (logical comparison)
        System.out.println("e1.equals(e2) → " + e1.equals(e2));

        // 4. Test using HashSet
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        // Print all employees in the set
        System.out.println("Employees in HashSet: " + set);
    }
}
