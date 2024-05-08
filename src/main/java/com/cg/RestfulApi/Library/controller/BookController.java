package com.cg.RestfulApi.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.RestfulApi.Library.Models.Book;
import com.cg.RestfulApi.Library.repo.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo bookRepo;

	@GetMapping(value="/")
	public String getPage() {
		return "Welcome";
	}	
	
	@GetMapping(value="/users")
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}
		
	
}
