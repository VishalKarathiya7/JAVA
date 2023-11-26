package prototype;

public class Book {
    private String bookName;
    private int bookId;

    public Book(String name, int id){
        this.bookId = id;
        this.bookName = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
