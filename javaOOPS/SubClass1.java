package javaOOPS;
//Hierarchical inheritance 
 class SubClass1 extends SupClass {
	//inheriting Super Class properties into SubClass1
		
		public static void main(String[] args) {
			SupClass ob = new SupClass("Ramesh",320);
			System.out.println(ob.name);
			System.out.println(ob.roll);
		}
}

class SubClass2  extends SupClass{

	//inheriting Super Class properties into SubClass2
		 
		public static void main(String[] args) {
			SupClass obj = new SupClass("Suresh",420);
			System.out.println(obj.name);
			System.out.println(obj.roll);
		}
}

