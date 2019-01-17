package horovyi.sprint.spring5webapp.bootstrap;

import horovyi.sprint.spring5webapp.model.Author;
import horovyi.sprint.spring5webapp.model.Book;
import horovyi.sprint.spring5webapp.model.Publisher;
import horovyi.sprint.spring5webapp.repositories.AuthorRepository;
import horovyi.sprint.spring5webapp.repositories.BookRepository;
import horovyi.sprint.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * created by ihor.horovyi on 2019-01-17
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    @Autowired
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher();
        publisher.setName("wiki");

        publisherRepository.save(publisher);

        Author joshua = new Author("Joshua", "Bloch");
        Book effectiveJava = new Book("Effective Java", "1024", publisher);
        joshua.getBooks().add(effectiveJava);
        effectiveJava.getAuthors().add(joshua);

        authorRepository.save(joshua);
        bookRepository.save(effectiveJava);

        Author eric = new Author("Eric", "Evants");
        Book ddd = new Book("Domain Driven Design", "2048", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
    }

}
