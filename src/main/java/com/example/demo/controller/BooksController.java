package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Books;
import com.example.demo.service.BooksService;

@RestController

public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@PostMapping("/addBook")
	public Books addBook(@RequestBody Books books) {
	return booksService.saveBook(books);
	}
	@PostMapping("/addBooks")
	public List<Books> addBooks(@RequestBody List<Books> books){
		return booksService.addBooks(books);
	}
	@GetMapping("/getbooks")
	public List<Books> getAllBooks(){
		return booksService.getBooks();
	}
	@GetMapping("/getBookById/{id}")
	public Books getBookById(@PathVariable int id) {
		return booksService.getBookById(id);
	}
	@GetMapping("/getBookByName/{name}")
	public Books getBookByName(@PathVariable String bookname) {
		return booksService.getBookByName(bookname);
	}
	@PutMapping("/update")
	public Books updateBook(@RequestBody Books books) {
		return booksService.updateBook(books);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id){
		return booksService.deleteBook(id);
}
}