package org.java.exceptions.book;

public class Book {
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
	public Book(String title, int pages, String author, String publisher) throws Exception {
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if(title == null || title.isEmpty() || title.length() <= 3) {
			throw new Exception("Title must be longer then 3 characters");
		}
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		if(title == null || pages <= 0) throw new Exception("Number of pages not valid");
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if(author == null || author.isEmpty() || author.length() <= 3) {
			throw new Exception("Author must be longer then 3 characters");
		}
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		if(publisher == null || publisher.isEmpty() || publisher.length() <= 3) {
			throw new Exception("Publisher must be longer then 3 characters");
		}
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.title + "\n"
			+ "Number of pages: " + this.pages + "\n"
			+ "Author: " + this.author + "\n"
			+ "Publisher: " + this.publisher;
	}
}
