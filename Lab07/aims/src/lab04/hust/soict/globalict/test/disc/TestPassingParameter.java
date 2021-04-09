package lab04.hust.soict.globalict.test.disc;

import lab04.hust.soict.globalict.aims.media.DigitalVideoDisc;
import lab04.hust.soict.globalict.aims.media.Media;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		/*
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "  + jungleDVD.getTitle());
		*/
		System.out.println("Correct swapping:");
		jungleDVD = TestPassingParameter.correctSwap
				(cinderellaDVD, cinderellaDVD = jungleDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(Media dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd = new DigitalVideoDisc(oldTitle);
	}
	public static DigitalVideoDisc correctSwap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		return o1;
	}
}
