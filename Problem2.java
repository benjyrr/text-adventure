/*
Author: Benjy R-R
Last Modified: 4/12/18
Problem #2
*/
//Let's me use already created java code
import java.util.Scanner;

//class name
public class Problem2{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		// User input for the matrix size
		System.out.println("Enter a number");
		int n = input.nextInt();
		printMatrix(n);

	}

	public static void printMatrix(int n){

		//makes the matrix
		for(int i = 0; i < n; i++){

		for(int j = 0; j < n; j++){
			//Gives the random 1s and 0s
			System.out.print((int)(Math.random() * 2) + " ");
		}
		System.out.println();
		}

	}	
}