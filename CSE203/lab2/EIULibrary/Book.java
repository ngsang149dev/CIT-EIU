
public class Book {
    private String isbn;
    private String title;
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }    
    
    public boolean equals(Book book) {
        if (book == null) return false;
        return (this.isbn.equals(book.isbn) && this.title.equals(book.title));
    }
}
