package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{
	Books findByBookname(final String bookname);
}
