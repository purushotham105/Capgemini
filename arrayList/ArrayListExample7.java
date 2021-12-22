package arrayList;

import java.util.ArrayList;
//comparing two array lists
public class ArrayListExample7 {

	public static void main(String[] args) {
		ArrayList<String> Fruits = new ArrayList<String>();
		System.out.println("Fruits list 1");
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Mango");
		Fruits.add("Promogrante");
		Fruits.add("Papaya");
		System.out.println(Fruits);
		System.out.println("Fruits list 2");
		ArrayList<String> Fruits_one = new ArrayList<String>();
		Fruits_one.add("Apple");
		Fruits_one.add("Banana");
		Fruits_one.add("Mango");
		Fruits_one.add("Promogrante");
		Fruits_one.add("Papaya");
		System.out.println(Fruits_one);
		
		ArrayList<String> Box = new ArrayList<String>();
		for(String temp :Fruits ) {
			if(Fruits_one.contains(temp)) {
				Box.add(temp);
			}
		}
		System.out.println("List is compared and added ");
		System.out.println(Box);
		
	}

}
