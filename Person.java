/**
Author: Benjy
Last Modified: 9/28/17
*/

public class Person{
	
	// declare attributes of object
	private String name;
	
	// zero argument constructor
    public Person(){
    	this.name=Joe;
    }
	
	// loaded constructor
	public Person(String name){
		this.name = name;
	}
	
	// getters and setters
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}