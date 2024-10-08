//Example of composition in java.
/*
 n the above example, a library can have no. 
 of books on the same or different subjects. 
 So, If Library gets destroyed then All books within that particular 
 library will be destroyed. i.e. books can not exist without libraries.
  That’s why it is composition.  Book is Part-of Library.
 */
//Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  
//When there is a composition between two entities, the composed object cannot exist without the other entity.
import java.util.*;

class Book {
    public String book_name;
    public String book_author; // Corrected variable name

    // Constructor for setting all values.
    Book(String book_name, String book_author) { // Corrected parameter name
        this.book_name = book_name;
        this.book_author = book_author;
    }
}

class Library {
    // Reference to refer to list of books
    String Library_name;
    private final List<Book> books;

    // Library class contains a list of books
    Library(List<Book> books, String Library_name) {

        // Referring to the same book as
        // this keyword refers to the same instance itself
        this.books = books;
        this.Library_name = Library_name;
    }

    String getLibarayName() {
        return Library_name;
    }

    // Method
    // To get the total number of books in the library
    public List<Book> getTotalBooksInLibrary() {

        return books;
    }
}

public class program27 {
    public static void main(String[] args) {
        // Creating an object for every book entity
        Book b1 = new Book("Java Programming", "E.Balagoswami");
        Book b2 = new Book("c Programming", "R. Agarwal"); // Corrected author name
        Book b3 = new Book("Software Engineering", "Rajib Mall"); // Corrected author name
        Book b4 = new Book("Python Programming", "A.g Barma"); // Corrected author name

        // Creating an ArrayList for the book store.
        List<Book> bk = new ArrayList<>();
        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);

        // Create a Library object and add all the books.
        Library l1 = new Library(bk, "Netaji Book Store");
        System.out.println("Name Of Library: " + l1.getLibarayName());
        List<Book> bks = l1.getTotalBooksInLibrary();
        for (Book book : bks) {
            // Printing the title and author name of the book on the console
            System.out.println("Title: " + book.book_name + " and Author: " + book.book_author);
        }
    }
}
