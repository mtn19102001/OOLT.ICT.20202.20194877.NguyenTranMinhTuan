package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import javafx.application.Platform;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	private FloatProperty totalCost = new SimpleFloatProperty(0f);
	private void calculateTotalCost(){
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				totalCost.setValue(0);
				for(Media item : itemsOrdered) {
					totalCost.setValue(totalCost.getValue() + item.getCost());
				}
			}

		});	
	}
	public FloatProperty getTotalCost() {
		return totalCost;
	}
	public int addMedia(Media media) {
		if(media == null) {
			return -1;
		}
		if(this.getItemsOrdered().size() + 1 > MAX_NUMBERS_ORDERED) {
			return -2;
		}
		if(this.getItemsOrdered().contains(media)) {
			return 0;
		}
		this.itemsOrdered.add(media);
		calculateTotalCost();
		return 1;
	}
	public void removeMedia(Media item){
		if(this.getItemsOrdered().size() == 0) {
			System.out.println("Cannot remove " + item.getTitle() + "from the cart");
		}else {
			if(this.getItemsOrdered().contains(item)) {
				this.itemsOrdered.remove(item);
				System.out.println(item.getTitle().toString() + " has been removed");
			}else {
				System.out.println("Cannot remove " + item.getTitle() + "from the cart");
			}
		}
		calculateTotalCost();
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
		System.out.println("---An order is created---");		
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
