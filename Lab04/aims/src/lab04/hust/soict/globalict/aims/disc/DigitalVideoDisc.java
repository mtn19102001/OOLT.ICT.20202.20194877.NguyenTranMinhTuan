package lab04.hust.soict.globalict.aims.disc;
import java.time.LocalDate;
import java.time.Month;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	private LocalDate dateAdded;
	// below is the getter
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//construction method
	//QUESTION: Yes.Java allows to do that.
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = ++nbDigitalVideoDisc;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
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
		this.id = ++nbDigitalVideoDisc;
		this.dateAdded = LocalDate.now();
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDisc;
		this.dateAdded = LocalDate.now();
	}
	public String getDetail() {
		return id + ". " + "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
	}
	public boolean search(String title) {
		String []sub2 = title.split(" ");
		String []sub1 = this.title.split(" ");
		for(int i = 0; i < sub1.length; i++) {
			for(int j = 0; j < sub2.length; j++) {
				if(sub1[i].equalsIgnoreCase(sub2[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
