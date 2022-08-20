
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import data.Book;
import data.BookRepository;

public class GraphQLQuery implements GraphQLQueryResolver {

    private final BookRepository repository;

    public GraphQLQuery(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> allBooks() {
        return repository.getAllBooks();
    }
    
    public Book getBook(String title) {
    	return repository.getBook(title);
    }
    
}

