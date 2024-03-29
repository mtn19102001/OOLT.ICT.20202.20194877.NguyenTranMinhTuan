package lab04.hust.soict.globalict.aims;
import java.util.Scanner;

import lab04.hust.soict.globalict.aims.cart.Cart;
import lab04.hust.soict.globalict.aims.media.DigitalVideoDisc;
public class DiscTest {
	public static void main(String[] args) {
		//Create a new order
		Scanner input = new Scanner(System.in);
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the order
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd1, dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addMedia(dvd3);
		System.out.println("Enter the key to search: ");
		String s = input.next();
		anOrder.searchByTitle(s);
		input.close();
	}
}
