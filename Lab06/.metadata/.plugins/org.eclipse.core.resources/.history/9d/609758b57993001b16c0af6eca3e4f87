package lab04.hust.soict.globalict.test.cart;
import java.util.Scanner;

import lab04.hust.soict.globalict.aims.cart.Cart;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class CartTest {

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "cccc", 1, 5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 1, 5f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 1, 7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 1, 3.3f);
		//sort by cost
		Cart anOrder = new Cart();
		Scanner input = new Scanner(System.in);
		System.out.println("Sort by cost(descending order):");
		anOrder.sortByCost();
		//sort by title
		System.out.println("Sort by Title(descending order):");
		anOrder.sortByTitle();
		//seachById
		System.out.println("Enter the id number you want to search: ");
		int id = input.nextInt();
		anOrder.searchByID(id);
		//displayCart
		Cart.displayCart(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		input.close();
	}
}
