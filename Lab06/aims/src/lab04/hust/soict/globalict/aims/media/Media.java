package lab04.hust.soict.globalict.aims.media;

public class Media {
	private String title;
	private String category;
	private float cost;
	private int id;
	private static int nb = 0;
	protected int getId() {
		this.id ++;
		return id;
	}
	protected String getTitle() {
		return title;
	}
	protected String getCategory() {
		return category;
	}
	protected float getCost() {
		return cost;
	}
}
