package horovyi.sprint.spring5webapp.repositories;

import horovyi.sprint.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * created by ihor.horovyi on 2019-01-17
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
