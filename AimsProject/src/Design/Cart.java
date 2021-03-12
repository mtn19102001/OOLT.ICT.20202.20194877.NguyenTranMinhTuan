package Design;
import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED =10;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	public int qtyOrdered;
	public float totalCost;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			if(this.itemsOrdered.add(disc) == true)
				System.out.println("The disc has been added");
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
				System.out.println("The disc has been removed");
			this.setQtyOrdered(this.itemsOrdered.size());
		}
	}
	
	public float totalCost(){
		for(int i = 0; i < this.itemsOrdered.size(); i++) {
			totalCost += this.itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}	
}
