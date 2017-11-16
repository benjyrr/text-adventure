/*
Author: Benjy R-R
Last Modified 09/14/2017
This class runs the start of the program.
*/

public class Menu{
	
	public Menu(){
		//zero-argument constructor - empty for now
	}
	
	//menu selection
	public void selection(int option){
	
		switch(option){
		
		case 1: 
			System.out.println("You wake up in your cell. The guards let you out for roll call and then breakfast. Time to gather anything you can use to escape.");
			break;
			
		case 2:
			//put option 2 here
			break;
			
			default:
			//put default here
			break;
		}
	}

	//draws the menu
	public void drawMenu(){
		System.out.println("Menu");
		System.out.println("1 - Play");
		System.out.println("2 - Quit");
		System.out.println("Choose an option.");
	}
}