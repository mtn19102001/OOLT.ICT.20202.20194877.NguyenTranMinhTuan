package lab04.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	public Book() {

	}
	public void addAuthors(String authorName) {
		if(authors.contains(authorName) == false) {
			authors.add(authorName);
		}else {
			System.out.println("The " + authorName + " already existed in the list");
		}
	}
	public void removeAuthors(String authorName) {
		if(authors.contains(authorName) == true) {
			authors.remove(authorName);
		}else {
			System.out.println("The " + authorName + " does not exist in the list");
		}
	}
}