package lab04.hust.soict.globalict.aims.media;
import java.time.LocalDate;
import java.time.Month;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	private LocalDate dateAdded;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	//construction method
	//QUESTION: Yes.Java allows to do that.
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(int id) {
		super();
		this.id = id;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public String getDetail() {
		return id + ". " + "title: " + title + " - " + "category: " + category + " - " + "director: " + director + " - " +
	"length: " + length + " - " + "cost: " + cost + " $";
	}
}
