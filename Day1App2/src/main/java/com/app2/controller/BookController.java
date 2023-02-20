package com.app2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app2.model.Book;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/bookservice")
public class BookController {
	
	List<Book> books=new ArrayList<>();
	
	@PostConstruct
	public void init() {
		books.add(new Book(1, "ramayana", "valmiki", "5000year ago", "history", 500000, "free"));
	}
	
	@GetMapping("/books")
	public List<Book> getAllBookDetails(){
		return books;
	}
	
	//- [http://localhost:8080/bookservice/books/](http://localhost:8080/bookservice/books/)<id>
	@GetMapping("/books/{id}")
	public Book getBookByBookId(@PathVariable("id") Integer id) {
		
		boolean flag=false;
		
	for (Book book : books) {
		if(book.getBookId()==id) {
			flag=true;
             return book;
		}
		
	}
	if(!flag) throw new RuntimeException("Wrong id");
	else return null;
	}
	
	@PostMapping("/books")
	public  String saveBook(@RequestBody Book book) {

		books.add(book);

		return "successfully added";
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteABook(@PathVariable("id")Integer id) {
       boolean flag=false;
		
		
		for (int i=0;i<books.size();i++) {
			if(books.get(i).getBookId()==id) {
				flag=true;
				books.remove(i);
			}
			
		}
		if(flag) return "successfully deleted";
		else  return "wrong id";		
	}
	
	
	@PutMapping("/books/{id}")
	public String updateBook(@PathVariable("id") Integer id,@RequestBody Book book) {
		
		boolean flag=false;
		
		for (int i=0;i<books.size();i++) {
		if(books.get(i).getBookId()==id) {
			flag=true;
			books.remove(i);
			books.add(book);
            
		}
		
	}
	if(flag) return "book updated";
	else return "wrong book id";

 }
	
}
