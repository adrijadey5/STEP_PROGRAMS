// Topic 5: Member and Static Inner Classes

class University {
    String universityName = "Tech University";

    // Non-static inner class (Member Inner Class)
    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDetails() {
            // Access outer class field directly
            System.out.println("University: " + universityName);
            System.out.println("Department: " + deptName);
        }
    }

    // Static nested class
    static class ExamCell {
        static void conductExam() {
            System.out.println("ExamCell: Conducting university exams.");
        }

        void publishResults() {
            System.out.println("ExamCell: Publishing exam results.");
        }
    }
}

public class Topic5_UniversityDemo {
    public static void main(String[] args) {
        // Creating object of outer class
        University uni = new University();

        // Creating object of member inner class using Outer.Inner syntax
        University.Department dept = uni.new Department("Computer Science");
        dept.showDetails();

        System.out.println();

        // Accessing static nested class
        University.ExamCell.conductExam();  // Accessing static method directly

        // Accessing non-static method of static nested class
        University.ExamCell examCell = new University.ExamCell();
        examCell.publishResults();
    }
}
