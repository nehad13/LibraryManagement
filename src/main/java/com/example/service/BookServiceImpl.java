package com.example.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.entity.User;
import com.example.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book, User user) {
        book.setUser(user);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBooksByUser(User user) {
        return bookRepository.findbyUser(user);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
