package lab04.hust.soict.globalict.aims.media;

import lab04.hust.soict.globalict.aims.Store;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	protected static int nb = 0;
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
	public static Media getALuckyItem() {
		Store item = new Store();
		int min = 0;
		int max = nb;
		int luckyid = (int)Math.floor(Math.random() * (max - min + 1) + min);
		return item.searchByID(luckyid);
	}
}
