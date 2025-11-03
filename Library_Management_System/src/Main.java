public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.displayStatus();

        library.add_book("Sweet Potatoes", "Dania");
        library.add_book("ABC", "Somebody");
        library.add_book("Something", "Anonymous");

        String member1 = library.register_member("Ramadan");
        String member2 = library.register_member("Anisa");

        library.borrow_book(member1, "Sweet Potatoes");
        library.borrow_book(member1, "Something");
        library.borrow_book(member2, "ABC");

        library.return_book(member1, "Sweet Potatoes");

        library.displayStatus();
    }
}