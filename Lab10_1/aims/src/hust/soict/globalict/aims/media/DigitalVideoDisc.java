package hust.soict.globalict.aims.media;
import java.time.LocalDate;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	//construction method
	//QUESTION: Yes.Java allows to do that.
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(int id) {
		super(id);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public void play() throws PlayerException{
		if(this.getLength() > 0) {
			System.out.println("PLaying DVD: " + super.getTitle());
			System.out.println("DVD length: " + super.getLength());
		}else {
			throw new PlayerException("Error: DVD length is non-positive!");
		}
	}
}
