package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Book;
import com.example.entity.User;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findbyUser(User user);

}
