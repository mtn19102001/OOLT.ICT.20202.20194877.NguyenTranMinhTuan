package hust.soict.globalict.test.media;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.CompactDisc.Track;

public class TestMediaCompareTo {
	public static void main(String[] args) throws PlayerException {
		ArrayList <Media> collection = new ArrayList<Media>();
		Media dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 80, 19.95f);
		Media dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		Media dvd3 = new DigitalVideoDisc("Hercules",
				"Animation", "Ron Clements",20, 10.99f);
		Media dvd4 = new DigitalVideoDisc("Up",
				"Animation", "Pete Docter", 120, 20.99f);
		Media dvd5 = new DigitalVideoDisc("Snow White and the Seven Dwarfs",
				"Animation", "Walt Disney", 21, 30.79f);
		String name1 = "William Shakespeare";
		Book.addAuthors(name1);
		Media book1 = new Book("Romeo and Juliet", "Fiction", name1, 39.82f);
		Media book2 = new Book("Hamlet", "Fiction", name1, 49.98f);
		String name2 = "Stephen Hawking";
		Book.addAuthors(name2);
		Media book3 = new Book("A brief history of time", "Fiction", name2, 59.09f);
		Media book4 = new Book("Theory of everything", "Fiction", name2, 19.24f);
		String name3 = "Ernest Miller Hemingway";
		Book.addAuthors(name3);
		Media book5 = new Book("To Have and Have Not", "Fiction", name3, 24.01f);
		Media cd = new CompactDisc("Meteora", "Rock", "CORP", "Linking Park",48, 49.95f);
		CompactDisc cd1 = (CompactDisc) cd;
		Track song1 = cd1.new Track("Hit the floor", 10);
		Track song2 = cd1.new Track("Numb", 5);
		Track song3 = cd1.new Track("Lying from you", 4);
		cd1.addTracktoCD(cd1, song1, song2, song3);
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		collection.add(dvd4);
		collection.add(dvd5);
		collection.add(book1);
		collection.add(book3);
		collection.add(book4);
		collection.add(book2);
		collection.add(book5);
		collection.add(cd);
		float totalCost = 0;
		for(int i = 0; i < collection.size(); i ++) {
			if(collection.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) collection.get(i);
				dvd.play();
				totalCost += dvd.getCost();
			}else if(collection.get(i) instanceof CompactDisc) {
				CompactDisc cds = (CompactDisc) collection.get(i);
				cds.play();
				totalCost += cds.getCost();
			}else{
				Book book = (Book) collection.get(i);
				totalCost += book.getCost();
			}
		}
		System.out.println("Total Cost is: " + totalCost);
		System.out.println("-------------------------------------");
		System.out.println("The dvds currently in the order are: ");
		for(int i = 0; i < collection.size(); i++) {
			if(collection.get(i) instanceof DigitalVideoDisc) {
				System.out.println(collection.get(i).getTitle());
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("The books currently in the order are: ");
		for(int i = 0; i < collection.size(); i++) {
			if(collection.get(i) instanceof Book) {
				System.out.println(collection.get(i).getTitle());
			}
		}
		
		System.out.println("-------------------------------------");
		System.out.println("The dvds in the sorted order are: ");
		Collections.sort(collection);
		for(int i = 0; i < collection.size(); i++) {
			if(collection.get(i) instanceof DigitalVideoDisc) {
				System.out.println(collection.get(i).getTitle());
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("The books in the sorted order are: ");
		Collections.sort(collection);
		for(int i = 0; i < collection.size(); i++) {
			if(collection.get(i) instanceof Book) {
				System.out.println(collection.get(i).getTitle());
			}
		}
		System.out.println("-------------------------------------");
	}
}
