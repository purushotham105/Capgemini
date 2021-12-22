package arrayList;

import java.util.ArrayList;

public class ArrayListExample5 {
	public static void main(String[] args) {
		ArrayList<Integer> List_One = new ArrayList<Integer>();
		List_One.add(20);//0
		List_One.add(21);//1
		List_One.add(23);//2
		List_One.add(24);//3
		List_One.add(25);//4
		List_One.add(26);//5
		System.out.println("Before adding elements");
		System.out.println(List_One);
		
		//add element at particular index
		List_One.add(2, 22);
		List_One.add(6,27);
		System.out.println("After adding elements");
		System.out.println(List_One);
	}

}
