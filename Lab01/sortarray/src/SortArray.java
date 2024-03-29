package sortarray.src;

import java.util.Arrays;
import java.util.Scanner;
public class SortArray
{
    public static void main(String[] args) 
    {
        int i,n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Original array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted array: "+Arrays.toString(a));
        System.out.println("Sum: "+sum);
        average = (float)sum / n;
        System.out.println("Average: "+average);
        s.close();
    }
}