public class Guard extends Human{

//declare properties

private int strength;

//zero-argument constructor - default values

public Guard(){

	this.strength = 1;
}
//loaded constructor

	public Guard(int strength){
	this.strength = strenght;
	}
	
	//getters and setters
	
	public int getStrength(){
	return this.strength;
}

	public void setStrength(int strength){
	this.strength = strength;
}
//toString method - prints out info about the object

public String toString(){
	return "Strength: " + this.strength;

}
}