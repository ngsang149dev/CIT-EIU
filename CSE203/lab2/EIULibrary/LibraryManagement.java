

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<User> users = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<BorrowingRecord> borrowingRecords = new ArrayList<>();

    public LibraryManagement() {

    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBorrowingRecord(BorrowingRecord borrowingRecord) {
        borrowingRecords.add(borrowingRecord);
    }

    public List<Book> getBorrowingBooks(User user) {
        return borrowingRecords.stream().filter(record -> record.getUser().equals(user)).map(BorrowingRecord::getBook).toList();
    }

    private boolean isValidUser(User user) {
        return users.contains(user);
    }

    private boolean isUserEligibleToBorrow(User user) {
        return borrowingRecords.stream().filter(record -> record.getUser().equals(user) && record.isOverDue()).count() < 1;
    }

    public void showAllUsers() {
        this.users.stream().forEach(System.out::println);
    }

    public void showAllBooks() {
        this.books.stream().forEach(System.out::println);
    }

    public void showAllBorrowingRecords() {
        this.borrowingRecords.stream().forEach(System.out::println);
    }
}