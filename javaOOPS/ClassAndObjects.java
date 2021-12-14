package javaOOPS;

class UpperClass {
	int field1 = 10;
	int field2 = 20;
	public void method1() {
		System.out.println("I'm upperClass Method ");
	}
}
public class ClassAndObjects {

	public static void main(String[] args) {
		// creating the object to access the fields and methods present in the upper class
		UpperClass object= new UpperClass();
		//with reference of object variable we can print the fields
		System.out.println(object.field1);
		System.out.println(object.field2);
		// calling the method in upper class
		object.method1();
	}

}
