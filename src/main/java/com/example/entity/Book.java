package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="books")
public class Book {
	
	@Id

	
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private String name;
    private String author;
    private String genre;
    private LocalDate createDate;
    private String summary;
    
    
	public Book(Long id, String name, String author, String genre, LocalDate createDate, String summary) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.createDate = createDate;
		this.summary = summary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setUser(User user) {
		// TODO Auto-generated method stub
		
	}

   
}