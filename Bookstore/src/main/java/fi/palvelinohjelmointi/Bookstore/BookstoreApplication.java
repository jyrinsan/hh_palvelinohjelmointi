package fi.palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.palvelinohjelmointi.Bookstore.domain.Book;
import fi.palvelinohjelmointi.Bookstore.domain.BookRepository;
import fi.palvelinohjelmointi.Bookstore.domain.Category;
import fi.palvelinohjelmointi.Bookstore.domain.CategoryRepository;
import fi.palvelinohjelmointi.Bookstore.domain.User;
import fi.palvelinohjelmointi.Bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner studentDemo(BookRepository repository, CategoryRepository categoryRepository, UserRepository urepository) {
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
			
			// Create users: admin/admin user/user
			User user1 = new User("user",
			"$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin",
			"$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);

		};
	}

}
