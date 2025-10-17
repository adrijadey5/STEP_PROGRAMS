// LAB PROBLEM 3: hashCode() and equals() Contract
import java.util.*;

class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() to compare Students by id
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;
        return id == s.id;  // Students are equal if IDs are same
    }

    // Overriding hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(102, "Riya");
        Student s3 = new Student(101, "Amit Duplicate");

        // Adding students to HashSet
        students.add(s1);
        students.add(s2);
        students.add(s3); // Duplicate based on id

        // Printing HashSet
        System.out.println("HashSet Elements:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Checking equality explicitly
        System.out.println("\ns1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s3.hashCode(): " + s3.hashCode());
    }
}
