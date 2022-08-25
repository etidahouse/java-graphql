package data;

public class Book {

    private String title;
    private Author author;

    public Book() {

    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
	
    public void setAuthor(Author author) {
        this.author = author;
    }

}
