package data;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookRepository {

    private static final List<Book> books = Stream.of(
            new Book("Title 1", new Author("Pero", "Peric")),
            new Book("Title 2", new Author("Marko", "Maric")),
            new Book("Title 0", new Author("Ernesto", "Garcia"))
        ).collect(Collectors.toList());

    public List<Book> getAllBooks() {
        return Collections.unmodifiableList(books);
    }
    
    public Book getBook(String title) {
    	return books.stream().filter(book -> book.getTitle().equals(title)).findAny().orElse(null);
    }
    
    public void createBook(Book book) {
    	books.add(book);
    }
    
    public List<Book> searchByTitle(String title) {
    	return books.stream().filter(
    			book -> book.getTitle().contains(title))
    		    .sorted(Comparator.comparing(Book::getTitle))
    			.collect(Collectors.toList());
    }

}
