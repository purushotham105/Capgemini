package linkedList;

import java.util.LinkedList;

public class AccessElementsByIndex {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Dot Net");
		list.add("Python");
		System.out.println("Elements in the list are "+list);
		//get method to access the element at particular index
		System.out.println("Element at the 2nd index is ==> "+list.get(2));
		System.out.println("Elements at the 4th index is ==> "+list.get(4));
		
	}

}
