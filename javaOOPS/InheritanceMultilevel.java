package javaOOPS;
//Multilevel Inheritance
class SuperClass{
	//super class states
	 String name ;
	 int roll;
	 //SuperClass No argument constructor
	 SuperClass(){
		System.out.println("SuperClass No argument constructor"); 
	 }
	//SuperClass parameterized constructor
	SuperClass(String name, int roll){
		System.out.println("SuperClass  No arg constructor");
		this. name = name;
		this. roll = roll;
		System.out.println("=============================");
	}
	
}
//inheriting SuperClass properties into SubClass
class SubClass extends SuperClass{
	 // SubClass No argument constructor
	SubClass(){
		 System.out.println("SubClass No argument constructor");
	 }
	//Subclass parameterized constructor
	SubClass(String name, int roll){
		this. name = name;
		this. roll = roll;
		System.out.println("SubClass  No arg constructor");
	}
}
//inheriting SubClass properties into InheritanceMultilevel
public class InheritanceMultilevel extends SubClass{

	public static void main(String[] args) {
		//create SubClass object to access SuperClass  Properties
		SubClass object = new SubClass("Dhoni",20);
		 SuperClass obj = new SuperClass("Raina",30);
		System.out.println("sub class Properties  are ");	 
		System.out.println(object.name);
		System.out.println(object.roll);
		System.out.println("========================");
		System.out.println("super class Properties  are ");
		System.out.println(obj.name);
		System.out.println(obj.roll);
		
	}

}
