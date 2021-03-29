package star;
import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of layers for the piramid: ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}	
		input.close();
	}
}
