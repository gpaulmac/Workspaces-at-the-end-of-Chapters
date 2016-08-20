package com.virtualpairprogrammers.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.domain.ShoppingCart;
import com.virtualpairprogrammers.services.BookService;


@Controller
@Scope("request")
public class AddNewBook 
{
	@Autowired
	private BookService bookService;
	
	@Autowired
	private ShoppingCart cart;
	

	@RequestMapping(value="/addNewBook",method = RequestMethod.GET)
	public ModelAndView show() {
		System.out.println("===============111");
		List<Book> allBooks = cart.getAllItems();		

		return new ModelAndView("/cartContents.jsp","cart",allBooks);
	}
	
	@RequestMapping(value="/addNewBook", method={RequestMethod.POST})
	public ModelAndView addToCart(@RequestParam("isbn") String isbn,
			@RequestParam("title") String title,
			@RequestParam("author") String author,
			@RequestParam("price") String price)
	{
		// To DO
		Double priceD = new Double(price);
		Book book = new Book(isbn,title, author, priceD);
		bookService.registerNewBook(book);
		System.out.println("==============="+title);
		return new ModelAndView("/book-added.jsp","title",title);
	}
	

}