/*
Author: Benjy R-R
Last Modified 11/2/2017
This class runs the start of the program.
*/

import java.util.Scanner;

public class Runner{
	
	//testing with main
	public static void main(String[] args){
	
		//declare variables
		Menu menu = new Menu();//declare Menu object
		Scanner input = new Scanner(System.in);//set up user input
		int option; //will hold user input for menu option
		Splash splash = new Splash();
		
			//display spalsh opening splash screen
			splash.splashScreen();

			//draw menu
			menu.drawMenu();
			
			//get user input
			option = input.nextInt();

			//pick menu option
			menu.selection(option);

			//call Game Over spash screen
			splash.splashScreen2();
	}
}