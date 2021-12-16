package javaOOPS;
//Hierarchical inheritance 
public class SupClass {
		//sup class states
		 String name ;
		 int roll;
		 //Super Class No argument constructor
		 SupClass(){
			System.out.println("Super Class No argument constructor"); 
		 }
		//Super Class parameterized constructor
		SupClass(String name, int roll){
			System.out.println("Super Class  No arg constructor");
			this. name = name;
			this. roll = roll;
		}

}
