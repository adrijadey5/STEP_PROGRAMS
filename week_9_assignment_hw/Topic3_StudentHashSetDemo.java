// Topic 3: hashCode() and equals() Contract
import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + "]";
    }
}

public class Topic3_StudentHashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(2, "Riya");
        Student s3 = new Student(1, "DuplicateAmit");

        set.add(s1);
        set.add(s2);
        set.add(s3); // Duplicate by rollNo

        System.out.println("HashSet Contents:");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
