package LamdaExpressions;
// must use interface for lambda Expressions
interface Lambda{
	public int method(int a, int b);
}

public class LamdaExp_one {

	public static void main(String[] args) {
		//Expression 1
		 Lambda object = (a,b)->(a+b);{
			 System.out.print("Sum is ");
			System.out.println(object.method(10,12));
		}
		//Expression 2
		 Lambda obj = (a,b)->(a*b);{
			 System.out.print("Multiplication is ");
			 System.out.println(obj.method(120,78));
		 }
		 //Expression 3
		 Lambda ob = (x,y)->(x-y);{
			 System.out.print("Substraction is ");
			 System.out.println(ob.method(37, 34));
		 }
	}

}
