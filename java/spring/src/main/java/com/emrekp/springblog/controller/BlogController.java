package com.emrekp.springblog.controller;

import java.util.Date;

import com.emrekp.springblog.model.Message;
import com.emrekp.springblog.repo.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
	private final MessageRepository mainRepo;

	@Autowired
	public BlogController(MessageRepository mainRepo) {
		this.mainRepo = mainRepo;
	}

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("message", new Message());
		model.addAttribute("messageList", mainRepo.findAll());

		return "blog";
	}

	@PostMapping("/")
	public String sendMsg(@ModelAttribute Message message, Model model) {
		message.setDate(new Date());
		message.setDeleted(false);

		mainRepo.save(message);

		return "redirect:/";
	}
}
