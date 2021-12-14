package incrementOrDecrementoperator;

public class decreementOperator 
{
   public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("Before decrement operator : a = "+a+": b="+b);
	--a;//pre decrement
	--b;
	System.out.println("After pre decrement operator :a = "+a+": b = "+b);
	a--;//post decrement
	b--;
	System.out.println("After post decrement operator :a = "+a+": b = "+b);
	
 }
}
