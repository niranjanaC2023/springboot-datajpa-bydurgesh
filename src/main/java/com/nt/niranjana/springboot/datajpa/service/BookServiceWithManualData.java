package com.nt.niranjana.springboot.datajpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nt.niranjana.springboot.datajpa.entity.Book;

@Service
public class BookServiceWithManualData 
{

	//set all the book in list (this is load during the class loading time)
	public static List<Book> list = new ArrayList<>();
	
	static
	{
		list.add(new Book(1995,"java","The Java Book","James Gosling"));
		list.add(new Book(2003,"spring","The Spring Book","Rod Johnson"));
		list.add(new Book(1991,"python","The Python Book","Guido van Rossum"));
		list.add(new Book(1995,"java","The JavaScript Book","Brendan Eich"));
	}
	
	//get all the book class details
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	//get Single book details From DB by using its ID
	  public Book getBookClassDetailsFromListByUsingItsID(int id)
	  {
		  System.out.println("This is Service getBookClassDetailsFromDBByUsingItsID");
		  Book getSingleBookData = list.stream().filter(e->e.getBookId()==id).findFirst().get();
		  System.out.println("getSingleBookData: "+getSingleBookData);
		  return getSingleBookData;
	  }
	  
	//insert single book class details 
	public Book insertBookClassDetailsIntoList(Book bookData)
	{
		System.out.println("This is Service insertBookClassDetailsIntoList method");
		list.add(bookData);
		return bookData;
	}
	
	//insert multiple book class details 
	public List<Book> insertMultipleBookClassDetailsIntoList(List<Book> listOfBookData)
	{
		System.out.println("This is Service insertBookClassDetailsIntoList method");
		list.addAll(listOfBookData);
		return listOfBookData;
	}
	
	//delete single book data using its ID
	  public void deleteSingleBookData(int id)
	  {
		  System.out.println("This is Service deleteSingleBookData");
		
			   list = list.stream().filter(book->book.getBookId()!=id).collect(Collectors.toList());   //single line
			   System.out.println("list: "+list);
				
			  /*
				   
				  list = list.stream().filter(book->
													  {
														  if(book.getBookId()!=id)
														  {
															  return true;
														  }
														  else
														  {
															  return false;
														  }
															  
													  }
											   ).collect(Collectors.toList());
				  System.out.println("list: "+list);
				 */
			  
	  }
	  
	//update Book details
	  public Book updateBookDetails(Book book, int bookId)
	  {
		  System.out.println("This is Service updateBookDetails");
		  list = list.stream().map(b->{
								  if(b.getBookId() == bookId)
								  {
									  b.setBookName(book.getBookName());
									  b.setBookTitle(book.getBookTitle());
									  b.setBookAuthor(book.getBookAuthor());
								  }
								  return b;
								}
	  						).collect(Collectors.toList());
		  return book;
	  }
}
