package letslearn;
import java.util.Scanner;
public class CalculatorUsingIfElse 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int fnum,snum;
	char choose;
	System.out.println("Enter the first number");
	fnum = sc.nextInt();
	System.out.println("Enter the second number");
	snum = sc.nextInt();
	System.out.println("Enter the Operation /a/m/s/d");
	choose = sc.next().charAt(0);
	if(choose=='a')
	{
		System.out.println("Addition is : "+(fnum+snum));
	}
	else if(choose=='m')
	{
		System.out.println("Multiplication is: "+(fnum*snum));
	}
	else if(choose=='s')
	{
		System.out.println("Subtraction is: "+(fnum-snum));
	}
	else if(choose=='d')
	{
		System.out.println("Division is: "+(fnum/snum));
	}
	else
	{
		System.out.println("Invalid operation");
	}
  }
  
}
