package javaStrings;

public class StrringWithNewKeyword {

	public static void main(String[] args) {
		//Literals new Object 
		//using new keyword we can create strings in java
		String str = new String("Hello");
		//without using new keyword
		String st = "World";
		System.out.println("Using New keyword: "+str);
		System.out.println("Without using New keyword: "+st);
		
		//checking type of string
		//using getClass() and getSimpleNmae() will returns data type of variable
		System.out.println(str+" is "+str.getClass().getSimpleName()+" type");
		System.out.println(st+" is "+st.getClass().getSimpleName()+" type");
		
	}
}
