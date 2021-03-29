package addmatrices.src;

import java.util.Scanner;

public class AddTwoMatrices {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter number of rows of matrix: ");
		m = s.nextInt();
		System.out.println("Enter number of columns of matrix: ");
		n = s.nextInt();
		
		int array1[][] = new int[m][n];
		int array2[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Enter elements of the first matrix:");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				array1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter elements of the second matrix: ");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				array2[i][j] = s.nextInt();
			}
		}
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
			}
		}
		System.out.println("Sum of two matrices is: ");
		
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
