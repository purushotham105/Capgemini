package letslearn;

import java.util.Scanner;

public class CalculatorUsingMethods {
	// this method will calculate the value we needed based on the operation
	public static void calculate(double num_1, double num_2 , char choice) {
		switch (choice) {
		case 'a':System.out.println("Addtion is "+(num_1+num_2));
			break;
		case 's':System.out.println("Subtraction is "+ (num_1-num_2));
		break;
		case 'm':System.out.println("Multiplication is "+(num_1*num_2));
		break;
		case 'd':System.out.println("Division is "+(num_1/num_2));
		break;
		case 'r':System.out.println("Remainder after division is "+(num_1%num_2));
		break;
		
		default:System.out.println("Invalid Choice");
			break;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int num_1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num_2 = sc.nextInt();
		System.out.println("Enter the choice as a - addition / s - substraction / m - multiplication / d - division / r - remainder or modulus");
		char choice = sc.next().charAt(0);
		//calling the calculate method and passing the parameters needed
		calculate(num_1,num_2, choice);
		sc.close();
	}

}
