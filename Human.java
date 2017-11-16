/*
Author: Benjy R-R
Last Modified 11/2/2017
*/

public class Human{

//declare properties

private int age;
private String sex;

//constructor
//zero-argument constructor - default values

public Human(){
	this.age = 1;
	this.sex = "male";

}
//loaded constructor
public Human(int age, String sex){
	this.age = age;
	this.sex = sex;
}

//mutators - getters and setters of properties

public int getAge(){
	return this.age;
}

public void setAge(int age){
	this.age = age;
}

public String getSexl(){
	return this.sex;
}

public void setAggressionLevel(String sex){
	this.sex = sex;
}
//toString method - prints out info about the object

public String toString(){
	return "Age: " + this.age + "Sex: " + this.sex;

}

}