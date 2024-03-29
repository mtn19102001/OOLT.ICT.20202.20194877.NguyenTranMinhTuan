package lab04.hust.soict.globalict.aims;

import java.util.ArrayList;

import lab04.hust.soict.globalict.aims.media.Media;

public class Store {
	public ArrayList<Media> storelist = new ArrayList<Media>();
	public void additem(Media item) {
		if(this.storelist.add(item) == true) {
			System.out.println(item.getTitle().toString() + " has been added to the store");
		}else {
			System.out.println("Cannot add " + item.getTitle() + " to the store");
		}
	}
	public void removeitem(Media item) {
		if(this.storelist.remove(item) == true) {
			System.out.println(item.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + item.getTitle() + " from the store");
		}
	}
	public Media searchByID(int id) {
		for(int i = 0; i < this.storelist.size(); i++) {
			if(this.storelist.get(i).getId() == id) {
				System.out.println("item information: " + this.storelist.get(i).getDetail());
				return storelist.get(i);
			}
		}
		System.out.println("no match found!");
		return null;
	}
	public void removeitem(int id) {
		Media item = searchByID(id);
		if(this.storelist.remove(item) == true) {
			System.out.println(item.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + item.getTitle() + " from the store");
		}
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
		System.out.println("1. See a item's details");
		System.out.println("2. Add a item to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	//if 1. See a item's details then ask user if they wish to add that
			//item to the current cart
	//if 2. Add a item to cart will ask user to enter the id of that item
			//they see on the screen then add the item to the cart
}
