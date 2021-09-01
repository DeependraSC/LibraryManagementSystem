package com.cts.Dao;

import java.util.List;

import com.cts.bean.Book;
import com.cts.bean.User;


public interface BookDao {
	void save(Book book);
	public List<Book> getBook();
	public int delete(String bookcode);
	public Book getBookByBookcode(String bookcode);
	public List<Book> getBookByBooktype(String booktype);
	public int update(Book book);
}
