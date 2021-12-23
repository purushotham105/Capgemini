package linkedList;

import java.util.LinkedList;
import java.util.List;

public class Sublist {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Promogranate");
		System.out.println("Elements in the Original list are "+fruits);
		
		//create another list for sublist of fruits list 
		//sublist() method from index to to index
		List<String> SubList = fruits.subList(2, 5);
		System.out.println("Sublist of the Original list are "+SubList);
		
	}

}
