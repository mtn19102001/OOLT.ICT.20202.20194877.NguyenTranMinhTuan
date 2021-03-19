package Project;
import java.util.ArrayList;
import java.util.Arrays;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	public int qtyOrdered;
	public float totalCost;
	
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
	
	void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			if(this.itemsOrdered.addAll(Arrays.asList(dvdList)) == true)
				System.out.println(dvdList.getClass().toString() + " has been added");
			this.setQtyOrdered(this.itemsOrdered.size());
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	void addDigtalVideoDisc(DigitalVideoDisc ...disc) {
		
	}
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		
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
					System.out.println(i + itemsOrdered.get(i).getTitle().toString() + " - " + itemsOrdered.get(i).getCategory().toString() + " - " 
						+ "undefined director" + " - " + itemsOrdered.get(i).getLength() + " - " + itemsOrdered.get(i).getCost());
				}else {
					System.out.println(i + itemsOrdered.get(i).getTitle().toString() + " - " + itemsOrdered.get(i).getCategory().toString() + " - " 
							+ itemsOrdered.get(i).getDirector() + " - " + itemsOrdered.get(i).getLength() + " - " + itemsOrdered.get(i).getCost());
				}
			}
		}
	}
}
