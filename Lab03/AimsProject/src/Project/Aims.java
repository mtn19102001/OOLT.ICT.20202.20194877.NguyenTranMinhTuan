package Project;
import javax.swing.JOptionPane;

//provide main method to interact
public class Aims {
	public static void main(String[] args) {
		//Create a new order
		Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the order
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.showCart();
		
		//print total cost of the order
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		//remove a dvd in the cart
		anOrder.removeDigitalVideoDisc(dvd3);
		anOrder.showCart();
		anOrder.totalCost = 0;
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		//user message
		//add
		Object[] option1 = {"Yes, I do!","No!"};
		int n = JOptionPane.showOptionDialog(
				null, "Do you want to add new DVD to the cart?",
				"An important question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				option1,
				option1[0]);
		switch(n) {
		case 0:
			String info[] = {"title", "category", "director", "length", "cost"};
			String dvdinfo[] = new String[5];
			for(int i = 0; i < info.length; i++) {
				dvdinfo[i] = JOptionPane.showInputDialog("Enter " + info[i]);
			}
			DigitalVideoDisc dvd = new DigitalVideoDisc(dvdinfo[0], dvdinfo[1],
					dvdinfo[2], Integer.parseInt(dvdinfo[3]), Float.parseFloat(dvdinfo[4]));
			anOrder.addDigitalVideoDisc(dvd);
			anOrder.showCart();
			System.exit(0);
			break;
		default:
			System.exit(0);
			break;
		}
	}
}
