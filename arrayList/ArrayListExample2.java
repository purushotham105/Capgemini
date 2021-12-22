package arrayList;

import java.util.*;
//add method
//remove method
//contains method
public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<String>();
		//adding the elements dynamically
		Scanner sc = new Scanner (System.in);
			System.out.println("Enter the no. of elements to be entered ");
			int n = sc.nextInt();
			for (int i = 0; i <n; i++) {
				System.out.println("Enter the name at index "+i);
				//add method to add the elements to the list
				Names.add(sc.next());
			}
			
			//System.out.println(Names);
		System.out.println("Do you want to remove the name : true or false ");
		boolean b =sc.nextBoolean(); 
		if(b) {
			System.out.println("Enter the name to  delete ");
			//remove() method used to delete the object from the list
			String s = sc.next();
			//contains method to remove the object from the list
			if(Names.contains(s)) {
				Names.remove(s);
			}
			else {
				System.out.println("Invalid name ");
			}
		}
		 System.out.println(Names);
		
		 sc.close();
		
	}

}
