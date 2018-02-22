/*
Author: Benjy R-R
Last Modified 11/2/2017
This class runs the start of the program.
*/

import java.util.Scanner;

public class Runner{
	
	//testing with main
	public static void main(String[] args){
	
		//declare Menu object
		Menu menu = new Menu();
		
		//set up user input
		Scanner input = new Scanner(System.in);
		int option; //will hold user input for menu option
		
		//loop through menu until user enters 2 (for quitting)
		do{

		Splash splash = new Splash();
		splash.splashScreen();

		//draw menu
		menu.drawMenu();
		
		//get user input
		option = input.nextInt();
		menu.selection(option);
		
		}

		while(option != 2);
		
		//call splash object
		Splash splash = new Splash();

		//call spash screen
		splash.splashScreen2();
	
		//while option (option != 1);
		// get rid of splashscreen and menu here
		//continue story
	}
}