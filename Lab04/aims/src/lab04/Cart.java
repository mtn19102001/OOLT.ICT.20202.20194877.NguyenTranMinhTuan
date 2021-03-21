package lab04;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 10;
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
	void addDigitalVideoDisc(DigitalVideoDisc [] disc){
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
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
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
	
	public static void sortByTitle(DigitalVideoDisc ...disc) {
		ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
		list.addAll(dvds);
		Collections.sort(list, new Comparator<DigitalVideoDisc>() 
		{
			//ascending sort
			public int compare(DigitalVideoDisc disc1,DigitalVideoDisc disc2) 
			{
				return String.valueOf(disc2.getTitle()).compareTo(disc1.getTitle());
			}
		});
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDetail());
		}
	}
	public static void sortByCost(DigitalVideoDisc ...disc) {
		ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
		list.addAll(dvds);
		Collections.sort(list, new Comparator<DigitalVideoDisc>() 
		{
			//ascending sort
			public int compare(DigitalVideoDisc disc2,DigitalVideoDisc disc1) 
			{
				return Float.valueOf(disc1.getCost()).compareTo(disc2.getCost());
			}
		});
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDetail());
		}
	}
	public static void searchByID(int id, DigitalVideoDisc ...disc) {
		int found =0;
		ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
		List<DigitalVideoDisc> dvds = Arrays.asList(disc);
		list.addAll(dvds);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				System.out.println(list.get(i).getDetail());
				found = 1;
			}
		}
		if(found == 0) {
			System.out.println("no match is found");
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
					int compareByCost = DVDUtils.compareByTitle(disc1, disc2);
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
}
