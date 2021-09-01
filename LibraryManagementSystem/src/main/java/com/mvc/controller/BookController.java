package com.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


import com.mvc.Dao.BookDao;
import com.mvc.bean.Book;
import com.mvc.bean.User;
import com.mvc.service.BookService;
import com.mvc.service.UserService;

@Controller
public class BookController {
	 @Autowired
	  public BookService bookService;
	 @Autowired
	  public UserService userService;
	 @Autowired 
	public BookDao bookDao;
	
	  @RequestMapping(value = "/bookreg", method = RequestMethod.GET)
	  public ModelAndView showBooks() {
	    ModelAndView mav = new ModelAndView("bookreg");
	    mav.addObject("book", new Book());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/bookregistration", method = RequestMethod.POST)
	  public ModelAndView addBook(@ModelAttribute("book") Book book) throws Exception {
	  bookService.save(book);
	   return new ModelAndView("redirect:/bookview");
	  }
	  
	    @RequestMapping("/bookview")    
	    public String viewBook(Model m){    
	        List<Book> list=bookDao.getBook();    
	        m.addAttribute("list",list); 
	      return "booksview";  
	        
	    }    
	  
	    @RequestMapping(value="/deletebook/{bookcode}",method = RequestMethod.GET)    
	    public ModelAndView delete(@PathVariable String bookcode){    
	        bookService.delete(bookcode);   
	     return new ModelAndView("redirect:/bookview");    
	    } 
	    
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("book") Book book){    
	      
	    	bookService.update(book);    
	        return "redirect:/bookview";    
	    }    
	    @RequestMapping(value="/editbook/{bookcode}")    
	    public String edit(@PathVariable String bookcode, Model m){    
	        Book book=bookService.getBookByBookcode(bookcode);    
	        m.addAttribute("command",book);  
	        return "bookeditform";    
	    }    
	  
	    @RequestMapping("/searchbook")    
	    public String searchBook(Model m){    
	        List<Book> list=bookDao.getBook();    
	        m.addAttribute("list",list); 
	       m.addAttribute("book", new Book());
		
	        return "viewbook";    
	    }    
	    
	    @RequestMapping(value="/viewselectedbook",method = RequestMethod.POST)    
	    public String viewselectedbook(@ModelAttribute("book") Book book, Model m){    
	    	 List<Book> list = bookDao.getBookByBooktype(book.getBooktype());  
	    	  m.addAttribute("list",list); 
	        return "viewselectedbook";    
	    } 
	   
	
}
