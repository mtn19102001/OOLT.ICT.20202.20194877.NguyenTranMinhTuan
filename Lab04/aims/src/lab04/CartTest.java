package lab04;
import java.util.Scanner;
public class CartTest {

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "cccc", 1, 5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 1, 5f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 1, 7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 1, 3.3f);
		//sort by cost
		Scanner input = new Scanner(System.in);
		System.out.println("Sort by cost(descending order):");
		Cart.sortByCost(new DigitalVideoDisc[] {dvd1, dvd3, dvd4, dvd2, dvd5});
		//sort by title
		System.out.println("Sort by Title(descending order):");
		Cart.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd3, dvd4, dvd2, dvd5});
		//seachById
		System.out.println("Enter the id number you want to search: ");
		int id = input.nextInt();
		Cart.searchByID(id, new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		//displayCart
		Cart.displayCart(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		input.close();
	}
}
