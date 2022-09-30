package com.Book.demobook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Book.demobook.Reposi.bookRepo;
import com.Book.demobook.book.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Service
public class bookservice {
@Autowired
	private bookRepo rp;
	public List<Book> allbook() {
		// TODO Auto-generated method stub
		List<Book> list=(List<Book>) this.rp.findAll();
		return list;
	}
	public Book bookbyid(int id) {
		// TODO Auto-generated method stub
		
		return this.rp.getById(id);
	}
	public Book addingBook(Book book) {
		// TODO Auto-generated method stub
		return this.rp.save(book);
	}
	public void deletebook(int book_id) {
		// TODO Auto-generated method stub
		this.rp.deleteById(book_id);
	}
	public void updatebyid(Book book, int book_id) {
		// TODO Auto-generated method stub
		book.setBook_id(book_id);
		this.rp.save(book);
	}

	
	
	
	
}
