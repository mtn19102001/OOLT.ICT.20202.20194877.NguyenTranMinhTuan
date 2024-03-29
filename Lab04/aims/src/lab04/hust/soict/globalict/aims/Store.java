package lab04.hust.soict.globalict.aims;

import java.util.ArrayList;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	ArrayList<DigitalVideoDisc> storelist = new ArrayList<DigitalVideoDisc>();
	public void addDVD(DigitalVideoDisc dvd) {
		if(this.storelist.add(dvd) == true) {
			System.out.println(dvd.getTitle().toString() + " has been added to the store");
		}else {
			System.out.println("Cannot add " + dvd.getTitle() + " to the store");
		}
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		if(this.storelist.remove(dvd) == true) {
			System.out.println(dvd.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + dvd.getTitle() + " from the store");
		}
	}
	public DigitalVideoDisc searchByID(int id) {
		for(int i = 0; i < this.storelist.size(); i++) {
			if(this.storelist.get(i).getId() == id) {
				System.out.println("DVD information: " + this.storelist.get(i).getDetail());
				return storelist.get(i);
			}
		}
		System.out.println("no match found!");
		return null;
	}
	public void removeDVD(int id) {
		DigitalVideoDisc dvd = searchByID(id);
		if(this.storelist.remove(dvd) == true) {
			System.out.println(dvd.getTitle().toString() + " has been removed from the store");
		}else {
			System.out.println("Cannot remove " + dvd.getTitle() + " from the store");
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
	//if 2. Update store -> allow user to add or remove a DVD from the store
	//if 3. See current cart then: 
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	//if 1. View store then:
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("---------------------------------");
		System.out.println("1. See a DVD's details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	//if 1. See a DVD's details then ask user if they wish to add that
			//DVD to the current cart
	//if 2. Add a DVD to cart will ask user to enter the id of that dvd
			//they see on the screen then add the DVD to the cart
}
