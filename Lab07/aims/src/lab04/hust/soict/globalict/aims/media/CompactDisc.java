package lab04.hust.soict.globalict.aims.media;

import java.time.LocalDate;

public class CompactDisc extends Disc{
	
	public CompactDisc(String title) {
		super(title);
		this.id = ++nb;
	}
	public CompactDisc(String title, String category, float cost) {
		super(title,category,cost);
		this.id = ++nb;
	}
	public CompactDisc(int id) {
		super(id);
	}
	public CompactDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		this.id = ++nb;
	}
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.id = ++nb;
	}
}
