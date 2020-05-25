package snow.springframework.spring5book.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import snow.springframework.spring5book.domain.Author;
import snow.springframework.spring5book.domain.Book;
import snow.springframework.spring5book.repositories.AuthorRepository;
import snow.springframework.spring5book.repositories.BookRepository;

@Component
public class  BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author john = new Author("John", "Smith");
        Book java = new Book("Java", "12345");
        john.getBooks().add(java);
        java.getAuthors().add(john);

        authorRepository.save(john);
        bookRepository.save(java);

        Author david = new Author("David", "Johnson");
        Book docker = new Book("Docker", "67890");
        david.getBooks().add(docker);
        docker.getAuthors().add(david);

        authorRepository.save(david);
        bookRepository.save(docker);

        System.out.println("Number of books: " + bookRepository.count());


    }
}
