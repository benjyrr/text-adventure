/*
Author: Benjy R-R
Last Modified 11/2/2017
This class runs the start of the program.
*/

public class Runner{
	
	//testing with main
	public static void main(String[] args){
		
		//call splash object
		Splash splash = new Splash();

		//call spash screen
		splash.splashScreen();

		//call splash screen 2
		splash.splashScreen2();
		
		Person me = new Person("me", 28, "male");
	
		me.setName("Me");
		me.setAge(28);
		me.setGender("Male");
	
		System.out.println("Name of person: " + me.getName());
		System.out.println("Age of person: " + me.getAge());
		System.out.println("Sex of person: " + me.getGender());
	
	}
}