package linkedList;

import java.util.LinkedList;

public class AddingAtFirstAndLast {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		//addFirst method to add at the first index
		list.addFirst(10);
		System.out.println("10 is added at the first index");
		System.out.println(list);
		//addLast method to add at the last index
		list.addLast(16);
		System.out.println("16 is added at the last index");
		System.out.println(list);
		
	}

}
