public class Items{

	//declare properties
	private int value;

	//zero-argument constructor - default values
	public Items(){
		this.value = 1;

	}
	//loaded constructor
	public Items(int value){
		this.value = value;
	}

	//mutators - getters and setters of properties
	public int getValue(){
		return this.value;
	}

	public void setValue(int value){
		this.value = value;
	}

	//toString method - prints out info about the object
	public String toString(){
		return "Value: " + this.value;

	}
}