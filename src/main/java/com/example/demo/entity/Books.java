package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Table
public class Books {

	@Id
	@Column
	private int id;
	@Column
	private String bookname;
	@Column
	private String author;
	@Column
	private int price;
	
//	public Books() { }
	
//	public Books(int id, String bookname, String author, int price) {
//		this.id = id;
//		this.bookname = bookname;
//		this.author = author;
//		this.price = price;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
