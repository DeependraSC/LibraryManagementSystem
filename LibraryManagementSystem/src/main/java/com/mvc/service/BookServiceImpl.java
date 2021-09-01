package com.mvc.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.Dao.BookDao;
import com.mvc.Dao.UserDao;
import com.mvc.bean.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	

	public void save(Book book) throws Exception {
		String temp=book.getBookname();
		 Random rand = new Random();
		    int ran = 10+rand.nextInt(90); 
	         String ranstr=Integer.toString(ran);
	      String genid=temp.substring(0, 4).concat(ranstr);
	       book.setBookcode(genid);
		bookDao.save(book);
	}

	public void delete(String bookcode) {
		
		bookDao.delete(bookcode);
	}

	public void update(Book book) {
		
		bookDao.update(book);
	}

	public Book getBookByBookcode(String bookcode) {
		
		return bookDao.getBookByBookcode(bookcode);
	}

	public List<Book> getBookByBooktype(String booktype) {
		return bookDao.getBookByBooktype(booktype);
	}

	
}
