package javaOOPS;

class D  {
	int num = 100;
	D(){
		System.out.println("Super class constructor ");
	}
	void disp() {
		System.out.println("num value in D class is "+num);
	}
}
class X extends D {
	X(){
		System.out.println("X class constructor ");
	}
	void disp() {
		System.out.println("num value in X class is "+num);
	}
}

//=============upto here is Hierarchial Inheritance===============
//==============now comes single inheritance that is HybridizationInheritance class extends from B class
// this combination of two are more inheritances is called "Hybridization inheritance"

public class HybridizationInheritance extends B{
	
		public static void main(String[] args) {
			B b =new B();
			b.view();
			b.disp();
			
		}
 }

