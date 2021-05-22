package hust.soict.globalict.aims;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		Store anOrder = new Store();
		//Create new dvd objects and add them to the order
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.additem(dvd1);
		anOrder.additem(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.additem(dvd3);
		anOrder.removeitem(dvd2);
	}

}
