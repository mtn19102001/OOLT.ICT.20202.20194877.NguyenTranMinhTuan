package lab04.hust.soict.globalict.aims;

import java.util.ArrayList;

import lab04.hust.soict.globalict.aims.media.CompactDisc;
import lab04.hust.soict.globalict.aims.media.DigitalVideoDisc;
import lab04.hust.soict.globalict.aims.media.Media;

public class Store {
	public ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public void additem(Media item) {
		if(this.itemsInStore.contains(item)) {
			System.out.println(item.getTitle() + " already existed in the store");
			System.out.println("Cannot add this item to the store!");
		}else {
			this.itemsInStore.add(item);
			System.out.println(item.getId() + ". " + item.getTitle().toString() + " has been added to the store");
		}
	}
	public void removeitem(Media item) {
		if(this.itemsInStore.contains(item)) {
			this.itemsInStore.remove(item);
			System.out.println(item.getId() + item.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + item.getTitle() + " from the store");
		}
	}
	public Media searchByID(int id) {
		for(int i = 0; i < this.itemsInStore.size(); i++) {
			if(this.itemsInStore.get(i).getId() == id) {
				System.out.println("item information: ");
				itemsInStore.get(i).seeMediaDetail();
				return itemsInStore.get(i);
			}
		}
		System.out.println("no match found!");
		return null;
	}
	public void removeitem(int id) {
		Media item = searchByID(id);
		if(this.itemsInStore.remove(item) == true) {
			System.out.println(item.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + item.getTitle() + " from the store");
		}
	}
	public void play(int i) {
		if(itemsInStore.get(i) instanceof DigitalVideoDisc) {
			DigitalVideoDisc dvd = (DigitalVideoDisc) itemsInStore.get(i);
			dvd.play();
		}else if (itemsInStore.get(i) instanceof CompactDisc) {
			CompactDisc cd = (CompactDisc)itemsInStore.get(i);
			cd.play();
		}else {
			System.out.println("Fail to play book!");
		}
	}
	public ArrayList<Media> getItemInStore() {
			 return this.itemsInStore;
	}
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("---------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	//if 2. Update store -> allow user to add or remove a item from the store
	//if 3. See current cart then: 
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Get a lucky item from cart");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	//if 1. View store then:
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. See an item's details");
		System.out.println("2. Add an item to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	//if 1. See an item's details then ask user if they wish to add that
			//item to the current cart
	//if 2. Add an item to cart will ask user to enter the id of that item
			//they see on the screen then add the item to the cart
}
