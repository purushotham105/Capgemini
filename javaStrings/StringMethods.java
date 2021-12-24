package javaStrings;

public class StringMethods {

	public static void main(String[] args) {
		//CharAt() method 
		//it returns character when we specified particular index in a string
		String str = "Hello World Welcome";
		System.out.println(str);
		char c = str.charAt(2);
		System.out.println("character at 2 index is "+c);
		char d = str.charAt(7);
		System.out.println("character at 7 index is "+d);
		char e = str.charAt(0);
		System.out.println("character at 0 index is "+e);
		
		//equals() method
		String first = new String("A");
		String second = "a";
		System.out.println(first.equals(second));
		//equalsIgnoreCase() method
		System.out.println(first.equalsIgnoreCase(second));
		
		//compare() method
		// it prints 0 if the strings are same otherwise prints positive or negative number
		String third = "Hello guys";
		String fourth = "Hello Guys bye";
		String fifth = "Hello Guys bye";
		String sixth = "hello guys Bye";
		System.out.println(third.compareTo(fourth));
		System.out.println(fifth.compareTo(fourth));
		
		//compareIgnoreCase
		System.out.println(sixth.compareToIgnoreCase(fifth));
		
		//split()method
		//it splits a string into two parts based on the character we selected
		String s = "Apple&Banana";
		String st = "ABCD,EFGH,HIJK";
		String[] splitted = s.split("&");
		for(String splits : splitted)
		System.out.println(splits);
		// to print the splited string we need to use array and for loop
		String[] split = st.split(",");
		for(String string :split) {
		System.out.println(string);
		}
		
	}

}
