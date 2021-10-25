package com.serverValidation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.serverValidation.beans.Users;
import com.serverValidation.repo.UsersDao;

@Controller
public class ValidateController {

	@Autowired
	private ValidationConfig config;

	@Autowired
	private UsersDao dao;

	@GetMapping("/")
	public String login(Model m, HttpSession session) {
		m.addAttribute("users", new Users());
		String message = (String) session.getAttribute("msg");
		session.setAttribute("message", message);
		session.removeAttribute("msg");
		return "login";
	}

	@PostMapping("/process")
	public String process(@Valid @ModelAttribute("users") Users users, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "login";
		} else {
			dao.save(users);
			System.out.println(users);
			return "redirect:/";

		}
	}

	@GetMapping("/record")
	public String allRecord(Model m) {
		List<Users> u = dao.getAllUsers();
		m.addAttribute("users", u);
		return "success";
	}

	@GetMapping("/update-user/{id}")
	public String getId(@PathVariable("id") int id, Model m) {
		Users users = dao.getById(id);
		m.addAttribute("users", users);
		return "update";

	}

	@PostMapping("/update")
	public String update(@ModelAttribute("users") Users u) {
		
		Users users = new Users(u.getId(), u.getUserName(), u.getEmail(), u.getPassword(), u.getConfirmPassword(),
				u.getGender());
		dao.update(users);
		return "redirect:/record";

	}

}
