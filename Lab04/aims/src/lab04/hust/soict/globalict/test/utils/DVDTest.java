package lab04.hust.soict.globalict.test.utils;
import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import lab04.hust.soict.globalict.aims.utils.DVDUtils;

public class DVDTest {

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "cccc", 1, 5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 1, 5f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 1, 7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 1, 3.3f);
		
		if(DVDUtils.compareByCost(dvd1, dvd2) == 1) {
			System.out.println(dvd1.getTitle() + " costs more than " + dvd2.getTitle());
		}else if(DVDUtils.compareByCost(dvd1, dvd2) == -1) {
			System.out.println(dvd1.getTitle() + " costs less than " + dvd2.getTitle());
		}else {
			System.out.println(dvd1.getTitle() + " costs the same as " + dvd2.getTitle());
		}
		if(DVDUtils.compareByTitle(dvd1, dvd2) > 0) {
			System.out.println(dvd1.getTitle() + " is lexicographically greater than " + dvd2.getTitle());
		}else if(DVDUtils.compareByTitle(dvd1, dvd2) < 0) {
			System.out.println(dvd1.getTitle() + " is lexicographically less than " + dvd2.getTitle());
		}else {
			System.out.println(dvd1.getTitle() + " is equal to " + dvd2.getTitle());
		}
		
		DigitalVideoDisc[] sorted = DVDUtils.sortByCost(new DigitalVideoDisc[] {dvd1, dvd3, dvd4, dvd2, dvd5});
		System.out.println("sort by cost: ");
		for(int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].getDetail());
		}
		sorted = DVDUtils.sortByTitle(new DigitalVideoDisc[] {dvd1, dvd3, dvd4, dvd2, dvd5});
		System.out.println("sort by title: ");
		for(int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i].getDetail());
		}
	}
}
