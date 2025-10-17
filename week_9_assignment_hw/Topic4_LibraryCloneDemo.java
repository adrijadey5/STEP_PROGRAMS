// Topic 4: Deep vs Shallow Cloning of Objects
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "(" + title + ", " + author + ")";
    }
}

class Library implements Cloneable {
    List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    // Shallow clone - copies only reference to book list
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone - manually copies all book objects
    protected Library deepClone() {
        List<Book> copiedList = new ArrayList<>();
        for (Book b : books) {
            copiedList.add(new Book(b.title, b.author));
        }
        return new Library(copiedList);
    }

    @Override
    public String toString() {
        return books.toString();
    }
}

public class Topic4_LibraryCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Java", "James Gosling"));
        list.add(new Book("C++", "Bjarne Stroustrup"));

        Library original = new Library(list);
        Library shallowCopy = (Library) original.clone();
        Library deepCopy = original.deepClone();

        System.out.println("Original Library: " + original);
        System.out.println("Shallow Copy:     " + shallowCopy);
        System.out.println("Deep Copy:        " + deepCopy);

        // Modify one book in the cloned list
        shallowCopy.books.get(0).title = "Python";

        System.out.println("\nAfter modifying shallow copy:");
        System.out.println("Original Library: " + original);
        System.out.println("Shallow Copy:     " + shallowCopy);
        System.out.println("Deep Copy:        " + deepCopy);
    }
}
