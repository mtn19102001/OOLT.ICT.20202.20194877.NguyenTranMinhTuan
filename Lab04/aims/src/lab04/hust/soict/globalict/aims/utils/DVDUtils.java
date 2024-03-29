package lab04.hust.soict.globalict.aims.utils;
import java.util.Arrays;
import java.util.Comparator;

import lab04.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class DVDUtils {
	public static int compareByCost(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(disc1.getCost() > disc2.getCost()) {
			return 1;
		}else if(disc1.getCost() < disc2.getCost()) {
			return -1;
		}else 
			return 0;
	}
	public static int compareByTitle(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		return disc1.getTitle().compareToIgnoreCase(disc2.getTitle());
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc ...disc) {
		Arrays.sort(disc, new Comparator<DigitalVideoDisc>() 
		{
			//ascending sort
			public int compare(DigitalVideoDisc disc1,DigitalVideoDisc disc2) 
			{
				return Float.valueOf(disc1.getCost()).compareTo(disc2.getCost());
			}
		});
		return disc;
	}
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc ...disc) {
		Arrays.sort(disc, new Comparator<DigitalVideoDisc>() 
		{
			//ascending sort
			public int compare(DigitalVideoDisc disc1,DigitalVideoDisc disc2) 
			{
				return String.valueOf(disc1.getTitle()).compareTo(disc2.getTitle());
			}
		});
		return disc;
	}
}
