package javaOOPS;
//Single level inheritance
class A{
	// class or static variable and 
	int num ;
	//default constructor
	A(){
		System.out.println("A class No arg constructor");
	}
	// parameterized constructor
	A(int num){
		num = 10;
		System.out.println("A class parameterized  constructor ");
		System.out.println("Local Variable of Constructor "+num);
	}
	void toDisplay(){
	  
	  System.out.println("I am a Super class(A) method");
	}
	
}
public class InheitanceExampleFirst extends A {

	public static void main(String[] args) {
		//create new object to access A class Properties
			A a = new A();
			//call the method which is inherited into InheitanceExampleFirst class
			a.toDisplay();
			System.out.println("============================================");
			// accessing the parameterized constructor
			new A(10);
			a.toDisplay();
	}

}
