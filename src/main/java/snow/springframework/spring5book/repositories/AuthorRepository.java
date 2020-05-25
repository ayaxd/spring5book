package snow.springframework.spring5book.repositories;

import org.springframework.data.repository.CrudRepository;
import snow.springframework.spring5book.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
