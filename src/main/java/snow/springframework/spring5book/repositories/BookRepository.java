package snow.springframework.spring5book.repositories;

import org.springframework.data.repository.CrudRepository;
import snow.springframework.spring5book.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
