package hust.soict.globalict.aims.media;

import java.time.LocalDate;

public class Disc extends Media{
	protected int length;
	protected String director;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public Disc(String title) {
		super(title);
		this.title = title;
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public Disc(int id) {
		super(id);
		this.dateAdded = LocalDate.now();
	}
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public String getDetail() {
		return id + ". " + "title: " + title + " - " + "category: " + category + " - " + "director: " + director + " - " +
	"length: " + length + " - " + "cost: " + cost + " $";
	}
}
