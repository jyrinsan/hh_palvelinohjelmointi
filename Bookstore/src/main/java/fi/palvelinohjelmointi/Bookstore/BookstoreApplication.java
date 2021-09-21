package fi.palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.palvelinohjelmointi.Bookstore.domain.Book;
import fi.palvelinohjelmointi.Bookstore.domain.BookRepository;
import fi.palvelinohjelmointi.Bookstore.domain.Category;
import fi.palvelinohjelmointi.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner studentDemo(BookRepository repository, CategoryRepository categoryRepository) {
		return (args) -> {
			System.out.println("save a couple of books");
			Category cat1 = categoryRepository.save(new Category("romaani"));
			repository.save(new Book("Title", "Author", "Isbn", 1970, 23.0, cat1));
			Category cat2 = categoryRepository.save(new Category("tietokirja"));
			repository.save(new Book("Title2", "Author2", "Isbn2", 1990, 123.0, cat2));

			System.out.println("fetch all categories");
			for (Category cat : categoryRepository.findAll()) {
				System.out.println(cat.toString());
			}
			
			System.out.println("fetch all books");
			for (Book book : repository.findAll()) {
				System.out.println(book.toString());
			}

		};
	}*/

}
