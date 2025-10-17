// LAB PROBLEM 4: Cloning an Object
class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow clone: copies only references
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone: creates new Address object
    protected Person deepClone() {
        return new Person(this.name, new Address(address.city, address.state));
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Kolkata", "West Bengal");
        Person original = new Person("Adrija", addr);

        // Shallow copy
        Person shallowCopy = (Person) original.clone();

        // Deep copy
        Person deepCopy = original.deepClone();

        System.out.println("Original:     " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy:    " + deepCopy);

        // Modify original address
        original.address.city = "Delhi";

        System.out.println("\nAfter modifying original address:");
        System.out.println("Original:     " + original);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy:    " + deepCopy);
    }
}
