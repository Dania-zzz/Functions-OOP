import java.util.ArrayList;
import java.util.List;

class Member {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return String.format("Member ID: %s, Name: %s, Books Borrowed: %d", id, name, borrowedBooks.size());
    }
}