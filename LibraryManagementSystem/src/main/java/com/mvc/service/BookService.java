package com.mvc.service;



import java.util.List;

import com.mvc.bean.Book;
import com.mvc.bean.User;

public interface BookService {
	void save(Book book) throws Exception;

	void delete(String bookcode);

	void update(Book book);

	Book getBookByBookcode(String bookcode);

	List<Book> getBookByBooktype(String booktype);
}
