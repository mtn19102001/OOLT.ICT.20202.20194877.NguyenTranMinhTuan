package lab04.hust.soict.globalict.aims.media;
import java.time.LocalDate;
import java.time.Month;

public class DigitalVideoDisc extends Disc{
	private LocalDate dateAdded;

	//construction method
	//QUESTION: Yes.Java allows to do that.
	
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(int id) {
		super(id);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public String getDetail() {
		return id + ". " + "title: " + title + " - " + "category: " + category + " - " + "director: " + director + " - " +
	"length: " + length + " - " + "cost: " + cost + " $";
	}
}
