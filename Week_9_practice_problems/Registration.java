// Demonstrating clone(), shallow copy, and deep copy

class ContactInfo implements Cloneable {
    String email;
    String phone;

    public ContactInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // simple field copy (Strings are immutable)
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Phone: " + phone;
    }
}

class Student implements Cloneable {
    String id;
    String name;
    ContactInfo contact;

    public Student(String id, String name, ContactInfo contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Shallow copy → copies object but shares same ContactInfo reference
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // contact reference is shared
    }

    // Deep copy → clone everything, including nested object
    protected Student deepClone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.contact = (ContactInfo) contact.clone(); // clone inner object
        return copy;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", " + contact;
    }
}

public class Registration {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. Register a student
        ContactInfo c1 = new ContactInfo("ritika@example.com", "9876543210");
        Student s1 = new Student("ST101", "Ritika", c1);

        // 2. Shallow clone
        Student shallowCopy = (Student) s1.clone();

        // 3. Deep clone
        Student deepCopy = s1.deepClone();

        // 4. Modify original student's contact
        s1.contact.email = "updated@example.com";

        // 5. Observe the changes
        System.out.println("Original:     " + s1);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy:    " + deepCopy);
    }
}
