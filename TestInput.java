/*
Test string manipulation and user input validation
*/
import java.util.Scanner; //import for user input
public class TestInput{

	//main method
	public static void main(String[] args){

		//instantiate Scanner ob=ject to get user input
		Scanner input = new Scanner(System.in);
		String userName = "";
		int letterCount = 0;
		int numberCount = 0;


		//instantiate Scanner object to get user input
		Scanner input = new Scanner(System.in);
		String userName = "";

		//prompt the user for userName
		System.out.println("Create a username. Username must be at least 4 characters long with at least 1 number...");

	while(true){
		//get the user response
		userName = input.next();

		//give feedback on what user gave as input
		System.out.println("You chose the username: " + userName);

		//check for userName restrictions
		if(userName.length() >= 4){
			System.out.println("Hi, " + userName);

		}
		else{ //error message
			System.out.println("Username must be at least 4 characters long \n"
						  + "with at least 1 number...");
		   }
		   //check each in character in userName for a number
		   for(int i = 0; i < userName.length(); i++){
		   	//check if the current character is a digit
		   	if(Character.isDigit(userName.charAt(i))){
		   		numberCount++; //numbercount = numbercount + 1;
	   }
	   		//check if the current character is a letter
	   		if(Character.isLetter(userName.charAt(i))){
		   		letterCount++; //numbercount = numbercount + 1;
		    }
	   	 }

	   	 if(numberCount > 0 && letterCount > 2){
	   	 	System.out.println("Your username is valid");
	   	 	break;
	   	 }
	   	 else{
	   	 	System.out.println("Username must be at least 4 characters long with at least 1 number...");
	   	 }
	  }
   }
}