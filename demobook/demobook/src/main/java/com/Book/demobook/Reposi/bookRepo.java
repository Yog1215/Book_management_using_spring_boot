package com.Book.demobook.Reposi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Book.demobook.book.Book;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Repository
public interface bookRepo extends CrudRepository<Book,Integer> {
	
	public Book getById(int book_id) ;
		
	

	
}
