package hust.soict.globalict.aims.media;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Media implements Comparable <Media>{
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	private ArrayList<Media> media= new ArrayList<Media>();
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	protected static int nb = 0;
	protected LocalDate dateAdded;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	protected String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void freeCost() {
		this.cost = 0;
	}
	public String getDetail() {
		return id + ". " + "title: " + title + " - " + "category: " + category + "cost: " + cost + " $";
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
	public Media(String title) {
		super();
		this.title = title;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public Media(int id) {
		super();
		this.id = id;
		this.dateAdded = LocalDate.now();
	}
	public Media(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public Media(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nb;
		this.dateAdded = LocalDate.now();
	}
	public void seeMediaDetail() {
		for(int i = 0; i < media.size(); i++) {
			if(media.get(i) instanceof DigitalVideoDisc) {
				System.out.println(media.get(i).getDetail());
			}else if(media.get(i) instanceof Book) {
				System.out.println(media.get(i).getDetail());
			}
		}	
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Media) {
			Media item = (Media) obj;
			return this.id == item.id;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Media obj) {
		if(obj instanceof Media) {
			if((this.getTitle().compareToIgnoreCase(obj.getTitle())) != 0){
				return this.getTitle().compareToIgnoreCase(obj.getTitle());
			}else {
				return this.getCategory().compareToIgnoreCase(obj.getCategory());
			}
		}else {
			return -2;
		}
	}
	//compare title and then category
}
