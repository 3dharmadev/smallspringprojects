package com.app2.model;

public class Book {
	
	private int BookId;
	private String name;
	private String author;
	private String publication;
	private String category;
	private int pages;
	private String price;
	
	
	
	public Book(int bookId, String name, String author, String publication, String category, int pages, String price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
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
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + "]";
	}
	
	
	

}
