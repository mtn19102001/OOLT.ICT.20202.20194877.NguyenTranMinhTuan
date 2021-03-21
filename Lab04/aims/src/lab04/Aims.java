package lab04;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

//provide main method to interact
public class Aims {
	public static void main(String[] args) {
		//test the LocalDate
		LocalDate date = LocalDate.now();
		System.out.println(date);
		//test the LocalDateTime
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		//Create a new order
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

		String info[] = {"title", "category", "director", "length", "cost"};
		String dvdinfo[] = new String[5];
		//command line interface
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of new dvds you want to add: ");
		int num = input.nextInt();
		input.nextLine();
		DigitalVideoDisc[] dvd = new DigitalVideoDisc[num];
		for(int i = 0; i < num; i++) {
			System.out.println("DVD " + (i+1));
			for(int j = 0; j < info.length; j++) {
				System.out.println("Enter " + info[j] + ":");
				dvdinfo[j] = input.nextLine();
			}
			dvd[i]= new DigitalVideoDisc(dvdinfo[0], dvdinfo[1],
					dvdinfo[2], Integer.parseInt(dvdinfo[3]), Float.parseFloat(dvdinfo[4]));
		}
		anOrder.addDigitalVideoDisc(dvd);
		anOrder.showCart();
		input.close();
	}
}
