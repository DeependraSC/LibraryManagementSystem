package com.cts.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.bean.Book;



public class BookDaoImpl implements BookDao {

	 @Autowired
	  DataSource dataSource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	 


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void save(Book book) {
		// TODO Auto-generated method stub
		String sql = "insert into book values(?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { book.getBookcode(), book.getBookname(), book.getBooktype(), 
	     book.getPrice(), book.getDescription() });
	}
	
	public int delete(String bookcode) {
		// TODO Auto-generated method stub
		 String sql="delete from book where bookcode='"+bookcode+"'";    
		    return jdbcTemplate.update(sql);  
	}    

	public List<Book> getBook(){    
	    return jdbcTemplate.query("select * from book",new RowMapper<Book>(){    
	        public Book mapRow(ResultSet rs, int row) throws SQLException {    
	            Book b=new Book();    
	            b.setBookcode(rs.getString(1));    
	            b.setBookname(rs.getString(2));    
	            b.setBooktype(rs.getString(3));    
	            b.setPrice(rs.getInt(4));
	            b.setDescription(rs.getString(5)); 
	            return b;    
	        }    
	    });    
	}


	public Book getBookByBookcode(String bookcode) {
		// TODO Auto-generated method stub
		 String sql="select * from book where bookcode=?";    
		    return jdbcTemplate.queryForObject(sql, new Object[]{bookcode},new BeanPropertyRowMapper<Book>(Book.class));  
		
	}


	public int update(Book book) {
		// TODO Auto-generated method stub
		 String sql="update book set Bookname='"+book.getBookname()+"', Booktype='"+book.getBooktype()+"', Price="+book.getPrice()+",Description='"+book.getDescription()+"' where bookcode='"+book.getBookcode()+"'";    
		    return jdbcTemplate.update(sql);  
		
	}


	public List<Book> getBookByBooktype(String booktype) {
		
	
	//	System.out.println("Deependra");
	
		  return jdbcTemplate.query("select * from book where booktype='"+booktype+"'",new RowMapper<Book>(){    
		        public Book mapRow(ResultSet rs, int row) throws SQLException {    
		            Book b=new Book();    
		            b.setBookcode(rs.getString(1));    
		            b.setBookname(rs.getString(2));    
		            b.setBooktype(rs.getString(3));    
		            b.setPrice(rs.getInt(4));
		            b.setDescription(rs.getString(5)); 
		            return b;    
		        }    
		    });    

	
	}
}


	

	


