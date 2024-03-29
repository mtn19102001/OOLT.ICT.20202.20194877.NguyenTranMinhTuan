package hust.soict.globalict.aims.utils;
import java.util.Arrays;
import java.util.Comparator;

import hust.soict.globalict.aims.media.Media;

public class DVDUtils {
	public static int compareByCost(Media item1, Media item2) {
		if(item1.getCost() > item2.getCost()) {
			return 1;
		}else if(item1.getCost() < item2.getCost()) {
			return -1;
		}else 
			return 0;
	}
	public static int compareByTitle(Media item1, Media item2) {
		return item1.getTitle().compareToIgnoreCase(item2.getTitle());
	}
	public static Media[] sortByCost(Media ...item) {
		Arrays.sort(item, new Comparator<Media>() 
		{
			//ascending sort
			public int compare(Media item1,Media item2) 
			{
				return Float.valueOf(item1.getCost()).compareTo(item2.getCost());
			}
		});
		return item;
	}
	
	public static Media[] sortByTitle(Media ...item) {
		Arrays.sort(item, new Comparator<Media>() 
		{
			//ascending sort
			public int compare(Media item1,Media item2) 
			{
				return String.valueOf(item1.getTitle()).compareTo(item2.getTitle());
			}
		});
		return item;
	}
}
