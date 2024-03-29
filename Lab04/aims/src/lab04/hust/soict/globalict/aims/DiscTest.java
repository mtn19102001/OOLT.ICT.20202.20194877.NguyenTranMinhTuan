package lab04.hust.soict.globalict.aims;
import java.util.Scanner;

import lab04.hust.soict.globalict.aims.cart.Cart;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;
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
		anOrder.addDigitalVideoDisc(dvd1, dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.showCart();
		System.out.println("Enter the key to search: ");
		String s = input.next();
		anOrder.searchByTitle(s);
		input.close();
	}
}
