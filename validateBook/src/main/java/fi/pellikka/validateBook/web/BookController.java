package fi.pellikka.validateBook.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fi.pellikka.validateBook.domain.Book;

@Controller
public class BookController {

	@GetMapping("/add")
	public String addNewBook(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping("/add")
	public String bookAdded(@Valid Book book, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "addBook";
		}

		model.addAttribute("book", book);
		return "result";
	}

}
