import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import data.Author;
import data.Book;
import data.BookRepository;

public class GraphQLMutation implements GraphQLMutationResolver {
	
	private final BookRepository repository;

    public GraphQLMutation(BookRepository repository) {
        this.repository = repository;
    }

    public Book createBook(String title, String name, String surname) {
    	Book book = new Book();
    	book.setTitle(title);
    	Author author = new Author();
    	author.setName(name);
    	author.setSurname(surname);
    	book.setAuthor(author);
    	repository.createBook(book);
    	return book;
    }

}


