package arrayList;
import java.util.*;

public class ArrayListExample6 {
//synchronized method
	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Amar");//0
		Names.add("Babar");//1
		Names.add("chandu");//2
		Names.add("Deepak");//3
		Names.add("Elon Musk");//4
		System.out.println("Iterating sysnchronization");
		
		synchronized (Names) {
			//using iterator
			Iterator<String> itr = Names.iterator();
			//checking itr has next element
			while(itr.hasNext()) {
				//printing elements one after another
				System.out.println(itr.next());
			}
		}

	}

}
