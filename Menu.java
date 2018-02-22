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
			System.out.println("You wake up in a cold, dark, metal box. It's a jail! You don't want to be here; time to pick up a weapon you can use to escape. Will you choose a X or a Y?");
			break;
			
		case 2:
			//put option 2 here
			break;
		default:
			break;
			
			//put default here
			
		}
	}

	//draws the menu
	public void drawMenu(){
		System.out.println("1 - Play");
		System.out.println("2 - Quit");
	}
}