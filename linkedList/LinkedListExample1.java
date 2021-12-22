package linkedList;

import java.util.LinkedList;
//adding elements into the linked list using first and last method
public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hi");//0
		list.add("Hello");//1
		list.add("My name is ");//2
		System.out.println("Before adding elements into the linked list");
		System.out.println(list);
		list.addLast("Bye");
		list.add(3, "Mahesh");
		//this element is added at index 3
		System.out.println("Afetr adding the elements into the linked list");
		System.out.println(list);
	}

}
