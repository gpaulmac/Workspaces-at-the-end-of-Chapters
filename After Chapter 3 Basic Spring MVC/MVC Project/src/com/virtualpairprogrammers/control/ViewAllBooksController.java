package com.virtualpairprogrammers.control;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.BookService;

public class ViewAllBooksController 
{	
	private BookService bookService;
		
	public void setBookService(BookService bookService) 
	{
		this.bookService = bookService;
	}

	@RequestMapping("/viewAllBooks")
	public ModelAndView viewAllBooks()
	{
		List<Book> allBooks = bookService.getEntireCatalogue();
		return new ModelAndView("/displayAllBooks.jsp","allBooks",allBooks);
	}
}

