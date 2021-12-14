package letslearn;
import java.util.Scanner;
public class MultiplyOfTwoNumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter first number: ");
		int number_one=sc.nextInt(); 
		System.out.println("Enter second number: ");
		int number_two=sc.nextInt();
		int mul=number_one*number_two;
		System.out.println("Multiplication of two numbers is : " + mul);		
		
	}

}
