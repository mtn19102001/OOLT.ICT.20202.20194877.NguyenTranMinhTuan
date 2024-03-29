package lab04.hust.soict.globalict.aims;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lab04.hust.soict.globalict.aims.cart.Cart;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class Aims {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Store listofdisc = new Store();
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the order
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Hercules",
				"Animation", "Ron Clements", 10.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Up",
				"Animation", "Pete Docter", 120, 20.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Walt Disney",
				"Animation", "Snow White and the Seven Dwarfs", 30.79f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Toy Story 2",
				"Animation", "John Lasseter", 150, 20.16f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Wall-E",
				"Animation", "Andrew Stanton", 120, 20.21f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("2001: A Space Odyssey",
				"Science Fiction", "Stanley Cubrick", 164, 49.99f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Twin Peaks",
				"Mystery", "David Lynch", 78.99f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Million Dollar Baby",
				"Drama", "Clint EastWood", 133, 18.99f);
		listofdisc.addDVD(dvd1);
		listofdisc.addDVD(dvd2);
		listofdisc.addDVD(dvd3);
		listofdisc.addDVD(dvd4);
		listofdisc.addDVD(dvd5);
		listofdisc.addDVD(dvd6);
		listofdisc.addDVD(dvd7);
		listofdisc.addDVD(dvd8);
		listofdisc.addDVD(dvd9);
		listofdisc.addDVD(dvd10);
		Scanner input = new Scanner(System.in);
		int option1, option2, option3, suboption1;
		do{
			Store.showMenu();
			option1 = input.nextInt();
			switch(option1) {
			case 0: 
				System.out.println("-----The program is terminated!-----");
				break;
			case 1: // View store
				do {
					Store.storeMenu();
					option2 = input.nextInt();
					switch(option2) {
					case 1: // See a DVD's detail
						System.out.println("Enter the id number of the DVD:");
						int num1  = input.nextInt();
						DigitalVideoDisc disc = listofdisc.searchByID(num1);
						Object[] optionx = {"Yes, I do!","No!"};
						int m = JOptionPane.showOptionDialog(
								frame, "Do you want to add this DVD to the cart?",
								"An important question",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								optionx,
								optionx[0]);
						switch(m) {
						case 0:
							anOrder.addDigitalVideoDisc(disc);
							break;
						default:
							break;
						}
						break;
					case 2: // Add a dvd to cart
						System.out.println("Enter the id of the DVD:");
						int num2  = input.nextInt();
						DigitalVideoDisc disc1 = listofdisc.searchByID(num2);
						anOrder.addDigitalVideoDisc(disc1);
						System.out.println("The number of DVDs in the current cart: " + anOrder.getQtyOrdered());
						break;
					case 0:
						break;
					case 3:// See current cart
						Store.cartMenu();
						option3 = input.nextInt();
						switch(option3) {
						case 1:// Filter media in cart
							do{
								System.out.println("1. By id.");
								System.out.println("2. By title.");
								System.out.println("Please enter your choice:");
								suboption1 = input.nextInt();
									switch(suboption1) {
									case 1:
										System.out.println("Enter the id number:");
										int id  = input.nextInt();
										anOrder.searchByID(id);
										break;
									case 2:
										System.out.println("Enter the title:");
										String s = input.next();
										anOrder.searchByTitle(s);
										break;
									}
							}while(suboption1 == 1 || suboption1 == 2);
							break;
						case 2:// Sort media in cart
							do{
								System.out.println("1. By title.");
								System.out.println("2. By cost.");
								System.out.println("Please enter your choice:");
								suboption1 = input.nextInt();
									switch(suboption1) {
									case 1:
										anOrder.sortByTitle();
										break;
									case 2:
										anOrder.sortByCost();
										break;
									}
							}while(suboption1 == 1 && suboption1 == 2);
							break;
						case 3:// Remove dvd from cart
							System.out.println("Enter the dvd id you want to remove: ");
							int id  = input.nextInt();
							DigitalVideoDisc dvd = listofdisc.searchByID(id);
							anOrder.removeDigitalVideoDisc(dvd);
							break;
						case 4:
							//remove everything from the cart
							anOrder.clear();
							System.out.println("---An order is created---");
							break;
						case 0:
							break;
						}
					}
				}while(option2 != 0);
				break;
			case 2: // Update store
				//add 
				Object[] option4 = {"I want to add","I want to remove"};
				int m = JOptionPane.showOptionDialog(
						frame, "How do you want to update?",
						"An important question",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						option4,
						option4[0]);
				switch(m) {
				case 0:
					String info[] = {"title", "category", "director", "length", "cost"};
					String dvdinfo[] = new String[5];
					for(int i = 0; i < info.length; i++) {
						dvdinfo[i] = JOptionPane.showInputDialog("Enter " + info[i]);
					}
					DigitalVideoDisc newdvd = new DigitalVideoDisc(dvdinfo[0], dvdinfo[1],
							dvdinfo[2], Integer.parseInt(dvdinfo[3]), Float.parseFloat(dvdinfo[4]));
					listofdisc.addDVD(newdvd);
					break;
				//remove
				case 1:
					String dvdinfo1 = new String();
						dvdinfo1 = JOptionPane.showInputDialog("Enter the DVD's ID :");
					listofdisc.removeDVD(Integer.parseInt(dvdinfo1));
					break;
				}
				break;
			case 3:
				Store.cartMenu();
				option3 = input.nextInt();
				switch(option3) {
				case 1:// Filter media in cart
					do{
						System.out.println("1. By id.");
						System.out.println("2. By title.");
						System.out.println("Please enter your choice:");
						suboption1 = input.nextInt();
						while(suboption1 != 1 && suboption1 != 2) {
							switch(suboption1) {
							case 1:
								System.out.println("Enter the id number:");
								int id  = input.nextInt();
								anOrder.searchByID(id);
								break;
							case 2:
								System.out.println("Enter the title:");
								String s = input.next();
								anOrder.searchByTitle(s);
								break;
							}
						}
					}while(suboption1 != 1 && suboption1 != 2);
					break;
				case 2:// Sort media in cart
					do{
						System.out.println("1. By title.");
						System.out.println("2. By cost.");
						System.out.println("Please enter your choice:");
						suboption1 = input.nextInt();
						while(suboption1 != 1 && suboption1 != 2) {
							switch(suboption1) {
							case 1:
								anOrder.sortByTitle();
								break;
							case 2:
								anOrder.sortByCost();
								break;
							}
						}
					}while(suboption1 != 1 && suboption1 != 2);
					break;
				case 3:// Remove dvd from cart
					System.out.println("Enter the dvd id you want to remove: ");
					int id  = input.nextInt();
					DigitalVideoDisc dvd = listofdisc.searchByID(id);
					anOrder.removeDigitalVideoDisc(dvd);
					break;
				case 4:
					//remove everything from the cart
					anOrder.clear();
					System.out.println("---An order is created---");
					break;
				case 0:
					break;
				}
				break;
			}
		}while(option1 != 0);
		input.close();
	}
}
