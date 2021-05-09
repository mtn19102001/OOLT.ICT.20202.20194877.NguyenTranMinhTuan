package lab04.hust.soict.globalict.aims.cart;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import lab04.hust.soict.globalict.aims.media.CompactDisc;
import lab04.hust.soict.globalict.aims.media.DigitalVideoDisc;
import lab04.hust.soict.globalict.aims.media.Media;
import lab04.hust.soict.globalict.aims.utils.DVDUtils;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static float totalCost;
	public void addMedia(Media item) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			if(this.itemsOrdered.contains(item)) {
				System.out.println(item.getTitle() + " already existed in the cart");
			}else {
				this.itemsOrdered.add(item);
				System.out.println(item.getId() + ". " + item.getTitle().toString() + " has been added to the cart");
			}
		}else {
			System.out.println("The cart is almost full");
		}
	}
	public void addMedia(Media item1, DigitalVideoDisc item2) {
		List<Media> items = Arrays.asList(item1, item2);
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			if(this.itemsOrdered.addAll(items) == true) {
				System.out.println(items.get(0).getTitle().toString() + " has been added");
				System.out.println(items.get(1).getTitle().toString() + " has been added");
			}else {
				System.out.println("The cart is almost full");
			}
		}
	}
	public void removeMedia(Media item){
		if(itemsOrdered.size() == 0) {
			System.out.println("Cannot remove " + item.getTitle() + "from the cart");
		}else {
			if(this.itemsOrdered.contains(item)) {
				this.itemsOrdered.remove(item);
				System.out.println(item.getTitle().toString() + " has been removed");
			}else {
				System.out.println("Cannot remove " + item.getTitle() + "from the cart");
			}
		}
	}
	
	public float totalCost(){
		for(int i = 0; i < this.itemsOrdered.size(); i++) {
			totalCost += this.itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}
	
	public void sortMediabyTitleCost() {
		java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		for(int i = 0; i < itemsOrdered.size(); i ++) {
			System.out.println(itemsOrdered.get(i).getDetail());
		}
	}
	public void sortMediabyCostTitle() {
		java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		for(int i = 0; i < itemsOrdered.size(); i ++) {
			System.out.println(itemsOrdered.get(i).getDetail());
		}
	}
	public static void displayCart(DigitalVideoDisc ...disc) {
		System.out.println("********************CART********************");
		System.out.println("Ordered Items:");
		Comparator<DigitalVideoDisc> DVDSort = new Comparator<DigitalVideoDisc>() {
			@Override
			public int compare(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
				int compareByTitle = DVDUtils.compareByTitle(disc1, disc2);
				if(compareByTitle == 0) {
					int compareByCost = DVDUtils.compareByCost(disc1, disc2);
					if(compareByCost == 0) {
						return disc2.getLength() - disc1.getLength();
					}
					return -compareByCost;
				}
				return compareByTitle;
			}
		};
		ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
		list.addAll(dvds);
		Collections.sort(list, DVDSort);
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getDetail());
			totalCost += list.get(i).getCost();
		}
		System.out.println("Total cost: " + totalCost + "$");
		System.out.println("********************************************");
	}
	public int searchByID(int id) {
		int found = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i).getDetail());
				found = 1;
			}
		}
		if(found == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	public int searchByTitle(String title) {
		int found = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).search(title) == true) {
				found ++;
				System.out.println("Finding " + "disc containing " + "'" + title + "'" + "...");
				System.out.println("Result: ");
				System.out.println(itemsOrdered.get(i).getDetail());
			}
		}
		if(found == 0) {
			return 0;
		}else
			return 1;
	}
	public void clear() {
		itemsOrdered.clear();
	}
	public Media getAluckyitem() {	//using searchByID
		int luckyID;
		int max = itemsOrdered.size();
		int min = 0;
		do {
			luckyID = (int)Math.round(min + Math.random()*max);
		}while(searchByID(luckyID) == 1);
		itemsOrdered.get(luckyID).freeCost();
		return itemsOrdered.get(luckyID);
	}
	public void play(int id) {
		if(searchByID(id) == 1) {
			if(itemsOrdered.get(id) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) itemsOrdered.get(id);
				dvd.play();
			}else if (itemsOrdered.get(id) instanceof CompactDisc) {
				CompactDisc cd = (CompactDisc)itemsOrdered.get(id);
				cd.play();
			}else {
				System.out.println("Fail to play book!");
			}
		}else {
			System.out.println("Fail to play!S");
		}
	}
}
