package fi.palvelinohjelmointi.Bookstore.web;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BookController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String hello(Model model) {
		return "index";
	}

}
