package lab04.hust.soict.globalict.aims;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		Store anOrder = new Store();
		//Create new dvd objects and add them to the order
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDVD(dvd1);
		anOrder.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDVD(dvd3);
		anOrder.removeDVD(dvd2);
	}

}
