package com.nt.niranjana.springboot.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.niranjana.springboot.datajpa.entity.Book;
import com.nt.niranjana.springboot.datajpa.service.BookServiceWithManualData;

@RestController
@RequestMapping("/bookDetailss")
public class BookControllerWithManualData
{
	@Autowired
	private BookServiceWithManualData bookService;
	
	//get all books
	@GetMapping("/getAllBookClassDetails")
	public List<Book> getAllBooks()
	{
		List<Book> listOfBook = bookService.getAllBooks();
		return listOfBook;
	}
	
	//get single books details using its id
	@GetMapping("/getSingleBookClassDetails/{id}")
	public Book getAllBooks(@PathVariable("id") int id)
	{
		return bookService.getBookClassDetailsFromListByUsingItsID(id);
	}
	
	//insert single books details
	@PostMapping("/insertSingleBookClassDetails")
	public Book insertSingleBooksIntoList(@RequestBody Book bookData)
	{
		Book insertedBookData =  bookService.insertBookClassDetailsIntoList(bookData);
		return insertedBookData;
	}
	
	//insert multiple books details
	@PostMapping("/insertMultipleBookClassDetails")
	public List<Book> insertMultipleBooksIntoList(@RequestBody List<Book> bookData)
	{
		List<Book> insertedMultipleBookData =  bookService.insertMultipleBookClassDetailsIntoList(bookData);
		System.out.println("insertedMultipleBookData:"+insertedMultipleBookData);
		return insertedMultipleBookData;
	}
	
	//delete single book details from List using its ID
	@DeleteMapping("/deleteSingleBookDetails/{id}")
	public void deleteSingleBookDetails(@PathVariable("id") int id)
	{
		System.out.println("This is Controller deleteSingleBookDetails method");
		bookService.deleteSingleBookData(id);
	}

	//update book details in List
	@PutMapping("/updateBookDetails/{id}")
	public Book updateBookDetails(@RequestBody Book book ,@PathVariable("id") int id)
	{
		System.out.println("This is Controller updateBookDetails method");
		Book updatedBookDetails = bookService.updateBookDetails(book, id);
		System.out.println("updateBookDetails"+updatedBookDetails);
		return book;
	}
}
