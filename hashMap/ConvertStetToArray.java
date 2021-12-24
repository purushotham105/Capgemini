package hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertStetToArray {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		//add() method
		hset.add("1st element");
		hset.add("2nd element");
		hset.add("3rd element");
		hset.add("4th element");
		hset.add("5th element");
		//Printing the elements
		System.out.println(hset);
		//lets convert set to array
		String[] array = new String[hset.size()];
		//declaring size of the array using size method
		List<String> list = new ArrayList<String>(hset);
		//adding hset elements into the list
		list.toArray(array);
		//adding elements into the array
		//for each loop to access the elements
		System.out.println("Converted elements into the array are ");
		for(String elements : array)
		{
			System.out.println(elements);
		}
	}

}
