package letslearn;
import java.util.Scanner;
public class CalculatorSwitchCase {

	public static void main(String[] args) {
		char operator;
		double fnum,snum,result;
		Scanner sc = new Scanner(System.in);
		//create a new object of scanner class
		
		System.out.println("Enter the first number");
		fnum = sc.nextDouble();
		//takes first number from user
		System.out.println("Enter the second number");
		snum = sc.nextDouble();
		//takes second number from user
		
		System.out.println("Choose the operation symbol : +,-,*,%");
		operator = sc.next().charAt(0);
		//takes opertion to perform from user
		
		switch (operator) {
		
		case '+': result = fnum+snum;
			System.out.println("Addition of two numbers is : "+result);
			break;// this case provides addition operation
		case '-': result = fnum-snum;
		System.out.println("Subtraction of two numbers is : "+result);
			break;// this case provides subtraction operation
		case '*': result = fnum*snum;
		System.out.println("Multiplication of two numbers is : "+result);
			break;// this case provides multiplication operation
		case '%': result = fnum%snum;
		System.out.println("Division of two numbers is : "+result);
			break;// this case provides division operation
		default:
			System.out.println(" You had choosen invalid Operator");
			break;
		}
	}

}
