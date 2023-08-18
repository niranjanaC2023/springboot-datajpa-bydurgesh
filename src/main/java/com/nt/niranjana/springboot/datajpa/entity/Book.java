package com.nt.niranjana.springboot.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="BOOK_DETAILS")
public class Book  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer bookId;	
	
	@Column(name="Book_Name")
	private  String bookName;
	
	@Column(name="Book_Title")
	private  String bookTitle;
	
	@Column(name="Book_Author")
	private  String bookAuthor;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Book(Integer bookId, String bookName, String bookTitle, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", bookAuthor="
				+ bookAuthor + "]";
	}
	
	
}
