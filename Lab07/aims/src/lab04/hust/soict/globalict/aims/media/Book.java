package lab04.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media{
	private static List<String> authors = new ArrayList<String>();
	private String content;
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
		super(title);
		this.id = nb;
	}
	public Book(String title, String category, float cost) {
		super(title, category, cost);
		this.id = nb;
	}
	public Book(int id) {
		super(id);
	}
	public Book(String title, String category, String author, float cost) {
		super(title, category, author, cost);
		this.id = nb;
	}
	public String getDetail() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = content.split("\\W+");
		for(String w : words) {
			if(!map.containsKey(w)) {
				map.put(w, 1);
			}else {
				map.put(w, map.get(w) + 1);
			}
		}
		StringBuffer ret = new StringBuffer();
		ret.append("[ID = " + this.id + "]" + " " + 
					"[Title = " + this.title + "]" + " " +
					"Category = " + this.category + "]" + " ");
		ret.append("[Author = ");
		for(String author : Book.authors) {
			ret.append(author + ", ");
		}
		ret.append("] ");
		ret.append("[ ");
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			ret.append(entry.getKey() + ": " + entry.getValue() + ", ");
		}
		ret.append("] ");
		ret.append("[Cost = " + this.cost + "] ");
		return ret.toString();
	}
}