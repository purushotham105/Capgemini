package javaOOPS;
 class MethodClass {
	 public static void staticMethod() {
			System.out.println("hello everyone");
			System.out.println("I am a static method");
		}
	    public void nonStaticMethod() {
	    	System.out.println("I am a non static method ");
	    }
}

public class MethodsStaticAndNonStatic {

	public static  void myStaticMethod() {
		System.out.println("you can access me by just calling my name ");
	}
	public void myNonStaticMethod() {
		System.out.println("you can access me by only creating object");
	}
	public static void main(String[] args) {
		
		MethodClass.staticMethod();//calls the static method without object creation
		
		MethodClass m = new MethodClass();
		m.nonStaticMethod();// calls the non static method in the above class after object creation
		
		myStaticMethod();
		// calling with out the object creation 
		
		MethodsStaticAndNonStatic m1 = new MethodsStaticAndNonStatic();
		m1.myNonStaticMethod();
		// calling after the object creation 
		
	}
	
}
