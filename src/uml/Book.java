package uml;

public class Book {
    private String isbn;
    private String title;
    private short year;
    private boolean isAvailable;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
        this.year = 1975;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public short getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void borrowBook(){
        if(!isAvailable){
            System.out.println("Book not available");
            return;
        }
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;

    }
}


