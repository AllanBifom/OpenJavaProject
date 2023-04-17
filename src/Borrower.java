// Borrower.java
import java.util.ArrayList;
public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " published:" + book.getYear());
        }
    }
}
