package assingmentOperators;

import java.util.Scanner;
public class SumAndAverage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range that you want ");
		//takes the range input from the user 
		int range = sc.nextInt();
		int sum = 0;
		double average = 0;
		for(int i = 0;i<=range;i++)
		{
			sum=sum+i;// provides the sum of each time depending on the range
			average = sum/range;//provides the average each time depending on the range 
		}
		System.out.println("The sum of the "+range+" natural numbers is "+sum);
		System.out.println("The average of the "+range+" natural numbers is "+average);
	}

}
