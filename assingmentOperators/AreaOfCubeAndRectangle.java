package assingmentOperators;
import java.util.Scanner;
public class AreaOfCubeAndRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Edge of the cube");
		//takes the edge  of the cube from the user
		double edge = sc.nextDouble();
		System.out.println("Enter the Length of the rectangle");
		//takes the length of the rectangle
		double length = sc.nextDouble();
		System.out.println("Enter the Width of the rectangle");
		//takes the width of the rectangle
		double width = sc.nextDouble();
		double cubeArea = 6*edge*edge;
		//area of the cube 
		double rectangleArea = length*width;
		//area of the rectangle
		System.out.println("Area of the Cube is "+cubeArea);
		System.out.println("Area of the Rectangle is "+rectangleArea);

	}

}
