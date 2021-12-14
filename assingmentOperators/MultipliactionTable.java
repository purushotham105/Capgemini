package assingmentOperators;

import java.util.Scanner;

public class MultipliactionTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number you want");
		//takes the input from the user
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=10;i++)//loop will execute 10 times
		{
			System.out.println(num+"*"+i +" = "+(num*i));
		}
				

	}

}
