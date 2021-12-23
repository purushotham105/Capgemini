package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAddElements {

	public static void main(String[] args) {
	  //create hash map with key and values
		HashMap<Integer,String> Hmap = new HashMap<Integer,String>();
		Hmap.put(0, "FirstElement");
		Hmap.put(1, "SecondElement");
		Hmap.put(2, "ThirdElement");
		Hmap.put(3, "FourthElement");
		//using iterator
		//entrySet method to get the element 
		/*
		 * Set Value = Hmap.entrySet(); Iterator itr = Value.iterator();
		 * while(itr.hasNext()) { Map.Entry Mentry = (Map.Entry)itr.next();
		 * System.out.println("Key of the element is: "+Mentry.getKey());
		 * System.out.println("Value of the Element is: "+Mentry.getValue()); }
		 */
		//get() method to get the value 
		System.out.println("value at the 2 index is: "+Hmap.get(2));
		//remove()method to remove the element
		Hmap.remove(3);
		System.out.println("HashMap after removing the element at index 3: "+Hmap);
		//clear() to delete all the elements 
		Hmap.clear();
		System.out.println("After removing all the elements form the Hashmap :"+Hmap);
		}

}
