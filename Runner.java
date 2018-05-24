/*
Author: Benjy R-R
Last Modified 11/2/2017
This class runs the start of the program.
*/

import java.util.Scanner;
import java.lang.*;

public class Runner{
	
	//testing with main
	public static void main(String[] args){
	
		//declare variables
		Menu menu = new Menu();//declare Menu object
		Scanner input = new Scanner(System.in);//set up user input
		String answer = "";
		int option; //will hold user input for menu option
		Splash splash = new Splash();
		Story story = new Story();
		
			//display spalsh opening splash screen
			splash.splashScreen();

			//draw menu
			menu.drawMenu();
			
			//get user input
			option = input.nextInt();

			//pick menu option
			menu.selection(option);

			answer = input.next();

			System.out.println("Your answer is correct.");
			
			//continues story
			pause(13000);
			
			story.readFile("Story2.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			pause(18000);

			story.readFile("Story3.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			pause(13000);

			story.readFile("Story4.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			pause(13000);

			story.readFile("Story5.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			pause(18000);

			story.readFile("Story6.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			pause(8000);

			story.readFile("Story7.txt");

			answer = input.next();

			System.out.println("Your answer is correct.");

			//call Game Over spash screen
			splash.splashScreen2();
	}

	//continues the story
	public static void pause(int length){

		try{
			Thread.sleep(length);	
			}

		catch (Exception e){
			System.out.println(e);
			}
	}
}