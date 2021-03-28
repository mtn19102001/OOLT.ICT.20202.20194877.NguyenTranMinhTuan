package HomeWork;
import java.util.Scanner;
public class SolveEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,a11,a12,a21,a22,b1,b2,x,y;
		
		System.out.print("Input number of degree: ");
		int deg = input.nextInt();
		switch(deg) {
		case 2:
			System.out.println("In the form ax^2+bx+c, input the coefficient: ");
			System.out.print("Input a: ");
            a = input.nextDouble();
            System.out.print("Input b: ");
            b = input.nextDouble();
            System.out.print("Input c: ");
            c = input.nextDouble();
			
            double result = b*b - 4.0*a*c;
            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }
			break;
		case 1:
			System.out.print("Input number of variables: ");
			int var = input.nextInt();
			input.nextLine();
			switch(var) {
			case 1:
				System.out.println("In the form ax+b=0, input the coefficient: ");
				System.out.print("a = ");
				a = input.nextDouble();
				System.out.print("b = ");
				b = input.nextDouble();
				if(a == 0) {
					System.out.println("The equation has no solution");
				}
				else {
					x = -b/a;
					System.out.println("x is " + x);
				}
				break;
			case 2:
				System.out.println("Input the coefficient in the form of"
						+ "a11x+a12y=b1\na21x+a22y=b2");
				System.out.print("a11 = ");
				a11 = input.nextDouble();
				System.out.print("a12 = ");
				a12 = input.nextDouble();
				System.out.print("b1 = ");
				b1 = input.nextDouble();
				System.out.print("a21 = ");
				a21 = input.nextDouble();
				System.out.print("a22 = ");
				a22 = input.nextDouble();
				System.out.print("b2 = ");
				b2 = input.nextDouble();
				if(a11*a22 - a21*a12 == 0) {
					if(b1%b2 == 0) 
						System.out.println("The equation has no solution.");
					else
						System.out.println("The equation has infinite solution");
				}
				else {
					x = (b1*a22 - a12*b2)/(a11*a22 - a21*a12);
					y = (a11*b2 - b1*a21)/(a11*a22 - a21*a12);
					System.out.println("x is "+ x +" and y is" + y);
				}
				break;
			}
			break;
		}
		input.close();
	}
}