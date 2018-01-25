public class Guard extends Human{

//declare properties
private int health;

//zero-argument constructor - default values
public Guard(){

	this.health = 1;
}

//loaded constructor
	public Guard(int health){
	this.health = strenght;
	}
	
	//getters and setters
	public int gethealth(){
	return this.health;
	}

	public void sethealth(int health){
	this.health = health;
	}

//toString method - prints out info about the object
public String toString(){
	return "health: " + this.health;

	}
}