/**
Author: Benjy
Last Modified: 9/28/17
*/

public class Person{
	
	// declare attributes of object
	private String name;
	private int age;
	private String gender;
	
	//zero argument constructor
	public Person(){
		this.age = 1;
	}
	
	//loaded constructor
	public Person(String name, int age, String gender){
	this.name = name;
	this. age = age;
	this.gender = gender;
	}
	
	//getters and setters
	
	public String getName(){
	return this.name;
	}
	
	public void setName(String name){
	this.name = name;
	}
	
	public int getAge(){
	return this.age;
	}
	
	public void setAge(int age){
	this.age = age;
	}
	
	public String getGender(){
	return this.gender;
	}
	
	public void setGender(String gender){
	this.gender = gender;
	}
}