package arrays;

public class TwoD {

	public static void main(String[] args) {
		// two dimensional array
		/*data type [][] array_name = {{},{}}; or{{}
												{}
												{}};*/
		int[][] twoD = {{1,2,3,4},{5,6,7}};
		System.out.println("The Two Dimensional Array is : ");
		System.out.print("[ ");
		// to access the two dimensional array we must use two for loops
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD.length; j++) {
				System.out.print(twoD[i][j]+" ");
			}
		}
		System.out.println(" ]");
	}

}
