// https://www.hackerrank.com/challenges/30-abstract-classes/problem

package day_13_abstract_classes;

import java.util.*;

abstract class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
// Write your constructor here
class MyBook extends Book {
	private int price;
	
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}
	
	@Override
	void display() {
		StringJoiner stringJoiner = new StringJoiner("\n");
		stringJoiner.add("Title: " + title);
		stringJoiner.add("Author: " + author);
		stringJoiner.add("Price: " + price);
		
		System.out.println(stringJoiner.toString());
	}
}

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();
		
		Book book = new MyBook(title, author, price);
		book.display();
	}
}