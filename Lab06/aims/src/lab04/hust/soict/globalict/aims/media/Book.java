package lab04.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private static List<String> authors = new ArrayList<String>();
	private String author;
	//add author to list
	public static void addAuthors(String authorName) {
		if(authors.contains(authorName) == false) {
			authors.add(authorName);
		}else {
			System.out.println("The " + authorName + " already existed in the list");
		}
	}
	//remove author from list
	public void removeAuthors(String authorName) {
		if(authors.contains(authorName) == true) {
			authors.remove(authorName);
		}else {
			System.out.println("The " + authorName + " does not exist in the list");
		}
	}
	public Book(String title) {
		super();
		this.title = title;
		this.id = ++nb;
	}
	public Book(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public Book(String title, String category, String author, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.cost = cost;
		this.id = ++nb;
	}
	public String getDetail() {
		return id + ". " + "title: " + title + " - " + "category: " + category + " - " + "authors: " + authors + " - " +
	" - " + "cost: " + cost + " $";
	}
}