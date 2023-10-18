import java.util.ArrayList;

public class Book {

    private String bookName;
    private int page;
    private String author;
    private String genre;
    private boolean isBorrowed;
    private int bookNumber = 0;


    public Book(){ }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
