package fi.palvelinohjelmointi.FriendListApplication.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	
	private ArrayList<String> list = new ArrayList<String> ();
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String hello(@RequestParam(name="name", required=false) String name, Model model) {
		if (name != null && !name.trim().isEmpty())
			list.add(name);
		model.addAttribute("list", list);
		return "friendlist";
	}

}
