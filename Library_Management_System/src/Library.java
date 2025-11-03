import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> bookList;
    private List<Member> memberList;

    private int nextMemberId = 1001;

    public Library() {
        this.bookList = new ArrayList<>();
        this.memberList = new ArrayList<>();
    }

    private Book findBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private Member findMember(String id) {
        for (Member member : memberList) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public void add_book(String title, String author) {
        if (findBook(title) != null) {
            System.out.println("Error: Book '" + title + "' already exists.");
            return;
        }
        Book newBook = new Book(title, author);
        bookList.add(newBook);
        System.out.println("Book Added: " + newBook.toString());
    }

    public String register_member(String name) {
        String newId = String.valueOf(nextMemberId++);
        Member newMember = new Member(name, newId);
        memberList.add(newMember);
        System.out.println("Member Registered: " + newMember.getName() + ", Assigned ID: " + newId);
        return newId;
    }

    public void borrow_book(String memberId, String bookTitle) {
        Member member = findMember(memberId);
        Book book = findBook(bookTitle);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Book is unavailable right now.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("Book borrowed!!");
    }

    public void return_book(String memberId, String bookTitle) {
        Member member = findMember(memberId);
        Book book = findBook(bookTitle);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            member.returnBook(book);
            System.out.println("Book returned !!");
        }
    }

    public void displayStatus() {
        System.out.println("\n------------------- My Library :)");
        System.out.println("\nMembers:");
        memberList.forEach(System.out::println);
        System.out.println("\nBooks:");
        bookList.forEach(System.out::println);
        System.out.println("-------------------\n");
    }
}
