// Topic 2: equals() vs ==

class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Overriding equals() for content comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // same reference
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product p = (Product) obj;
        return productId == p.productId;
    }
}

public class Topic2_ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop");
        Product p2 = new Product(201, "Laptop");
        Product p3 = p1; // same reference

        System.out.println("p1 == p2 : " + (p1 == p2));          // false (different references)
        System.out.println("p1 == p3 : " + (p1 == p3));          // true  (same reference)
        System.out.println("p1.equals(p2) : " + p1.equals(p2));  // true  (same productId)
        System.out.println("p1.equals(p3) : " + p1.equals(p3));  // true
    }
}
