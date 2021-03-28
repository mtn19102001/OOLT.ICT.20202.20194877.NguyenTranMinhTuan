package displaydays.src;

import java.util.Scanner;
public class DisplayNoDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number_Of_Days = 0;
		String invalid = "Invalid month";
		
		System.out.println("Enter a year("
				+ "in a non-negative number and enter all the digits): ");
		while(!input.hasNextLong()) {
			System.out.println("Enter a correct year! ");
			input.next();
		}
		int yearTest = input.nextInt();
		if(yearTest < 0) {
			System.out.println("Enter a correct year! ");
			input.next();
		}
		int year = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a month("
				+ "in its full name, abbreviation, in 3 letters, or in number): ");
		String month = input.nextLine();
		
		boolean leapYear = 
				(year % 4 == 0 && year %100 !=0) || (year % 400 ==0);
		switch(month) 
		{
		case "1": case "January": case "Jan": case "Jan.":
		case "3": case "March": case "Mar.": case "Mar":
		case "5": case "May":
		case "7": case "July": case "Jul":
		case "8": case "August": case "Aug.": case "Aug":
		case "10": case "October": case "Oct.": case "Oct":
		case "12": case "December": case "Dec.": case "Dec":
			number_Of_Days = 31;
			break;	
		case "4": case "April": case "Apr": case "Apr.":
		case "6": case "June": case "Jun":	
		case "9": case "September": case "Sept.": case "Sep":
		case "11": case "November": case "Nov.": case "Nov":
			number_Of_Days = 30;
			break; 	
		case "2": case "February": case "Feb.": case "Feb":
			if(leapYear)
				number_Of_Days = 28;
			else
				number_Of_Days = 29;
			break;
		default: 
			month = invalid;
			break;
		}
		if(month != invalid)
			System.out.println(month + " " + year + " has " + number_Of_Days + " days");
		else
			System.out.println(invalid);
		
		input.close();
	}
}
