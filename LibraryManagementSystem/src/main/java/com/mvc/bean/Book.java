package com.mvc.bean;

public class Book {

	private String  Bookcode;
	private String Bookname;
	private String Booktype;
	private int Price;
	private String Description;
	
	public String getBookcode() {
		return Bookcode;
	}
	public void setBookcode(String bookcode) {
		this.Bookcode = bookcode;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		this.Bookname = bookname;
	}
	public String getBooktype() {
		return Booktype;
	}
	public void setBooktype(String booktype) {
		this.Booktype = booktype;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	@Override
	public String toString() {
		return "Book [Bookcode=" + Bookcode + ", Bookname=" + Bookname + ", Booktype=" + Booktype + ", Price=" + Price
				+ ", Description=" + Description + "]";
	}	
}
