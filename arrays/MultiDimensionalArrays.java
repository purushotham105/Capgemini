package arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int [][][] threeD = {
				{{1,2},{3}},
				{{4,5,6}},
				{{7,8},{9,10},{11,12}}};
	// to access multi dimensional array we must number of loops depending on the dimension of array
	// since it is 3D array we must use three for loops following A=B=C ===>A=B==>B=C===>C=A.
		System.out.print("threeD = ");
		System.out.print(" [ ");
		
		  for (int[][] twoD : threeD) { 
			  for(int[] oneD: twoD) { 
				  for(int final_Array:oneD) { 
					  System.out.print(final_Array+" ");
					  } 
				  } 
			  }
		 
		//System.out.println(" ]");
	//using for loop
	/*
	 * for (int i = 0; i < threeD.length; i++) { for (int j = 0; j <
	 * threeD[i].length; j++) { for (int j2 = 0; j2 < threeD[i][j].length; j2++) {
	 * System.out.print(threeD[i][j][j2]+" "); } } } System.out.print(" ]");
	 */
	}

}
