package arrayList;
import java.util.*;

public class ArrayListExample3  {

	public static void main(String[] args) {
		
		ArrayList<Student> Details = new ArrayList<Student>();
		//creating new object to initialize and adding the elements in single step
		Details.add(new Student("Suresh",10,65));
		Details.add(new Student("Mahesh",11,98));
		Details.add(new Student("Monish",12,46));
		Details.add(new Student("Somesh",13,32));
		// advance for loop
		for (int i = 0; i < Details.size(); i++) {
			System.out.println(Details.get(i));
			
		}
		//ascending order based on marks
		//System.out.println("===========After arranging in the ascending order of marks==================");
		//Collections.sort(Details);
		//System.out.println(Details);
		
		//descending order based on marks
		System.out.println("============After arranging in the descending order of marks================");
		Collections.sort(Details);
		//for each loop
		for(Student info : Details) {
		System.out.println(info);
		}
	}
}
