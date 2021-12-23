package linkedList;

import java.util.LinkedList;

public class GetAndSetMethodsLinkedList {

	public static void main(String[] args) {
		LinkedList<String> Lin = new LinkedList<String>();
		Lin.add("Samasung");
		Lin.add("Iphone");
		Lin.add("OnePlus");
		Lin.add("Xoami");
		System.out.println("Before using set method");
		System.out.println(Lin);
		//set method to add an element at particular 
		Lin.set(0, "Oppo");
		Lin.set(3, "lenovo");
		System.out.println("After using set method");
		System.out.println(Lin);
		//get method is used to get the index of an element
		System.out.println("Element at the index 3 is "+Lin.get(3));
		System.out.println("Element at the index 2 is "+Lin.get(2));
		
		

	}

}
