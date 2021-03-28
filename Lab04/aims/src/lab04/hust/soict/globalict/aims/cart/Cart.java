package lab04.hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import lab04.hust.soict.globalict.aims.utils.DVDUtils;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	public int qtyOrdered;
	public static float totalCost;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	private void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			if(this.itemsOrdered.add(disc) == true)
				System.out.println(disc.getTitle().toString() + " has been added");
			this.setQtyOrdered(this.itemsOrdered.size());
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	//error 
	public void addDigitalVideoDisc(DigitalVideoDisc [] disc){
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
			if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
				if(this.itemsOrdered.addAll(dvds) == true)
					this.setQtyOrdered(this.itemsOrdered.size());
			}
			else {
				System.out.println("The cart is almost full");
			}
	}
	void addDigtalVideoDisc(DigitalVideoDisc ...disc) {
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
			if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
				if(this.itemsOrdered.addAll(dvds) == true)
					this.setQtyOrdered(this.itemsOrdered.size());
			}
			else {
				System.out.println("The cart is almost full");
			}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			List<DigitalVideoDisc> dvds = Arrays.asList(dvd1, dvd2);
			if(this.itemsOrdered.addAll(dvds) == true) {
				System.out.println(dvds.get(0).getTitle().toString() + " has been added");
				System.out.println(dvds.get(1).getTitle().toString() + " has been added");
			}
				this.setQtyOrdered(this.itemsOrdered.size());
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		if(this.getQtyOrdered() == 0) {
			System.out.println("Cannot remove any disc");
		}
		else {
			if(this.itemsOrdered.remove(disc) == true)
				System.out.println(disc.getTitle().toString() + " has been removed");
			this.setQtyOrdered(this.itemsOrdered.size());
		}
	}
	
	public float totalCost(){
		for(int i = 0; i < this.itemsOrdered.size(); i++) {
			totalCost += this.itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}
	
	public void showCart() {
		if(this.getQtyOrdered() == 0) {
			System.out.println("The cart is empty");
		}else {
			System.out.println("The cart has " + this.getQtyOrdered() + " item(s):");
			for(int i = 0; i < itemsOrdered.size(); i++) {
				if(itemsOrdered.get(i).getDirector() == null) {
					System.out.println((i + 1) + ". " + itemsOrdered.get(i).getTitle().toString() + " - " + itemsOrdered.get(i).getCategory().toString() + " - " 
						+ "undefined director" + " - " + itemsOrdered.get(i).getLength() + " - " + itemsOrdered.get(i).getCost());
				}else {
					System.out.println((i + 1) + ". " + itemsOrdered.get(i).getTitle().toString() + " - " + itemsOrdered.get(i).getCategory().toString() + " - " 
							+ itemsOrdered.get(i).getDirector() + " - " + itemsOrdered.get(i).getLength() + " - " + itemsOrdered.get(i).getCost());
				}
			}
		}
	}
	// same title -> higher cost displayed first
	public void sortByTitle() {
		Comparator<DigitalVideoDisc> DVDSort = new Comparator<DigitalVideoDisc>() {
			@Override
			public int compare(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
				int compareByTitle = DVDUtils.compareByTitle(disc1, disc2);
				if(compareByTitle == 0) {
					int compareByCost = DVDUtils.compareByCost(disc1, disc2);
					return -compareByCost;
				}
				return compareByTitle;
			}
		};
		Collections.sort(itemsOrdered, DVDSort);
		for(int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i).getDetail());
		}
	}
	// same cost -> increasing title
	public void sortByCost() {
		Comparator<DigitalVideoDisc> DVDSort = new Comparator<DigitalVideoDisc>() {
			@Override
			public int compare(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
				int compareByCost = DVDUtils.compareByCost(disc1, disc2);
				if(compareByCost == 0) {
					int compareByTitle = DVDUtils.compareByTitle(disc1, disc2);
					return compareByTitle;
				}
				return -compareByCost;
			}
		};
		Collections.sort(itemsOrdered, DVDSort);
		for(int i = 0; i < itemsOrdered.size(); i++) {
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
	public void searchByID(int id) {
		int found = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i).getDetail());
				found = 1;
			}
		}
		if(found == 0) {
			System.out.println("no match is found");
		}
	}
	public void searchByTitle(String title) {
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
			System.out.println("no match is found");
		}
	}
	public void clear() {
		itemsOrdered.clear();
		qtyOrdered = 0;
	}
}
