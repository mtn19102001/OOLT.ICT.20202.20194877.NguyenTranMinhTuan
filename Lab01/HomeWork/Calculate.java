package HomeWork;
import java.util.Scanner;
public class Calculate{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double sum;
		double product;
		double difference;
		double quotient;
		double remainder;
		
		System.out.print("Enter first number: ");
		num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		
		sum = num1 + num2;
		product = num1 * num2;
		difference = num1 - num2;
		quotient = num1/num2;
		remainder = num1%num2;
		System.out.print("Sum is: ");
		System.out.println(sum);
		System.out.print("Difference is: ");
		System.out.println(difference);
		System.out.print("Product is: ");
		System.out.println(product);
		System.out.print("Quotient is: ");
		System.out.println(quotient);
		System.out.print("Remainder is: ");
		System.out.println(remainder);
		input.close();
	}
}