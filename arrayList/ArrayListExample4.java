package arrayList;
//copying one array list into another array list
import java.util.*;
public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<Integer> List_One = new ArrayList<Integer>();
		List_One.add(11);//0
		List_One.add(12);//1
		List_One.add(13);//2
		List_One.add(14);//3
		List_One.add(15);//4
		//array list 1 before copying
		System.out.println("ArrayList 1");
		System.out.println(List_One);
		
		ArrayList<Integer> List_two= new ArrayList<Integer>();
		List_two.add(16);//0
		List_two.add(17);//1
		List_two.add(18);//2
		List_two.add(19);//3
		List_two.add(20);//4
		// array list 2 before copying
		System.out.println("ArrayList 2");
		System.out.println(List_two);
		//addAll() method at index and object to be added
		/*
		 * List_One.addAll(5, List_two);
		 * System.out.println("Adding the list2 into list 1");
		 * System.out.println(List_One);
		 */
		System.out.println("Adding the list1 into the list2");
		List_two.addAll(0, List_One);
		System.out.println(List_two);
	}

}
