package com.Book.demobook.bookcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.demobook.book.Book;
import com.Book.demobook.service.bookservice;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@RestController
public class bookcontroler {
	
	@Autowired
	private bookservice bs;
	@GetMapping("/books")
	public List<Book> getbooks(){
		
		return this.bs.allbook();
	}
	
	@GetMapping("/books/{book_id}")
	public Book getbookbyid(@PathVariable ("book_id") int book_id) {
		Book book=null;
		try {
		book= this.bs.bookbyid(book_id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	@PostMapping("/books")
	public Book addbook(@RequestBody Book book) {
		return this.bs.addingBook(book);
		
		
	}
	@DeleteMapping("/books/{book_id}")
	public void deleteBook(@PathVariable ("book_id") int book_id) {
		
		 this.bs.deletebook(book_id);
		
	}
	
	@PutMapping("/books/{book_id}")
	public  void updatebook(@RequestBody Book book,@PathVariable ("book_id") int book_id) {
		
		 this.bs.updatebyid(book,book_id);
	}
	
	
	

	
	
}
