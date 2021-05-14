package lab04.hust.soict.globalict.test.book;
import java.util.ArrayList;
import java.util.Scanner;

import lab04.hust.soict.globalict.aims.media.Book;
import lab04.hust.soict.globalict.aims.media.Media;
public class BookTest {
	public static void main(String[] args) {
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
		System.out.println("Enter the content for " + title1 + ": ");
		String content1 = input.nextLine();
		System.out.println("Enter the content for " + title2 + ": ");
		String content2 = input.nextLine();
		System.out.println("Enter the content for " + title3 + ": ");
		String content3 = input.nextLine();
		System.out.println("Enter the content for " + title4 + ": ");
		String content4 = input.nextLine();
		System.out.println("Enter the content for " + title5 + ": ");
		String content5 = input.nextLine();
		System.out.println("Enter the content for " + title6 + ": ");
		String content6 = input.nextLine();
		System.out.println("Enter the content for " + title7 + ": ");
		String content7 = input.nextLine();
		System.out.println("Enter the content for " + title8 + ": ");
		String content8 = input.nextLine();
		System.out.println("Enter the content for " + title9 + ": ");
		String content9 = input.nextLine();
		System.out.println("Enter the content for " + title10 + ": ");
		String content10 = input.nextLine();
		input.close();
		ArrayList <Media> collection = new ArrayList<Media>();
		String name1 = "William Shakespeare";
		Book.addAuthors(name1);
		Media book1 = new Book(title1, "Fiction", name1, content1, 39.82f);
		Media book2 = new Book(title2, "Fiction", name1, content2, 49.98f);
		String name2 = "Stephen Hawking";
		Book.addAuthors(name2);
		Media book3 = new Book(title3, "Fiction", name2, content3, 59.09f);
		Media book4 = new Book(title4, "Fiction", name2, content4, 19.24f);
		String name3 = "Ernest Miller Hemingway";
		Book.addAuthors(name3);
		Media book5 = new Book(title5, "Fiction", name3, content5, 24.01f);
		Media book6 = new Book(title6, "Literary Fiction", name3, content6, 19.25f);
		String name4 = "Charles Dickens";
		Book.addAuthors(name4);
		Media book7 = new Book(title7, "Short novel", name4, content7, 12.25f);
		Media book8 = new Book(title8, "Novel", name4, content8, 16.67f);
		String name5 = "Jane Austen";
		Media book9 = new Book(title9, "Romantic novel", name5, content9, 25.24f);
		Media book10 = new Book(title10, "Romantic novel", name5, content10, 20.21f);
		collection.add(book1);
		collection.add(book2);
		collection.add(book3);
		collection.add(book4);
		collection.add(book5);
		collection.add(book6);
		collection.add(book7);
		collection.add(book8);
		collection.add(book9);
		collection.add(book10);
		for(int i = 0; i < collection.size(); i ++) {
			System.out.println(collection.get(i).getDetail());
		}
		System.out.println("The program will now terminate");
	}
}
