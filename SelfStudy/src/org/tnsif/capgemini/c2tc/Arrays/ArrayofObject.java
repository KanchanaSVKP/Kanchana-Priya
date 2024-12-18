package org.tnsif.capgemini.c2tc.Arrays;
class Book
{
	String title;
	String author;
	double price;
	public Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display()
	{
		System.out.println("Title:"+title+ " Author:  "+author+ "Price : "+price);
	}
}

public class ArrayofObject 
{

	public static void main(String[] args)
	{
		Book[] books=new Book[3];
		books[0]=new Book("Java ","Lakshmi",1500);
		books[1]=new Book("Python","Divya",2500);
		books[2]=new Book("Java ","Priya",3500);
		for(Book book:books)
		{
			book.display();
		}		
}
}


