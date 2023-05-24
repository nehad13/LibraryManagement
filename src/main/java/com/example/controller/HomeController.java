package com.example.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.service.BookService;
import com.example.service.UserService;

@Controller
public class HomeController {
	
	  private final UserService userService;
	    private final BookService bookService;

	    public HomeController(UserService userService, BookService bookService) {
	        this.userService = userService;
	        this.bookService = bookService;
	    }

	    @GetMapping("/home")
	    public String home(Principal principal, Model model) {
	        String username = principal.getName();
	        User user = userService.findByUsername(username);
	        List<Book> books = bookService.getBooksByUser(user);
	        model.addAttribute("books", books);
	        return "home";
	    }

	    @PostMapping("/addBook")
	    public String addBook(@ModelAttribute("book") Book book, Principal principal) {
	        String username = principal.getName();
	        User user = userService.findByUsername(username);
	        bookService.createBook(book, user);
	        return "redirect:/home";
	    }

	    @GetMapping("/deleteBook/{id}")
	    public String deleteBook(@PathVariable("id") Long bookId) {
	        bookService.deleteBook(bookId);
	        return "redirect:/home";
	    }

}
