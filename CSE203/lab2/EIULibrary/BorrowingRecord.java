package CSE203.lab2.EIULibrary;

import java.time.LocalDate;

public class BorrowingRecord {
    private User user;
    private Book book;
    private LocalDate borrowingDate;
    private LocalDate dueDate;

    public BorrowingRecord(User user, Book book, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOverDue() {
        return borrowingDate.isAfter(dueDate);
    }

    public boolean equals(BorrowingRecord borrowingRecord) {
        if (borrowingRecord == null) return false;
        return (this.user.equals(borrowingRecord.user) && this.book.equals(borrowingRecord.book) && this.borrowingDate.equals(borrowingRecord.borrowingDate) && this.dueDate.equals(borrowingRecord.dueDate)); 
    }
}
