// LAB PROBLEM 1: Comparing Objects Using equals() and ==

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Overriding equals() to compare by content
    @Override
    public boolean equals(Object obj) {
        // Check if both references point to the same object
        if (this == obj)
            return true;
        // Check if the object is null or not an instance of Book
        if (obj == null || getClass() != obj.getClass())
            return false;
        // Typecast and compare fields
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }
}

public class CompareBooks {
    public static void main(String[] args) {
        // Creating two different objects with same content
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        Book book3 = book1; // Both refer to same object

        // Comparing with ==
        System.out.println("book1 == book2 : " + (book1 == book2)); // false (different references)
        System.out.println("book1 == book3 : " + (book1 == book3)); // true (same reference)

        // Comparing with equals()
        System.out.println("book1.equals(book2) : " + book1.equals(book2)); // true (same content)
        System.out.println("book1.equals(book3) : " + book1.equals(book3)); // true (same reference)
    }
}
