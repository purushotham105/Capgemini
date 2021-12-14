package bitwiseopertors;

public class Bitwise 
{
   public static void main(String[] args) {
	   int a = 12;
	   int b = 14;
	   int result = a&b;
	   System.out.println("Bitwise ANDoperator:"+result);
	   result = a|b;
	   System.out.println("Bitwise ORoperator:"+result);
	   result = a^b;
	   System.out.println("Bitwise ^operator:"+result);
	   result = ~a;
	   System.out.println("Bitwise ~operator:"+result);
	   result = a<<2;
	   System.out.println("Bitwise leftshiftoperator:"+result);
	   result = a>>2;
	   System.out.println("Bitwise rightoperator:"+result);
  }

}
