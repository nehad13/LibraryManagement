package com.example.service;

import java.util.List;

import com.example.entity.Book;
import com.example.entity.User;

public interface BookService {
	Book createBook(Book book, User user);
    List<Book> getBooksByUser(User user);
    void deleteBook(Long bookId);

}
