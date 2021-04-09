package lab04.hust.soict.globalict.aims.media;

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
		super();
		this.title = title;
		this.id = ++nb;
	}
	public Disc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
	}
	public Disc(int id) {
		super();
		this.id = id;
	}
	public Disc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nb;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nb;
	}
}
