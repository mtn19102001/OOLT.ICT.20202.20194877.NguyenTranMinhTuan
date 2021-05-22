package hust.soict.globalict.aims;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
public class Aims {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame();
		Store listofitem = new Store();
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the order
		Media dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		Media dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		Media dvd3 = new DigitalVideoDisc("Hercules",
				"Animation", "Ron Clements", 10.99f);
		Media dvd4 = new DigitalVideoDisc("Up",
				"Animation", "Pete Docter", 120, 20.99f);
		Media dvd5 = new DigitalVideoDisc("Snow White and the Seven Dwarfs",
				"Animation", "Walt Disney", 30.79f);
		Media dvd6 = new DigitalVideoDisc("Toy Story 2",
				"Animation", "John Lasseter", 150, 20.16f);
		Media dvd7 = new DigitalVideoDisc("Wall-E",
				"Animation", "Andrew Stanton", 120, 20.21f);
		Media dvd8 = new DigitalVideoDisc("2001: A Space Odyssey",
				"Science Fiction", "Stanley Cubrick", 164, 49.99f);
		Media dvd9 = new DigitalVideoDisc("Twin Peaks",
				"Mystery", "David Lynch", 78.99f);
		Media dvd10 = new DigitalVideoDisc("Million Dollar Baby",
				"Drama", "Clint EastWood", 133, 18.99f);
		listofitem.additem(dvd1);
		listofitem.additem(dvd2);
		listofitem.additem(dvd3);
		listofitem.additem(dvd4);
		listofitem.additem(dvd5);
		listofitem.additem(dvd6);
		listofitem.additem(dvd7);
		listofitem.additem(dvd8);
		listofitem.additem(dvd9);
		listofitem.additem(dvd10);
		Scanner input = new Scanner(System.in);
		String title1 = "Romeo and Juliet";
		String title2 = "Hamlet";
		String title3 = "A brief history of time";
		String title4 = "Theory of everything";
		String title5 = "To Have and Have Not";
		String title6 = "The Old Man and the Sea";
		String title7 = "A Christmas Carol";
		String title8 = "Oliver Twist";
		String title9 = "Pride and Prejudice";
		String title10 = "Sense and Sensibility";
		String content1 = "his her her his their them they";
		String content2 = "I you her his they she her him";
		String content3 = "I you we they he she it her him it I";
		String content4 = "I you her they them his you";
		String content5 = "you I you he him she him her she";
		String content6 = "her you I him her I";
		String content7 = "you them they them you your";
		String content8 = "you your you your I his";
		String content9 = "he she it I you he she I him her";
		String content10 = "she her I you they them they she";
		String name1 = "William Shakespeare";
		Book.addAuthors(name1);
		Media book1 = new Book(title1, "Fiction", name1, content1, 39.82f);
		Media book2 = new Book(title2, "Fiction", name1, content2, 49.98f);
		String name2 = "Stephen Hawking";
		Book.addAuthors(name2);
		Media book3 = new Book(title3, "Fiction", name2, content3, 59.09f);
		Media book4 = new Book(title4, "Fiction", name2, content4, 39.24f);
		String name3 = "Ernest Miller Hemingway";
		Book.addAuthors(name3);
		Media book5 = new Book(title5, "Fiction", name3, content5, 54.01f);
		Media book6 = new Book(title6, "Literary Fiction", name3, content6, 49.25f);
		String name4 = "Charles Dickens";
		Book.addAuthors(name4);
		Media book7 = new Book(title7, "Short novel", name4, content7, 52.25f);
		Media book8 = new Book(title8, "Novel", name4, content8, 56.67f);
		String name5 = "Jane Austen";
		Media book9 = new Book(title9, "Romantic novel", name5, content9, 45.24f);
		Media book10 = new Book(title10, "Romantic novel", name5, content10, 60.21f);
		listofitem.additem(book1);
		listofitem.additem(book2);
		listofitem.additem(book3);
		listofitem.additem(book4);
		listofitem.additem(book5);
		listofitem.additem(book6);
		listofitem.additem(book7);
		listofitem.additem(book8);
		listofitem.additem(book9);
		listofitem.additem(book10);
		Media cd1 = new CompactDisc("Meteora", "Rock", "CORP", "Linking Park",-48, 109.95f);
		Media cd2 = new CompactDisc("Hybrid Theory", "Rock", "MSC", "Linking Park",-50, 139.03f);
		Media cd3 = new CompactDisc("Thriller", "Pop, Disco, Funk", "Epic", "Micheal Jackson",-28, 159.84f);
		Media cd4 = new CompactDisc("Bad", "Pop, Rock, Funk", "Epic", "Michael Jackson",18, 249.95f);
		Media cd5 = new CompactDisc("Whenever You Need Somebody", "Pop, Dance Pop", "RCA Records", "Rick Astley",36, 153.99f);
		Media cd6 = new CompactDisc("...Baby One More Time", "Pop, Dance Pop", "JIVE", "Britney Spear",20, 160.14f);
		Media cd7 = new CompactDisc("Oops!... I Did It Again", "Pop, Dance Pop", "JIVE", "Britney Spear",18, 156.93f);
		listofitem.additem(cd1);
		listofitem.additem(cd2);
		listofitem.additem(cd3);
		listofitem.additem(cd4);
		listofitem.additem(cd5);
		listofitem.additem(cd6);
		listofitem.additem(cd7);
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
					case 1: // See an item's detail
						System.out.println("Enter the id number of the item:");
						int num0  = input.nextInt();
						Media item = listofitem.searchByID(num0);
						Object[] optionx = {"Yes, I do!","No!"};
						int m = JOptionPane.showOptionDialog(
								frame, "Do you want to play this item?",
								"An important question",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								optionx,
								optionx[0]);
						switch(m) {
						case 0:
							try {
								listofitem.play(num0);
							}catch(PlayerException e) {
								JOptionPane.showMessageDialog(frame, e.getMessage(), "Illigal Media length", JOptionPane.ERROR_MESSAGE );
								throw e;
							}
							break;
						default:
							break;
						}
						Object[] optiony = {"Yes, I do!","No!"};
						int n = JOptionPane.showOptionDialog(
								frame, "Do you want to add this DVD to the cart?",
								"An important question",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null,
								optiony,
								optiony[0]);
						switch(n) {
						case 0:
							anOrder.addMedia(item);
							break;
						default:
							break;
						}
						break;
					case 2: // Add an item to cart
						System.out.println("Enter the id of the item:");
						int num1  = input.nextInt();
						Media item1 = listofitem.searchByID(num1);
						try {
							listofitem.play(num1);
						}catch(PlayerException e) {
							JOptionPane.showMessageDialog(frame, e.getMessage(), "Illigal media length", JOptionPane.ERROR_MESSAGE);
							throw e;
						}
						anOrder.addMedia(item1);
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
								System.out.println("3. Exit.");
								System.out.println("Please enter your choice:");
								suboption1 = input.nextInt();
									switch(suboption1) {
									case 1:								
										System.out.println("Enter the id number:");
										int num3  = input.nextInt();
										try {
											anOrder.play(num3);
										}catch(PlayerException e) {
											JOptionPane.showMessageDialog(frame, e.getMessage(), "Illigal media length!", JOptionPane.ERROR_MESSAGE);
											throw e;
										}
										break;
									case 2:
										System.out.println("Enter the title:");
										String s = input.next();
										anOrder.searchByTitle(s);
										break;
									case 3: 
										break;
									}
							}while(suboption1 == 1 || suboption1 == 2);
							break;
						case 2:// Sort media in cart
							System.out.println("1. By title");
							System.out.println("2. By cost");
							System.out.println("3. Quit");
							System.out.println("Enter the choice here: ");
							int num3 = input.nextInt();
							switch(num3) {
							case 1:
								anOrder.sortMediabyTitleCost();
								break;
							case 2:
								anOrder.sortMediabyCostTitle();
								break;
							case 3:
								break;
							}
							break;
						case 3:// Remove media from cart
							System.out.println("Enter the dvd id you want to remove: ");
							int num4  = input.nextInt();
							Media item2 = listofitem.searchByID(num4);
							anOrder.removeMedia(item2);
							break;
						case 4: // get a lucky item from cart
							Media freeItem = anOrder.getAluckyitem();
							System.out.println("You get a free lucky item: " + freeItem.getDetail());
							break;
						case 5:
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
				int p = JOptionPane.showOptionDialog(
						frame, "How do you want to update?",
						"An important question",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						option4,
						option4[0]);
				switch(p) {
				case 0:
					String info[] = {"title", "category", "director", "length", "cost"};
					String dvdinfo[] = new String[5];
					for(int i = 0; i < info.length; i++) {
						dvdinfo[i] = JOptionPane.showInputDialog("Enter " + info[i]);
					}
					DigitalVideoDisc newdvd = new DigitalVideoDisc(dvdinfo[0], dvdinfo[1],
							dvdinfo[2], Integer.parseInt(dvdinfo[3]), Float.parseFloat(dvdinfo[4]));
					listofitem.additem(newdvd);
					break;
				//remove
				case 1:
					String dvdinfo1 = new String();
						dvdinfo1 = JOptionPane.showInputDialog("Enter the DVD's ID :");
					listofitem.removeitem(Integer.parseInt(dvdinfo1));
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
					System.out.println("1. By title");
					System.out.println("2. By cost");
					System.out.println("3. Quit");
					System.out.println("Enter the choice here: ");
					int num3 = input.nextInt();
					switch(num3) {
					case 1:
						anOrder.sortMediabyTitleCost();
						break;
					case 2:
						anOrder.sortMediabyCostTitle();
						break;
					case 3:
						break;
					}
					break;
				case 3:// Remove dvd from cart
					System.out.println("Enter the dvd id you want to remove: ");
					int id  = input.nextInt();
					Media item2 = listofitem.searchByID(id);
					anOrder.removeMedia(item2);
					break;
				case 4:
					Media freeItem = anOrder.getAluckyitem();
					System.out.println("You get a free lucky item: " + freeItem.getDetail());
					break;
				case 5:
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
		MemoryDaemon memory = new MemoryDaemon();
		memory.run();
	}
}
