package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	public Books saveBook(Books books) {
		return booksRepository.save(books);
	}
	public List<Books> addBooks(List<Books> books){
		return booksRepository.saveAll(books);
	}
	public List<Books> getBooks(){
		return booksRepository.findAll();
	}
	public Books getBookById(int id) {
		return booksRepository.findById(id).orElse(null);
	}
	public Books getBookByName(String bookname) {
		return booksRepository.findByBookname(bookname);
	}
	public String deleteBook(int id) {
		booksRepository.deleteById(id);
		return "book deleted";
	}
	public Books updateBook(Books books) {
		Books existingBook = booksRepository.findById(books.getId()).orElse(null);
		existingBook.setBookname(books.getBookname());
		existingBook.setAuthor(books.getAuthor());
		existingBook.setPrice(books.getPrice());
		return booksRepository.save(existingBook);
	}
	
}
