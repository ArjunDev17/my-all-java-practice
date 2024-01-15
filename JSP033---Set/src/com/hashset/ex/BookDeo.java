package com.hashset.ex;

import java.util.HashSet;
import java.util.Objects;

class Book{
	String Book_Name;
	String author_Name;
	double price;
	/**
	 * @param book_Name
	 * @param author_Name
	 * @param price
	 */
	public Book(String book_Name, String author_Name, double price) {
		super();
		Book_Name = book_Name;
		this.author_Name = author_Name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Book_Name=" + Book_Name + ", author_Name=" + author_Name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Book_Name, author_Name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Book_Name, other.Book_Name) && Objects.equals(author_Name, other.author_Name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
public class BookDeo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Book("java","james",1321));
		hs.add(new Book("sql","G.Ma'am",1321));
		hs.add(new Book("java","james",1321));
		hs.add(new Book("java","james",1321));
		hs.add(new Book("java","james",1321));
		System.out.println(hs);
	}

}
