package arrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> Details = new ArrayList<String>();
		//add method for adding details
		Details.add("Suresh");
		Details.add("MCV College");
		Details.add("Bangalore");
		
		//is empty method to check the list is empty or not
		if (!Details.isEmpty()) {
			System.out.println("The elements in list are: "+Details);	
		}
		else
			System.out.println("Please add elements to the list ");
		
			
	}

}
