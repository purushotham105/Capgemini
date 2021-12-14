package assingmentOperators;
import java.util.Scanner;
public class assingmentoperatorDynamically 
{
   public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number ");
	int a = sc.nextInt();
	System.out.println("Before assingment operator :"+a);
	a+=a;//a=a+a
	System.out.println("After +=assingment operator :"+a);
	a-=a;//a=a-a;
	System.out.println("After -=assingment operator :"+a);
	a*=a;//a=a*a;
	System.out.println("After *=assingment operator :"+a);
	System.out.println("Enter the number again ");
	// exception error that is cannot divide a number by zero(/by zero)
	int b = sc.nextInt();
	b/=b;//b=b/b;
	System.out.println("After /=assingment operator :"+b);
	b%=b;//b=b%b;
	System.out.println("After +=assingment operator :"+b);
 }
}
