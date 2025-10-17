public class HospitalManagement {

    // Outer class
    static class Hospital {
        private String name;

        // Constructor
        public Hospital(String name) {
            this.name = name;
        }

        // Member Inner Class (non-static)
        public class Department {
            private String deptName;

            public Department(String deptName) {
                this.deptName = deptName;
            }

            // Display department info along with hospital name
            public void showInfo() {
                System.out.println("Hospital: " + name + ", Department: " + deptName);
            }
        }

        // Method to create Department object
        public Department createDepartment(String deptName) {
            return new Department(deptName);
        }
    }

    // main() method
    public static void main(String[] args) {
        // Create Hospital
        Hospital h1 = new Hospital("CityCare Hospital");

        // Create 2 Departments
        Hospital.Department d1 = h1.createDepartment("Cardiology");
        Hospital.Department d2 = h1.createDepartment("Neurology");

        // Display info
        d1.showInfo();
        d2.showInfo();
    }
}
